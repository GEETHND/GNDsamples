Imports System.Data
Imports System.Data.SqlClient
Imports System.Drawing


Public Class Form_MovieDetails
    Dim conn As New SqlConnection
    Dim command As New SqlCommand
    Dim flag As Boolean = False

    Private Sub count()
        Dim records, current As Integer
        records = Me.BindingContext(DsAddMov11, "Movie").Count
        MsgBox(records.ToString)
        current = Me.BindingContext(DsAddMov11, "Movie").Count + 1

        tMovieId.Text = current.ToString
    End Sub
    Private Sub bBack_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bBack.Click
        Me.Visible = False
        ViewMovie.Visible = True
    End Sub

    Private Sub bAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bAdd.Click
        Dim year As String = tYearRelease.Text
        Dim i As Integer = Convert.ToInt32(year)

        Dim id As String = tDvdId.Text
        Dim j As Integer = Convert.ToInt32(id)

        Dim row As DSAddMov1.MovieRow
        row = DsAddMov11.Movie.NewMovieRow

        row.DVD_Id = (id)
        row.Title = (tTitle.Text)
        row.Director = (tDirector.Text)
        row.Actor1 = (tCast1.Text)
        row.Actor2 = (tCast2.Text)
        row.Genre = (tGenre.Text)
        row.Rating = (tRating.Text)
        row.Release_year = (i)
        row.Language = (tLanguage.Text)
        row.Poster = (tPoster.Text)
        row.Duration = (tDuration.Text)

        'My.Computer.FileSystem.CreateDirectory("D:\VB apps\DVD STORE\img")
        'PictureBox1.Image.Save("D:\VB apps\DVD STORE\img\" & tMovieId.Text.ToString & ".jpeg")
        My.Computer.FileSystem.CreateDirectory("D:\VB apps\DVD STORE\img")
        PictureBox2.Image.Save("D:\VB apps\DVD STORE\img\" & tMovieId.Text & ".jpeg")
       
        Try
            DsAddMov11.Movie.Rows.Add(row)
            DAAddMov1.Update(DsAddMov11)
            MsgBox("Successfully Added")
            Me.Visible = False
            ViewMovie.Visible = True

        Catch ex As Exception
            MsgBox("error")
        End Try
    End Sub

    Private Sub tPoster_Click(ByVal sender As Object, ByVal e As System.EventArgs)
        ' MovPoster.Filter = "Bitmaps(*.bmp)|*.jpg"
        'If MovPoster.ShowDialog() = DialogResult.OK Then
        'PictureBox2.Image = System.Drawing.Image.FromFile _
        '(MovPoster.FileName)
        ''tPoster.Text = MovPoster.FileName
        'End If

        'If OpenFileDialog1.ShowDialog() = DialogResult.OK Then
        'PictureBox2.Image = Image.FromFile(OpenFileDialog1.FileName)
        'End If
    End Sub

    Private Sub Form_MovieDetails_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        DALoadDVDid1.Fill(DsLoadDVDId11)
        'DALoadDVD2.Fill(DsLoadDVD31)

        Dim cmdString As String = "SELECT MAX(Movie_Id) FROM Movie"

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

            While queryResult.Read()
                'MsgBox(queryResult.GetValue(0))
                tMovieId.Text = queryResult.GetValue(0) + 1
                flag = True
            End While

            If flag Then
                ' MsgBox("Successfully log on.")
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

    Private Sub tMovieId_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles tMovieId.TextChanged

    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnImg.Click
        If OpenFileDialog1.ShowDialog() = DialogResult.OK Then
            PictureBox2.Image = Image.FromFile(OpenFileDialog1.FileName)
        End If

    End Sub
End Class