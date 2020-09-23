Public Class Admin_View
    Private Sub bCustomerDetails_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bCustomerDetails.Click
        ViewCust.Visible = True
    End Sub

    Private Sub bMovieDetails_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bMovieDetails.Click
        ViewMovie.Visible = True
    End Sub

    Private Sub bDvdCopy_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bDvdCopy.Click
        DVDView.Visible = True
    End Sub

    Private Sub bDvdCopyIssue_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bDvdCopyIssue.Click
        Form_DvdCopyIssue.Visible = True
    End Sub

    Private Sub bReturningDetails_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bReturningDetails.Click
        Form_Returning.Visible = True
    End Sub

    Private Sub bFine_Click(ByVal sender As System.Object, ByVal e As System.EventArgs)
        Form_Fine.Visible = True
    End Sub

    Private Sub Form_dvd_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Employee.Visible = True
    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs)
        Login.Visible = True
    End Sub

    Private Sub Button2_Click_1(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        Me.Visible = False
        Form_HomePage.Visible = True
    End Sub
End Class