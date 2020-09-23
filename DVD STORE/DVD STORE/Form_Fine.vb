Public Class Form_Fine

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs)
        Me.Visible = False
        Form_Returning.Enabled = True
    End Sub

    Private Sub Form_Fine_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        DAFine1.Fill(DsFine11)
    End Sub


    Private Sub Button2_Click_1(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        Me.Visible = False
        Form_Returning.Visible = True
    End Sub

    Private Sub btnCalcFine_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCalcFine.Click
        'tDelayDate.Text = dtpCurrentDate.Value.DayOfYear - dtpDueDate.Value.DayOfYear
        'tFine.Text = 5 * tDelayDate.Text & ".00"
        Dim dueDate As New System.DateTime(dtpDueDate.Value.Year, dtpDueDate.Value.Month, dtpDueDate.Value.Day)
        Dim currentDate As New System.DateTime(dtpCurrentDate.Value.Year, dtpCurrentDate.Value.Month, dtpCurrentDate.Value.Day)
        'Dim diff As System.TimeSpan
        MsgBox(currentDate.Subtract(dueDate).TotalDays.ToString)
        'If (currentDate.Subtract(dueDate).TotalDays.ToString > 0) Then
        tDelayDate.Text = currentDate.Subtract(dueDate).TotalDays.ToString
        'diff = currentDate.Subtract(dueDate)
        'tDelayDate.Text = diff
        tFine.Text = 5.0 * tDelayDate.Text
    End Sub
End Class