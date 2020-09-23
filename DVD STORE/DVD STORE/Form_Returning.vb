Imports System.Data
Imports System.Data.SqlClient
Imports System.Drawing
Public Class Form_Returning
    Dim conn As New SqlConnection
    Dim command As New SqlCommand
    Dim flag As Boolean = False


    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Me.Visible = False
    End Sub

   

    Private Sub btnFine_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnFine.Click
        'Form_Fine.Visible = True
        'Me.Enabled = False
        GroupBox1.Visible = True
    End Sub

    Private Sub tDvdCopyNumber_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles tDvdCopyNumber.SelectedIndexChanged
        ' Dim cmdString As String = "SELECT Customer_Id,Due_date FROM Rental WHERE DVD_Id='" & tDvdCopyNumber.Text & "' and Returned_date <> null"
        Dim cmdString As String = "SELECT Customer_Id,Due_date FROM Rental WHERE DVD_Id='" & tDvdCopyNumber.Text & "'"
        Try
            conn = New SqlConnection("Data Source=hp-pc;Initial Catalog=F5;Integrated Security=True; User ID=Admin;Password=admin;")
            conn.Open()


        Catch ex As SqlException
            MsgBox("Connection is not established.", MsgBoxStyle.Critical)

        Catch ex2 As Exception
            ' MsgBox(ex2.ToString)
        End Try

        Try
            command = New SqlCommand(cmdString, conn)
            Dim queryResult As SqlDataReader = command.ExecuteReader

            While queryResult.Read()
                '   MsgBox(queryResult.GetValue(0))
                tCustomerId.Text = queryResult.GetValue(0)
                tDueDate.Text = queryResult.GetValue(1)
                flag = True
            End While

            If flag Then
                '  MsgBox("Successfully log on.")
                flag = False
            Else
                '  MsgBox("User name or password mismatch.")
            End If
            conn.Close()
        Catch ex As SqlException
            MsgBox(ex.Message.ToString())
            MsgBox("error")
        End Try
    End Sub

    Private Sub Form_Returning_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        DARetDVD1.Fill(DsRetDVD11)
    End Sub

    Private Sub btnCalcFine_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCalcFine.Click
        
        Dim dueDate As New System.DateTime(dtpDueDate.Value.Year, dtpDueDate.Value.Month, dtpDueDate.Value.Day)
        Dim currentDate As New System.DateTime(dtpCurrentDate.Value.Year, dtpCurrentDate.Value.Month, dtpCurrentDate.Value.Day)
        'Dim diff As System.TimeSpan
        'MsgBox(currentDate.Subtract(dueDate).TotalDays.ToString)
        tDelayDate.Text = currentDate.Subtract(dueDate).TotalDays.ToString
        'diff = currentDate.Subtract(dueDate)
        'tDelayDate.Text = diff
        tFine.Text = 5.0 * tDelayDate.Text
    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        Dim d As Date = Convert.ToDateTime(tRetDate.Text)
        Dim f As Integer = Convert.ToInt32(tDelayDate.Text * 5)

        Dim cmdString As String = "Update Rental set Returned_date='" & d & "', Fine_payment='" & f & "' WHERE DVD_Id='" & tDvdCopyNumber.Text & "'"
        Try
            conn = New SqlConnection("Data Source=hp-pc;Initial Catalog=F5;Integrated Security=True; User ID=Admin;Password=admin;")
            conn.Open()


        Catch ex As SqlException
            MsgBox("Connection is not established.", MsgBoxStyle.Critical)

        Catch ex2 As Exception
            'MsgBox(ex2.ToString)
        End Try

        Try
            command = New SqlCommand(cmdString, conn)
            Dim queryResult As SqlDataReader = command.ExecuteReader

            While queryResult.Read
                '   MsgBox(queryResult.GetValue(0))
                'tCustomerId.Text = queryResult.GetValue(0)
                'tDueDate.Text = queryResult.GetValue(1)
                flag = True
            End While

            If flag Then
                ' MsgBox("Successfully log on.")
                flag = False
            Else
                'MsgBox("User name or password mismatch.")
            End If
            conn.Close()
            MsgBox("Successfully Updated")
        Catch ex As SqlException
            MsgBox(ex.Message.ToString())
            MsgBox("error")
        End Try
    End Sub
End Class