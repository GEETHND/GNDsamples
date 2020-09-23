Public Class DVDView

    Private Sub bBack_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bBack.Click
        Me.Visible = False
    End Sub

    Private Sub bAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bAdd.Click
        Me.Visible = False
        DVDStorage.Visible = True
    End Sub

    Private Sub bUpdate_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bUpdate.Click
        Try
            DAViewDVD1.Update(DsdvdView11)
            MsgBox("Successfully Updated")
        Catch ex As Exception
            MsgBox(ex.ToString)
        End Try
    End Sub

    Private Sub DVDView_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        DsdvdView11.Clear()
        DAViewDVD1.Fill(DsdvdView11)
    End Sub
End Class