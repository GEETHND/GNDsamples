Public Class ViewCust

    Private Sub ViewCust_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        DsViewCust11.Clear()
        DAViewCust1.Fill(DsViewCust11)
    End Sub

    Private Sub bAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bAdd.Click
        Form_CustomerDetail.Visible = True
        Me.Visible = False
    End Sub

    Private Sub bUpdate_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bUpdate.Click
        Try
            DAViewCust1.Update(DsViewCust11)

        Catch ex As Exception
            MsgBox(ex.ToString)
        End Try
    End Sub

    Private Sub bBack_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bBack.Click
        Me.Visible = False
    End Sub
End Class