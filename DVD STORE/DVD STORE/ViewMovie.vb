Public Class ViewMovie

    Private Sub bUpdate_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bUpdate.Click
        Try
            DAViewMov1.Update(DsViewMov11)
            MsgBox("Successfully Updated")
        Catch ex As Exception
            MsgBox(ex.ToString)
        End Try
        Me.Visible = False
    End Sub

    Private Sub ViewMovie_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        DsViewMov11.Clear()
        DAViewMov1.Fill(DsViewMov11)
    End Sub

    Private Sub bAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bAdd.Click
        Me.Visible = False
        Form_MovieDetails.Visible = True
    End Sub

    Private Sub bBack_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bBack.Click
        Me.Visible = False
    End Sub
End Class