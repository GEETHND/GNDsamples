Imports System
Imports System.Security
Imports System.Security.Cryptography
Imports System.Text

Public Class Login

    Private Sub bAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bAdd.Click

        'Dim userName As String
        'Dim password As String

        'Dim arr1() As Byte
        'Dim arr1Hash() As Byte

        'userName = tUserName.Text
        'password = maskTPass.Text
        'arr1 = ASCIIEncoding.ASCII.GetBytes(password) 'md5 algorythm need to input byte array to hashing
        'arr1Hash = New MD5CryptoServiceProvider().ComputeHash(arr1) 'Compute hash based on source data.
        'Dim i As Integer = Convert.ToInt32(tUserName.Text)
        ' Dim dbRef As New DBlog
        'dbRef.checkLogin(i, maskTPass.Text)

        If tUserName.Text = "Admin" Then
            If maskTPass.Text = "admin" Then
                Admin_View.Visible = True
                Me.Visible = False
            Else
                MsgBox("Incorrect Data")
            End If
        Else
            MsgBox("Incorrect Data")
        End If
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

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs)
        Form_HomePage.Visible = True
        Me.Visible = False
    End Sub

    Private Sub bDvdCopy_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bDvdCopy.Click
        Me.Visible = False
        Form_HomePage.Visible = True
    End Sub
End Class