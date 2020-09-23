Imports System.Data
Imports System.Data.SqlClient
Imports System.Drawing
Public Class MovieSearch
    Dim conn As New SqlConnection
    Dim command As New SqlCommand
    Dim flag As Boolean = False

    Private Sub MovieSearch_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        DASrchTitle1.Fill(DsSrchTitle11)
        'Label1.Visible = False
        'cmbTitle.Visible = False
    End Sub

    Private Sub ComboBox1_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles cmbTitle.SelectedIndexChanged
        Dim cmdString As String = "SELECT * FROM Movie WHERE Title='" & cmbTitle.Text & "'"
        Try
            conn = New SqlConnection("Data Source=hp-pc;Initial Catalog=F5;Integrated Security=True; User ID=Admin;Password=admin;")
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
                lblMId.Text = queryResult.GetValue(0)
                lblDvdId.Text = queryResult.GetValue(1)
                lblTitle.Text = queryResult.GetValue(2)
                lblDir.Text = queryResult.GetValue(3)
                lblActor.Text = queryResult.GetValue(4) & "," & queryResult.GetValue(5)
                lblLang.Text = queryResult.GetValue(6)
                lblRating.Text = queryResult.GetValue(7)
                lblGenre.Text = queryResult.GetValue(8)
                lblRelYr.Text = queryResult.GetValue(9)

                flag = True
            End While

            If flag Then
                'MsgBox("Successfully log on.")
                flag = False
            Else
                MsgBox("User name or password mismatch.")
            End If
            conn.Close()
        Catch ex As SqlException
            MsgBox(ex.Message.ToString())
            MsgBox("error")
        End Try

        Dim load As String = "D:\VB apps\DVD STORE\img\" & lblMId.Text & ".jpeg"
        poster.Load(load)
    End Sub

    Private Sub ComboBox1_SelectedIndexChanged_1(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ComboBox1.SelectedIndexChanged
        Select Case ComboBox1.SelectedIndex
            Case 0
                Label1.Visible = True
                cmbTitle.Visible = True
            Case 1
                Label2.Visible = True
                cmbDir.Visible = True
            Case 2
                Label13.Visible = True
                cmbRelYr.Visible = True
            Case 3
                Label1.Visible = True
                cmbTitle.Visible = True

        End Select
    End Sub

    Private Sub bDvdCopy_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bDvdCopy.Click
        Me.Visible = False
        Form_HomePage.Visible = True
    End Sub
End Class