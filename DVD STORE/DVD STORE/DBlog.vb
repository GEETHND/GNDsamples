
Imports System.Data
Imports System.Data.SqlClient
Public Class DBlog


    Dim conn As New SqlConnection
    Dim command As New SqlCommand
    Dim flag As Boolean = False


    Sub checkLogin(ByVal empid As Integer, ByVal pass As String)
        MsgBox(empid + pass)
        Dim cmdString As String = "SELECT * FROM Employee WHERE emp_id=" + empid + " and " + "Password =" + "'" + pass + "'"

        Try
            ' conn = New SqlConnection("Data Source=hp-pc;Initial Catalog=DvdStore;Integrated Security=True")
            conn = New SqlConnection("Data Source=Hp-Pc;Initial Catalog=F5;Integrated Security=TRUE User ID=Admin;Password=admin;")
            conn.Open()

        Catch ex As SqlException
            MsgBox("Connection is not established.", MsgBoxStyle.Critical)
        End Try

        Try
            command = New SqlCommand(cmdString, conn)
            Dim queryResult As SqlDataReader = command.ExecuteReader

            While queryResult.Read()
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
        Catch e As SqlException
            MsgBox(e.Message.ToString())
            MsgBox("error")
        End Try
    End Sub

    Sub insertValues(ByVal empid As Integer, ByVal pass As String, ByVal name As String, ByVal tel As Integer, ByVal add As String, ByVal des As String)

        Dim cmdString As String = "INSERT INTO Employee VALUES(" + empid + "," + "'" + pass + "'" + "," + "'" + name + "'" + "," + tel + "," + "'" + add + "'" + "," + "'" + des + "')"
        Try
            conn = New SqlConnection("Data Source=hp-pc;Initial Catalog=F5;Integrated Security=True")
            conn.Open()

        Catch ex As SqlException
            MsgBox("Connection is not established.", MsgBoxStyle.Critical)
        End Try

        Try
            command = New SqlCommand(cmdString, conn)
            command.ExecuteNonQuery()
            conn.Close()
            MsgBox("Successfully inserted user name and password.")
        Catch ex As SqlException
            MsgBox(ex.ToString)
            'MsgBox("Can't insert values.")
        End Try
    End Sub
End Class