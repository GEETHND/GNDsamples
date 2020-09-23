Public Class Form_dvd

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

    Private Sub bFine_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bFine.Click
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

    Private Sub PictureBox1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox1.Click

    End Sub
End Class
