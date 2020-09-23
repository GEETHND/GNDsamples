Imports System
Imports System.Security
Imports System.Security.Cryptography
Imports System.Text
Imports System.Data
Imports System.Data.SqlClient

Public Class Add_New_Employee
    Dim conn As New SqlConnection
    Dim command As New SqlCommand
    Dim flag As Boolean = False

    Private Sub bAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bAdd.Click
        'Dim userName As String
        'Dim password As String

        'Dim arr1() As Byte
        ' Dim arr1Hash() As Byte

        'userName = tUserName.Text
        ' password = tPass.Text
        'arr1 = ASCIIEncoding.ASCII.GetBytes(password) 'md5 algorythm need to input byte array to hashing
        'arr1Hash = New MD5CryptoServiceProvider().ComputeHash(arr1) 'Compute hash based on source data.
        Dim dbRef As New DBlog
        Dim tp As Integer = Convert.ToInt32(tTP.Text)
        dbRef.insertValues(tCustomerId.Text, tEmpNmae.Text, tPass.Text, tp, tPAddress.Text, tDesig.Text)
        'dbRef.checkLogin(tEmpNmae.Text, tPass.Text, tTP.Text, tPAddress.Text, tDesig.Text)
        Employee.Visible = True
        Me.Visible = False
    End Sub

    'convert byte array to string using this function
    Private Function ByteArrayToString(ByVal arrInput() As Byte) As String
        Dim i As Integer
        Dim sOutput As New StringBuilder(arrInput.Length)
        For i = 0 To arrInput.Length - 1
            sOutput.Append(arrInput(i).ToString())
        Next
        Return sOutput.ToString()
    End Function

    Private Sub Add_New_Employee_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        Dim cmdString As String = "SELECT MAX(Movie_Id) FROM Movie"

        Try

            ' conn = New SqlConnection("Data Source=hp-pc;Initial Catalog=DvdStore;Integrated Security=True")
            conn = New SqlConnection("Data Source=hp-pc;Initial Catalog=F5;Integrated Security=True; User ID=Admin;Password=admin;")
            'MsgBox("ghffdddddddddddddd")
            conn.Open()


        Catch ex As SqlException
            MsgBox("Connection is not established.", MsgBoxStyle.Critical)

        Catch ex2 As Exception
            MsgBox(ex2.ToString)
        End Try

        Try
            Command = New SqlCommand(cmdString, conn)
            Dim queryResult As SqlDataReader = Command.ExecuteReader

            While queryResult.Read()
                MsgBox(queryResult.GetValue(0))
                tCustomerId.Text = queryResult.GetValue(0) + 1
                'MsgBox(queryResult.GetValue(1))
                flag = True
            End While

            If flag Then
                MsgBox("Successfully log on.")
                flag = False
            Else
                MsgBox("User name or password mismatch.")
            End If
            conn.Close()
        Catch ex As SqlException
            MsgBox(ex.Message.ToString())
            MsgBox("error")
        End Try
    End Sub
End Class