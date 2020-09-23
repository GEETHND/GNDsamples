Imports System.Data
Imports System.Data.SqlClient
Imports System.Drawing

Public Class DVDStorage
    Dim conn As New SqlConnection
    Dim command As New SqlCommand
    Dim flag As Boolean = False

    Private Sub bBack_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bBack.Click
        Me.Visible = False
        DVDView.Visible = True
    End Sub

    Private Sub bAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bAdd.Click
        Dim row As DSAddDVD1.DVDRow
        row = DsAddDVD11.DVD.NewDVDRow

        row.Format = (tformat.Text)
        row.Status = (tStatus.Text)

        Try
            DsAddDVD11.DVD.AddDVDRow(row)
            DAAddDVD1.Update(DsAddDVD11)

            MsgBox("Successfully added!")

            Me.Visible = False
            'DVDView.Visible = True
            Admin_View.Visible = True

        Catch ex As Exception
            MsgBox("Error")
        End Try

    End Sub

    Private Sub DVDStorage_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        Dim cmdString As String = "SELECT MAX(DVD_Id) FROM DVD"

        Try
            conn = New SqlConnection("Data Source=hp-pc;Initial Catalog=F5;Integrated Security=True; User ID=Admin;Password=admin;")
            conn.Open()


        Catch ex As SqlException
            MsgBox("Connection is not established.", MsgBoxStyle.Critical)

        Catch ex2 As Exception
            'MsgBox(ex2.ToString)
        End Try

        Try
            Command = New SqlCommand(cmdString, conn)
            Dim queryResult As SqlDataReader = Command.ExecuteReader

            While queryResult.Read()
                'MsgBox(queryResult.GetValue(0))
                txtDVDId.Text = queryResult.GetValue(0) + 1
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
    End Sub
End Class