<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form_MovieDetails
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form_MovieDetails))
        Me.bBack = New System.Windows.Forms.Button()
        Me.bAdd = New System.Windows.Forms.Button()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.PictureBox2 = New System.Windows.Forms.PictureBox()
        Me.MovieBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.DsAddMov11 = New DVD_STORE.DSAddMov1()
        Me.Label11 = New System.Windows.Forms.Label()
        Me.tLanguage = New System.Windows.Forms.ComboBox()
        Me.MovieBindingSource8 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tRating = New System.Windows.Forms.ComboBox()
        Me.MovieBindingSource6 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tGenre = New System.Windows.Forms.ComboBox()
        Me.MovieBindingSource5 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tDuration = New System.Windows.Forms.TextBox()
        Me.MovieBindingSource10 = New System.Windows.Forms.BindingSource(Me.components)
        Me.Label10 = New System.Windows.Forms.Label()
        Me.MovieBindingSource9 = New System.Windows.Forms.BindingSource(Me.components)
        Me.Label9 = New System.Windows.Forms.Label()
        Me.tYearRelease = New System.Windows.Forms.TextBox()
        Me.MovieBindingSource7 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tCast2 = New System.Windows.Forms.TextBox()
        Me.MovieBindingSource4 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tCast1 = New System.Windows.Forms.TextBox()
        Me.MovieBindingSource3 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tDirector = New System.Windows.Forms.TextBox()
        Me.MovieBindingSource2 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tTitle = New System.Windows.Forms.TextBox()
        Me.MovieBindingSource1 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tMovieId = New System.Windows.Forms.TextBox()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.SqlSelectCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlConnection1 = New System.Data.SqlClient.SqlConnection()
        Me.SqlInsertCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlUpdateCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.DAAddMov1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.MoviePoster = New System.Windows.Forms.OpenFileDialog()
        Me.MovPoster = New System.Windows.Forms.OpenFileDialog()
        Me.OpenFileDialog1 = New System.Windows.Forms.OpenFileDialog()
        Me.btnImg = New System.Windows.Forms.Button()
        Me.tPoster = New System.Windows.Forms.TextBox()
        Me.SqlSelectCommand2 = New System.Data.SqlClient.SqlCommand()
        Me.SqlInsertCommand2 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand2 = New System.Data.SqlClient.SqlCommand()
        Me.DALoadDVDid1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.DsLoadDVDId11 = New DVD_STORE.DSLoadDVDId1()
        Me.tDvdId = New System.Windows.Forms.ComboBox()
        Me.SqlSelectCommand3 = New System.Data.SqlClient.SqlCommand()
        Me.SqlInsertCommand3 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand3 = New System.Data.SqlClient.SqlCommand()
        Me.DALoadDVD2 = New System.Data.SqlClient.SqlDataAdapter()
        Me.DsLoadDVD21 = New DVD_STORE.DSLoadDVD2()
        Me.DsLoadDVD31 = New DVD_STORE.DSLoadDVD3()
        Me.DsLoadDVDtoThis11 = New DVD_STORE.DSLoadDVDtoThis1()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsAddMov11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource8, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource6, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource5, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource10, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource9, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource7, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource4, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource3, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsLoadDVDId11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsLoadDVD21, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsLoadDVD31, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsLoadDVDtoThis11, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'bBack
        '
        Me.bBack.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bBack.Location = New System.Drawing.Point(175, 619)
        Me.bBack.Name = "bBack"
        Me.bBack.Size = New System.Drawing.Size(110, 39)
        Me.bBack.TabIndex = 18
        Me.bBack.Text = " Back"
        Me.bBack.UseVisualStyleBackColor = True
        '
        'bAdd
        '
        Me.bAdd.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bAdd.Location = New System.Drawing.Point(299, 619)
        Me.bAdd.Name = "bAdd"
        Me.bAdd.Size = New System.Drawing.Size(110, 39)
        Me.bAdd.TabIndex = 19
        Me.bAdd.Text = " Add"
        Me.bAdd.UseVisualStyleBackColor = True
        '
        'PictureBox1
        '
        Me.PictureBox1.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Left) _
                    Or System.Windows.Forms.AnchorStyles.Right), System.Windows.Forms.AnchorStyles)
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(0, 0)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(812, 102)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 20
        Me.PictureBox1.TabStop = False
        '
        'PictureBox2
        '
        Me.PictureBox2.Image = CType(resources.GetObject("PictureBox2.Image"), System.Drawing.Image)
        Me.PictureBox2.Location = New System.Drawing.Point(443, 149)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(346, 358)
        Me.PictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox2.TabIndex = 22
        Me.PictureBox2.TabStop = False
        '
        'MovieBindingSource
        '
        Me.MovieBindingSource.DataMember = "Movie"
        Me.MovieBindingSource.DataSource = Me.DsAddMov11
        '
        'DsAddMov11
        '
        Me.DsAddMov11.DataSetName = "DSAddMov1"
        Me.DsAddMov11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'Label11
        '
        Me.Label11.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label11.ForeColor = System.Drawing.SystemColors.Window
        Me.Label11.Location = New System.Drawing.Point(37, 170)
        Me.Label11.Name = "Label11"
        Me.Label11.Size = New System.Drawing.Size(117, 27)
        Me.Label11.TabIndex = 53
        Me.Label11.Text = "DVD Id"
        '
        'tLanguage
        '
        Me.tLanguage.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.MovieBindingSource8, "Language", True))
        Me.tLanguage.FormattingEnabled = True
        Me.tLanguage.Items.AddRange(New Object() {"English", "Hindi", "Sinhala", "Tamil", "Korean", "Other"})
        Me.tLanguage.Location = New System.Drawing.Point(163, 496)
        Me.tLanguage.Name = "tLanguage"
        Me.tLanguage.Size = New System.Drawing.Size(231, 23)
        Me.tLanguage.TabIndex = 52
        Me.tLanguage.Text = "Other"
        '
        'MovieBindingSource8
        '
        Me.MovieBindingSource8.DataMember = "Movie"
        Me.MovieBindingSource8.DataSource = Me.DsAddMov11
        '
        'tRating
        '
        Me.tRating.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.MovieBindingSource6, "Rating", True))
        Me.tRating.FormattingEnabled = True
        Me.tRating.Items.AddRange(New Object() {"PG", "PG-13", "R", "NC-17", "Unrated"})
        Me.tRating.Location = New System.Drawing.Point(160, 406)
        Me.tRating.Name = "tRating"
        Me.tRating.Size = New System.Drawing.Size(234, 23)
        Me.tRating.TabIndex = 51
        '
        'MovieBindingSource6
        '
        Me.MovieBindingSource6.DataMember = "Movie"
        Me.MovieBindingSource6.DataSource = Me.DsAddMov11
        '
        'tGenre
        '
        Me.tGenre.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.MovieBindingSource5, "Genre", True))
        Me.tGenre.FormattingEnabled = True
        Me.tGenre.Items.AddRange(New Object() {"Action", "Adventure", "Comedy", "Crime", "Documentary", "Faction", "Fantasy", "Historical", "Horror", "Mystery", "Paranoid", "Philosophical", "Political", "Romance", "Saga", "Satire", "Science fiction", "Slice of Life", "Thriller", "Urban", "Other"})
        Me.tGenre.Location = New System.Drawing.Point(160, 363)
        Me.tGenre.Name = "tGenre"
        Me.tGenre.Size = New System.Drawing.Size(234, 23)
        Me.tGenre.TabIndex = 50
        '
        'MovieBindingSource5
        '
        Me.MovieBindingSource5.DataMember = "Movie"
        Me.MovieBindingSource5.DataSource = Me.DsAddMov11
        '
        'tDuration
        '
        Me.tDuration.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.MovieBindingSource10, "Duration", True))
        Me.tDuration.Location = New System.Drawing.Point(160, 583)
        Me.tDuration.Name = "tDuration"
        Me.tDuration.Size = New System.Drawing.Size(234, 23)
        Me.tDuration.TabIndex = 49
        '
        'MovieBindingSource10
        '
        Me.MovieBindingSource10.DataMember = "Movie"
        Me.MovieBindingSource10.DataSource = Me.DsAddMov11
        '
        'Label10
        '
        Me.Label10.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label10.ForeColor = System.Drawing.SystemColors.Window
        Me.Label10.Location = New System.Drawing.Point(37, 579)
        Me.Label10.Name = "Label10"
        Me.Label10.Size = New System.Drawing.Size(117, 27)
        Me.Label10.TabIndex = 48
        Me.Label10.Text = "Duration"
        '
        'MovieBindingSource9
        '
        Me.MovieBindingSource9.DataMember = "Movie"
        Me.MovieBindingSource9.DataSource = Me.DsAddMov11
        '
        'Label9
        '
        Me.Label9.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label9.ForeColor = System.Drawing.SystemColors.Window
        Me.Label9.Location = New System.Drawing.Point(37, 536)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(117, 27)
        Me.Label9.TabIndex = 46
        Me.Label9.Text = "Poster"
        '
        'tYearRelease
        '
        Me.tYearRelease.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.MovieBindingSource7, "Release_year", True))
        Me.tYearRelease.Location = New System.Drawing.Point(160, 451)
        Me.tYearRelease.Name = "tYearRelease"
        Me.tYearRelease.Size = New System.Drawing.Size(234, 23)
        Me.tYearRelease.TabIndex = 45
        '
        'MovieBindingSource7
        '
        Me.MovieBindingSource7.DataMember = "Movie"
        Me.MovieBindingSource7.DataSource = Me.DsAddMov11
        '
        'tCast2
        '
        Me.tCast2.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.MovieBindingSource4, "Actor2", True))
        Me.tCast2.Location = New System.Drawing.Point(160, 322)
        Me.tCast2.Name = "tCast2"
        Me.tCast2.Size = New System.Drawing.Size(234, 23)
        Me.tCast2.TabIndex = 44
        '
        'MovieBindingSource4
        '
        Me.MovieBindingSource4.DataMember = "Movie"
        Me.MovieBindingSource4.DataSource = Me.DsAddMov11
        '
        'tCast1
        '
        Me.tCast1.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.MovieBindingSource3, "Actor1", True))
        Me.tCast1.Location = New System.Drawing.Point(160, 292)
        Me.tCast1.Name = "tCast1"
        Me.tCast1.Size = New System.Drawing.Size(234, 23)
        Me.tCast1.TabIndex = 43
        '
        'MovieBindingSource3
        '
        Me.MovieBindingSource3.DataMember = "Movie"
        Me.MovieBindingSource3.DataSource = Me.DsAddMov11
        '
        'tDirector
        '
        Me.tDirector.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.MovieBindingSource2, "Director", True))
        Me.tDirector.Location = New System.Drawing.Point(160, 252)
        Me.tDirector.Name = "tDirector"
        Me.tDirector.Size = New System.Drawing.Size(234, 23)
        Me.tDirector.TabIndex = 42
        '
        'MovieBindingSource2
        '
        Me.MovieBindingSource2.DataMember = "Movie"
        Me.MovieBindingSource2.DataSource = Me.DsAddMov11
        '
        'tTitle
        '
        Me.tTitle.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.MovieBindingSource1, "Title", True))
        Me.tTitle.Location = New System.Drawing.Point(160, 210)
        Me.tTitle.Name = "tTitle"
        Me.tTitle.Size = New System.Drawing.Size(234, 23)
        Me.tTitle.TabIndex = 41
        Me.tTitle.Text = " "
        '
        'MovieBindingSource1
        '
        Me.MovieBindingSource1.DataMember = "Movie"
        Me.MovieBindingSource1.DataSource = Me.DsAddMov11
        '
        'tMovieId
        '
        Me.tMovieId.Location = New System.Drawing.Point(160, 129)
        Me.tMovieId.Name = "tMovieId"
        Me.tMovieId.ReadOnly = True
        Me.tMovieId.Size = New System.Drawing.Size(234, 23)
        Me.tMovieId.TabIndex = 40
        '
        'Label8
        '
        Me.Label8.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label8.ForeColor = System.Drawing.SystemColors.Window
        Me.Label8.Location = New System.Drawing.Point(37, 495)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(117, 27)
        Me.Label8.TabIndex = 39
        Me.Label8.Text = " Language"
        '
        'Label7
        '
        Me.Label7.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label7.ForeColor = System.Drawing.SystemColors.Window
        Me.Label7.Location = New System.Drawing.Point(37, 451)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(117, 27)
        Me.Label7.TabIndex = 38
        Me.Label7.Text = " Year of Release"
        '
        'Label6
        '
        Me.Label6.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label6.ForeColor = System.Drawing.SystemColors.Window
        Me.Label6.Location = New System.Drawing.Point(37, 407)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(117, 27)
        Me.Label6.TabIndex = 37
        Me.Label6.Text = " Rating"
        '
        'Label5
        '
        Me.Label5.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.ForeColor = System.Drawing.SystemColors.Window
        Me.Label5.Location = New System.Drawing.Point(37, 364)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(117, 27)
        Me.Label5.TabIndex = 36
        Me.Label5.Text = " Genre"
        '
        'Label4
        '
        Me.Label4.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.ForeColor = System.Drawing.SystemColors.Window
        Me.Label4.Location = New System.Drawing.Point(37, 292)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(117, 27)
        Me.Label4.TabIndex = 35
        Me.Label4.Text = " Cast"
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.ForeColor = System.Drawing.SystemColors.Window
        Me.Label3.Location = New System.Drawing.Point(37, 251)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(117, 27)
        Me.Label3.TabIndex = 34
        Me.Label3.Text = " Director"
        '
        'Label2
        '
        Me.Label2.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.ForeColor = System.Drawing.SystemColors.Window
        Me.Label2.Location = New System.Drawing.Point(37, 210)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(117, 27)
        Me.Label2.TabIndex = 33
        Me.Label2.Text = " Title"
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.SystemColors.Window
        Me.Label1.Location = New System.Drawing.Point(37, 129)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(117, 27)
        Me.Label1.TabIndex = 32
        Me.Label1.Text = "Movie Id"
        '
        'SqlSelectCommand1
        '
        Me.SqlSelectCommand1.CommandText = "SELECT        Movie.*" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            Movie"
        Me.SqlSelectCommand1.Connection = Me.SqlConnection1
        '
        'SqlConnection1
        '
        Me.SqlConnection1.ConnectionString = "Data Source=.;Initial Catalog=F5;Integrated Security=True"
        Me.SqlConnection1.FireInfoMessageEventOnUserErrors = False
        '
        'SqlInsertCommand1
        '
        Me.SqlInsertCommand1.CommandText = resources.GetString("SqlInsertCommand1.CommandText")
        Me.SqlInsertCommand1.Connection = Me.SqlConnection1
        Me.SqlInsertCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@DVD_Id", System.Data.SqlDbType.Int, 0, "DVD_Id"), New System.Data.SqlClient.SqlParameter("@Title", System.Data.SqlDbType.VarChar, 0, "Title"), New System.Data.SqlClient.SqlParameter("@Director", System.Data.SqlDbType.VarChar, 0, "Director"), New System.Data.SqlClient.SqlParameter("@Actor1", System.Data.SqlDbType.VarChar, 0, "Actor1"), New System.Data.SqlClient.SqlParameter("@Actor2", System.Data.SqlDbType.VarChar, 0, "Actor2"), New System.Data.SqlClient.SqlParameter("@Language", System.Data.SqlDbType.VarChar, 0, "Language"), New System.Data.SqlClient.SqlParameter("@Rating", System.Data.SqlDbType.VarChar, 0, "Rating"), New System.Data.SqlClient.SqlParameter("@Genre", System.Data.SqlDbType.VarChar, 0, "Genre"), New System.Data.SqlClient.SqlParameter("@Release_year", System.Data.SqlDbType.Int, 0, "Release_year"), New System.Data.SqlClient.SqlParameter("@Duration", System.Data.SqlDbType.VarChar, 0, "Duration"), New System.Data.SqlClient.SqlParameter("@Poster", System.Data.SqlDbType.VarChar, 0, "Poster")})
        '
        'SqlUpdateCommand1
        '
        Me.SqlUpdateCommand1.CommandText = resources.GetString("SqlUpdateCommand1.CommandText")
        Me.SqlUpdateCommand1.Connection = Me.SqlConnection1
        Me.SqlUpdateCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@DVD_Id", System.Data.SqlDbType.Int, 0, "DVD_Id"), New System.Data.SqlClient.SqlParameter("@Title", System.Data.SqlDbType.VarChar, 0, "Title"), New System.Data.SqlClient.SqlParameter("@Director", System.Data.SqlDbType.VarChar, 0, "Director"), New System.Data.SqlClient.SqlParameter("@Actor1", System.Data.SqlDbType.VarChar, 0, "Actor1"), New System.Data.SqlClient.SqlParameter("@Actor2", System.Data.SqlDbType.VarChar, 0, "Actor2"), New System.Data.SqlClient.SqlParameter("@Language", System.Data.SqlDbType.VarChar, 0, "Language"), New System.Data.SqlClient.SqlParameter("@Rating", System.Data.SqlDbType.VarChar, 0, "Rating"), New System.Data.SqlClient.SqlParameter("@Genre", System.Data.SqlDbType.VarChar, 0, "Genre"), New System.Data.SqlClient.SqlParameter("@Release_year", System.Data.SqlDbType.Int, 0, "Release_year"), New System.Data.SqlClient.SqlParameter("@Duration", System.Data.SqlDbType.VarChar, 0, "Duration"), New System.Data.SqlClient.SqlParameter("@Poster", System.Data.SqlDbType.VarChar, 0, "Poster"), New System.Data.SqlClient.SqlParameter("@Original_Movie_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Movie_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_DVD_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "DVD_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Title", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Title", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Title", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Title", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Director", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Director", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Director", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Director", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Actor1", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Actor1", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Actor1", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Actor1", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Actor2", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Actor2", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Actor2", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Actor2", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Language", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Language", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Language", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Language", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Rating", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Rating", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Genre", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Genre", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Genre", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Genre", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Release_year", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Release_year", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Release_year", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Release_year", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Duration", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Duration", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Duration", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Duration", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Poster", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Poster", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Poster", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Poster", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Movie_Id", System.Data.SqlDbType.Int, 4, "Movie_Id")})
        '
        'SqlDeleteCommand1
        '
        Me.SqlDeleteCommand1.CommandText = resources.GetString("SqlDeleteCommand1.CommandText")
        Me.SqlDeleteCommand1.Connection = Me.SqlConnection1
        Me.SqlDeleteCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Original_Movie_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Movie_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_DVD_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "DVD_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Title", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Title", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Title", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Title", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Director", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Director", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Director", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Director", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Actor1", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Actor1", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Actor1", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Actor1", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Actor2", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Actor2", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Actor2", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Actor2", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Language", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Language", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Language", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Language", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Rating", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Rating", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Genre", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Genre", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Genre", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Genre", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Release_year", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Release_year", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Release_year", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Release_year", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Duration", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Duration", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Duration", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Duration", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Poster", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Poster", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Poster", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Poster", System.Data.DataRowVersion.Original, Nothing)})
        '
        'DAAddMov1
        '
        Me.DAAddMov1.DeleteCommand = Me.SqlDeleteCommand1
        Me.DAAddMov1.InsertCommand = Me.SqlInsertCommand1
        Me.DAAddMov1.SelectCommand = Me.SqlSelectCommand1
        Me.DAAddMov1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Movie", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("Movie_Id", "Movie_Id"), New System.Data.Common.DataColumnMapping("DVD_Id", "DVD_Id"), New System.Data.Common.DataColumnMapping("Title", "Title"), New System.Data.Common.DataColumnMapping("Director", "Director"), New System.Data.Common.DataColumnMapping("Actor1", "Actor1"), New System.Data.Common.DataColumnMapping("Actor2", "Actor2"), New System.Data.Common.DataColumnMapping("Language", "Language"), New System.Data.Common.DataColumnMapping("Rating", "Rating"), New System.Data.Common.DataColumnMapping("Genre", "Genre"), New System.Data.Common.DataColumnMapping("Release_year", "Release_year"), New System.Data.Common.DataColumnMapping("Duration", "Duration"), New System.Data.Common.DataColumnMapping("Poster", "Poster")})})
        Me.DAAddMov1.UpdateCommand = Me.SqlUpdateCommand1
        '
        'MoviePoster
        '
        Me.MoviePoster.FileName = "OpenFileDialog1"
        '
        'MovPoster
        '
        Me.MovPoster.FileName = "OpenFileDialog1"
        '
        'OpenFileDialog1
        '
        Me.OpenFileDialog1.FileName = "OpenFileDialog1"
        '
        'btnImg
        '
        Me.btnImg.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnImg.Location = New System.Drawing.Point(163, 536)
        Me.btnImg.Name = "btnImg"
        Me.btnImg.Size = New System.Drawing.Size(107, 27)
        Me.btnImg.TabIndex = 56
        Me.btnImg.Text = "Browse"
        Me.btnImg.UseVisualStyleBackColor = True
        '
        'tPoster
        '
        Me.tPoster.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.MovieBindingSource1, "Title", True))
        Me.tPoster.Location = New System.Drawing.Point(159, 536)
        Me.tPoster.Name = "tPoster"
        Me.tPoster.Size = New System.Drawing.Size(234, 23)
        Me.tPoster.TabIndex = 57
        Me.tPoster.Text = " "
        Me.tPoster.Visible = False
        '
        'SqlSelectCommand2
        '
        Me.SqlSelectCommand2.CommandText = "SELECT        DVD_Id" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            DVD"
        Me.SqlSelectCommand2.Connection = Me.SqlConnection1
        '
        'SqlInsertCommand2
        '
        Me.SqlInsertCommand2.CommandText = "INSERT INTO [DVD] DEFAULT VALUES;" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "SELECT DVD_Id FROM DVD WHERE (DVD_Id = SCOPE_I" & _
            "DENTITY())"
        Me.SqlInsertCommand2.Connection = Me.SqlConnection1
        '
        'SqlDeleteCommand2
        '
        Me.SqlDeleteCommand2.CommandText = "DELETE FROM [DVD] WHERE (([DVD_Id] = @Original_DVD_Id))"
        Me.SqlDeleteCommand2.Connection = Me.SqlConnection1
        Me.SqlDeleteCommand2.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Original_DVD_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "DVD_Id", System.Data.DataRowVersion.Original, Nothing)})
        '
        'DALoadDVDid1
        '
        Me.DALoadDVDid1.DeleteCommand = Me.SqlDeleteCommand2
        Me.DALoadDVDid1.InsertCommand = Me.SqlInsertCommand2
        Me.DALoadDVDid1.SelectCommand = Me.SqlSelectCommand2
        Me.DALoadDVDid1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "DVD", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("DVD_Id", "DVD_Id")})})
        '
        'DsLoadDVDId11
        '
        Me.DsLoadDVDId11.DataSetName = "DSLoadDVDId1"
        Me.DsLoadDVDId11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'tDvdId
        '
        Me.tDvdId.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.MovieBindingSource5, "Genre", True))
        Me.tDvdId.DataSource = Me.DsLoadDVDId11
        Me.tDvdId.DisplayMember = "DVD.DVD_Id"
        Me.tDvdId.FormattingEnabled = True
        Me.tDvdId.Location = New System.Drawing.Point(159, 169)
        Me.tDvdId.Name = "tDvdId"
        Me.tDvdId.Size = New System.Drawing.Size(234, 23)
        Me.tDvdId.TabIndex = 58
        '
        'SqlSelectCommand3
        '
        Me.SqlSelectCommand3.CommandText = "SELECT [DVD_Id]" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "  FROM [F5].[dbo].[DVD]" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "  WHERE [Status]='In'"
        Me.SqlSelectCommand3.Connection = Me.SqlConnection1
        '
        'SqlInsertCommand3
        '
        Me.SqlInsertCommand3.CommandText = "INSERT INTO [F5].[dbo].[DVD] DEFAULT VALUES;" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "SELECT DVD_Id FROM DVD WHERE (DVD_I" & _
            "d = SCOPE_IDENTITY())"
        Me.SqlInsertCommand3.Connection = Me.SqlConnection1
        '
        'SqlDeleteCommand3
        '
        Me.SqlDeleteCommand3.CommandText = "DELETE FROM [F5].[dbo].[DVD] WHERE (([DVD_Id] = @Original_DVD_Id))"
        Me.SqlDeleteCommand3.Connection = Me.SqlConnection1
        Me.SqlDeleteCommand3.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Original_DVD_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "DVD_Id", System.Data.DataRowVersion.Original, Nothing)})
        '
        'DALoadDVD2
        '
        Me.DALoadDVD2.DeleteCommand = Me.SqlDeleteCommand3
        Me.DALoadDVD2.InsertCommand = Me.SqlInsertCommand3
        Me.DALoadDVD2.SelectCommand = Me.SqlSelectCommand3
        Me.DALoadDVD2.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "DVD", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("DVD_Id", "DVD_Id")})})
        '
        'DsLoadDVD21
        '
        Me.DsLoadDVD21.DataSetName = "DSLoadDVD2"
        Me.DsLoadDVD21.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'DsLoadDVD31
        '
        Me.DsLoadDVD31.DataSetName = "DSLoadDVD3"
        Me.DsLoadDVD31.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'DsLoadDVDtoThis11
        '
        Me.DsLoadDVDtoThis11.DataSetName = "DSLoadDVDtoThis1"
        Me.DsLoadDVDtoThis11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'Form_MovieDetails
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(64, Byte), Integer), CType(CType(64, Byte), Integer), CType(CType(64, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(812, 673)
        Me.Controls.Add(Me.tDvdId)
        Me.Controls.Add(Me.tPoster)
        Me.Controls.Add(Me.btnImg)
        Me.Controls.Add(Me.Label11)
        Me.Controls.Add(Me.tLanguage)
        Me.Controls.Add(Me.tRating)
        Me.Controls.Add(Me.tGenre)
        Me.Controls.Add(Me.tDuration)
        Me.Controls.Add(Me.Label10)
        Me.Controls.Add(Me.Label9)
        Me.Controls.Add(Me.tYearRelease)
        Me.Controls.Add(Me.tCast2)
        Me.Controls.Add(Me.tCast1)
        Me.Controls.Add(Me.tDirector)
        Me.Controls.Add(Me.tTitle)
        Me.Controls.Add(Me.tMovieId)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.PictureBox2)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.bAdd)
        Me.Controls.Add(Me.bBack)
        Me.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.Name = "Form_MovieDetails"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Movie Details"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsAddMov11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource8, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource6, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource5, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource10, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource9, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource7, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource4, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource3, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsLoadDVDId11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsLoadDVD21, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsLoadDVD31, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsLoadDVDtoThis11, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents bBack As System.Windows.Forms.Button
    Friend WithEvents bAdd As System.Windows.Forms.Button
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox2 As System.Windows.Forms.PictureBox
    Friend WithEvents Label11 As System.Windows.Forms.Label
    Friend WithEvents tLanguage As System.Windows.Forms.ComboBox
    Friend WithEvents tRating As System.Windows.Forms.ComboBox
    Friend WithEvents tGenre As System.Windows.Forms.ComboBox
    Friend WithEvents tDuration As System.Windows.Forms.TextBox
    Friend WithEvents Label10 As System.Windows.Forms.Label
    Friend WithEvents Label9 As System.Windows.Forms.Label
    Friend WithEvents tYearRelease As System.Windows.Forms.TextBox
    Friend WithEvents tCast2 As System.Windows.Forms.TextBox
    Friend WithEvents tCast1 As System.Windows.Forms.TextBox
    Friend WithEvents tDirector As System.Windows.Forms.TextBox
    Friend WithEvents tTitle As System.Windows.Forms.TextBox
    Friend WithEvents tMovieId As System.Windows.Forms.TextBox
    Friend WithEvents Label8 As System.Windows.Forms.Label
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents MovieBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents DsAddMov11 As DVD_STORE.DSAddMov1
    Friend WithEvents MovieBindingSource8 As System.Windows.Forms.BindingSource
    Friend WithEvents MovieBindingSource6 As System.Windows.Forms.BindingSource
    Friend WithEvents MovieBindingSource5 As System.Windows.Forms.BindingSource
    Friend WithEvents MovieBindingSource10 As System.Windows.Forms.BindingSource
    Friend WithEvents MovieBindingSource9 As System.Windows.Forms.BindingSource
    Friend WithEvents MovieBindingSource7 As System.Windows.Forms.BindingSource
    Friend WithEvents MovieBindingSource4 As System.Windows.Forms.BindingSource
    Friend WithEvents MovieBindingSource3 As System.Windows.Forms.BindingSource
    Friend WithEvents MovieBindingSource2 As System.Windows.Forms.BindingSource
    Friend WithEvents MovieBindingSource1 As System.Windows.Forms.BindingSource
    Friend WithEvents SqlSelectCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlConnection1 As System.Data.SqlClient.SqlConnection
    Friend WithEvents SqlInsertCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlUpdateCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DAAddMov1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents MoviePoster As System.Windows.Forms.OpenFileDialog
    Friend WithEvents MovPoster As System.Windows.Forms.OpenFileDialog
    Friend WithEvents OpenFileDialog1 As System.Windows.Forms.OpenFileDialog
    Friend WithEvents btnImg As System.Windows.Forms.Button
    Friend WithEvents tPoster As System.Windows.Forms.TextBox
    Friend WithEvents SqlSelectCommand2 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlInsertCommand2 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand2 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DALoadDVDid1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents DsLoadDVDId11 As DVD_STORE.DSLoadDVDId1
    Friend WithEvents tDvdId As System.Windows.Forms.ComboBox
    Friend WithEvents DsLoadDVD21 As DVD_STORE.DSLoadDVD2
    Friend WithEvents SqlSelectCommand3 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlInsertCommand3 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand3 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DALoadDVD2 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents DsLoadDVD31 As DVD_STORE.DSLoadDVD3
    Friend WithEvents DsLoadDVDtoThis11 As DVD_STORE.DSLoadDVDtoThis1
End Class
