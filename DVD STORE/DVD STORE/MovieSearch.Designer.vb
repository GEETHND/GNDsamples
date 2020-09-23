<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class MovieSearch
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(MovieSearch))
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.cmbTitle = New System.Windows.Forms.ComboBox()
        Me.DsSrchTitle11 = New DVD_STORE.DSSrchTitle1()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.lblDvdId = New System.Windows.Forms.Label()
        Me.lblLang = New System.Windows.Forms.Label()
        Me.Label10 = New System.Windows.Forms.Label()
        Me.lblRating = New System.Windows.Forms.Label()
        Me.lblGenre = New System.Windows.Forms.Label()
        Me.lblRelYr = New System.Windows.Forms.Label()
        Me.lblActor = New System.Windows.Forms.Label()
        Me.lblDir = New System.Windows.Forms.Label()
        Me.lblTitle = New System.Windows.Forms.Label()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.lblMId = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.SqlSelectCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlConnection1 = New System.Data.SqlClient.SqlConnection()
        Me.SqlUpdateCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.DASrchTitle1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.poster = New System.Windows.Forms.PictureBox()
        Me.Label11 = New System.Windows.Forms.Label()
        Me.ComboBox1 = New System.Windows.Forms.ComboBox()
        Me.Label12 = New System.Windows.Forms.Label()
        Me.cmbDir = New System.Windows.Forms.ComboBox()
        Me.Label13 = New System.Windows.Forms.Label()
        Me.cmbRelYr = New System.Windows.Forms.ComboBox()
        Me.Label14 = New System.Windows.Forms.Label()
        Me.cmbLang = New System.Windows.Forms.ComboBox()
        Me.Label15 = New System.Windows.Forms.Label()
        Me.cmbGenre = New System.Windows.Forms.ComboBox()
        Me.Label16 = New System.Windows.Forms.Label()
        Me.cmbRating = New System.Windows.Forms.ComboBox()
        Me.bDvdCopy = New System.Windows.Forms.Button()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsSrchTitle11, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox1.SuspendLayout()
        CType(Me.poster, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'PictureBox1
        '
        Me.PictureBox1.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Left) _
                    Or System.Windows.Forms.AnchorStyles.Right), System.Windows.Forms.AnchorStyles)
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(0, -1)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(1037, 102)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 21
        Me.PictureBox1.TabStop = False
        '
        'cmbTitle
        '
        Me.cmbTitle.DataSource = Me.DsSrchTitle11
        Me.cmbTitle.DisplayMember = "Movie.Title"
        Me.cmbTitle.FormattingEnabled = True
        Me.cmbTitle.Location = New System.Drawing.Point(88, 184)
        Me.cmbTitle.Name = "cmbTitle"
        Me.cmbTitle.Size = New System.Drawing.Size(155, 21)
        Me.cmbTitle.TabIndex = 22
        '
        'DsSrchTitle11
        '
        Me.DsSrchTitle11.DataSetName = "DSSrchTitle1"
        Me.DsSrchTitle11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.Label9)
        Me.GroupBox1.Controls.Add(Me.lblDvdId)
        Me.GroupBox1.Controls.Add(Me.lblLang)
        Me.GroupBox1.Controls.Add(Me.Label10)
        Me.GroupBox1.Controls.Add(Me.lblRating)
        Me.GroupBox1.Controls.Add(Me.lblGenre)
        Me.GroupBox1.Controls.Add(Me.lblRelYr)
        Me.GroupBox1.Controls.Add(Me.lblActor)
        Me.GroupBox1.Controls.Add(Me.lblDir)
        Me.GroupBox1.Controls.Add(Me.lblTitle)
        Me.GroupBox1.Controls.Add(Me.Label8)
        Me.GroupBox1.Controls.Add(Me.Label7)
        Me.GroupBox1.Controls.Add(Me.Label6)
        Me.GroupBox1.Controls.Add(Me.Label5)
        Me.GroupBox1.Controls.Add(Me.Label4)
        Me.GroupBox1.Controls.Add(Me.Label3)
        Me.GroupBox1.Controls.Add(Me.Label2)
        Me.GroupBox1.Controls.Add(Me.lblMId)
        Me.GroupBox1.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox1.ForeColor = System.Drawing.SystemColors.Window
        Me.GroupBox1.Location = New System.Drawing.Point(272, 143)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(550, 392)
        Me.GroupBox1.TabIndex = 23
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Movie Details"
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Location = New System.Drawing.Point(254, 39)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(62, 20)
        Me.Label9.TabIndex = 17
        Me.Label9.Text = "DVD Id"
        '
        'lblDvdId
        '
        Me.lblDvdId.AutoSize = True
        Me.lblDvdId.ForeColor = System.Drawing.SystemColors.ActiveCaption
        Me.lblDvdId.Location = New System.Drawing.Point(422, 39)
        Me.lblDvdId.Name = "lblDvdId"
        Me.lblDvdId.Size = New System.Drawing.Size(0, 20)
        Me.lblDvdId.TabIndex = 16
        '
        'lblLang
        '
        Me.lblLang.AutoSize = True
        Me.lblLang.ForeColor = System.Drawing.SystemColors.ActiveCaption
        Me.lblLang.Location = New System.Drawing.Point(184, 331)
        Me.lblLang.Name = "lblLang"
        Me.lblLang.Size = New System.Drawing.Size(0, 20)
        Me.lblLang.TabIndex = 15
        '
        'Label10
        '
        Me.Label10.AutoSize = True
        Me.Label10.Location = New System.Drawing.Point(16, 329)
        Me.Label10.Name = "Label10"
        Me.Label10.Size = New System.Drawing.Size(81, 20)
        Me.Label10.TabIndex = 14
        Me.Label10.Text = "Language"
        '
        'lblRating
        '
        Me.lblRating.AutoSize = True
        Me.lblRating.ForeColor = System.Drawing.SystemColors.ActiveCaption
        Me.lblRating.Location = New System.Drawing.Point(184, 291)
        Me.lblRating.Name = "lblRating"
        Me.lblRating.Size = New System.Drawing.Size(0, 20)
        Me.lblRating.TabIndex = 13
        '
        'lblGenre
        '
        Me.lblGenre.AutoSize = True
        Me.lblGenre.ForeColor = System.Drawing.SystemColors.ActiveCaption
        Me.lblGenre.Location = New System.Drawing.Point(184, 248)
        Me.lblGenre.Name = "lblGenre"
        Me.lblGenre.Size = New System.Drawing.Size(0, 20)
        Me.lblGenre.TabIndex = 12
        '
        'lblRelYr
        '
        Me.lblRelYr.AutoSize = True
        Me.lblRelYr.ForeColor = System.Drawing.SystemColors.ActiveCaption
        Me.lblRelYr.Location = New System.Drawing.Point(184, 211)
        Me.lblRelYr.Name = "lblRelYr"
        Me.lblRelYr.Size = New System.Drawing.Size(0, 20)
        Me.lblRelYr.TabIndex = 11
        '
        'lblActor
        '
        Me.lblActor.AutoSize = True
        Me.lblActor.ForeColor = System.Drawing.SystemColors.ActiveCaption
        Me.lblActor.Location = New System.Drawing.Point(184, 171)
        Me.lblActor.Name = "lblActor"
        Me.lblActor.Size = New System.Drawing.Size(0, 20)
        Me.lblActor.TabIndex = 10
        '
        'lblDir
        '
        Me.lblDir.AutoSize = True
        Me.lblDir.ForeColor = System.Drawing.SystemColors.ActiveCaption
        Me.lblDir.Location = New System.Drawing.Point(184, 128)
        Me.lblDir.Name = "lblDir"
        Me.lblDir.Size = New System.Drawing.Size(0, 20)
        Me.lblDir.TabIndex = 9
        '
        'lblTitle
        '
        Me.lblTitle.AutoSize = True
        Me.lblTitle.ForeColor = System.Drawing.SystemColors.ActiveCaption
        Me.lblTitle.Location = New System.Drawing.Point(184, 83)
        Me.lblTitle.Name = "lblTitle"
        Me.lblTitle.Size = New System.Drawing.Size(0, 20)
        Me.lblTitle.TabIndex = 8
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(16, 289)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(56, 20)
        Me.Label8.TabIndex = 7
        Me.Label8.Text = "Rating"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(16, 248)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(54, 20)
        Me.Label7.TabIndex = 6
        Me.Label7.Text = "Genre"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(16, 211)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(106, 20)
        Me.Label6.TabIndex = 5
        Me.Label6.Text = "Release Year"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(16, 171)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(47, 20)
        Me.Label5.TabIndex = 4
        Me.Label5.Text = "Actor"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(16, 128)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(65, 20)
        Me.Label4.TabIndex = 3
        Me.Label4.Text = "Director"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(16, 83)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(38, 20)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = "Title"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(16, 39)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(68, 20)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "Movie Id"
        '
        'lblMId
        '
        Me.lblMId.AutoSize = True
        Me.lblMId.ForeColor = System.Drawing.SystemColors.ActiveCaption
        Me.lblMId.Location = New System.Drawing.Point(184, 39)
        Me.lblMId.Name = "lblMId"
        Me.lblMId.Size = New System.Drawing.Size(0, 20)
        Me.lblMId.TabIndex = 0
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.SystemColors.Window
        Me.Label1.Location = New System.Drawing.Point(12, 179)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(45, 24)
        Me.Label1.TabIndex = 24
        Me.Label1.Text = "Title"
        '
        'SqlSelectCommand1
        '
        Me.SqlSelectCommand1.CommandText = "SELECT        Title, Director, Actor1, Actor2, Language, Rating, Genre, Release_y" & _
            "ear, Poster, Movie_Id" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            Movie"
        Me.SqlSelectCommand1.Connection = Me.SqlConnection1
        '
        'SqlConnection1
        '
        Me.SqlConnection1.ConnectionString = "Data Source=.;Initial Catalog=F5;Integrated Security=True"
        Me.SqlConnection1.FireInfoMessageEventOnUserErrors = False
        '
        'SqlUpdateCommand1
        '
        Me.SqlUpdateCommand1.CommandText = resources.GetString("SqlUpdateCommand1.CommandText")
        Me.SqlUpdateCommand1.Connection = Me.SqlConnection1
        Me.SqlUpdateCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Title", System.Data.SqlDbType.VarChar, 0, "Title"), New System.Data.SqlClient.SqlParameter("@Director", System.Data.SqlDbType.VarChar, 0, "Director"), New System.Data.SqlClient.SqlParameter("@Actor1", System.Data.SqlDbType.VarChar, 0, "Actor1"), New System.Data.SqlClient.SqlParameter("@Actor2", System.Data.SqlDbType.VarChar, 0, "Actor2"), New System.Data.SqlClient.SqlParameter("@Language", System.Data.SqlDbType.VarChar, 0, "Language"), New System.Data.SqlClient.SqlParameter("@Rating", System.Data.SqlDbType.VarChar, 0, "Rating"), New System.Data.SqlClient.SqlParameter("@Genre", System.Data.SqlDbType.VarChar, 0, "Genre"), New System.Data.SqlClient.SqlParameter("@Release_year", System.Data.SqlDbType.Int, 0, "Release_year"), New System.Data.SqlClient.SqlParameter("@Poster", System.Data.SqlDbType.VarChar, 0, "Poster"), New System.Data.SqlClient.SqlParameter("@IsNull_Title", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Title", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Title", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Title", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Director", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Director", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Director", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Director", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Actor1", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Actor1", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Actor1", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Actor1", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Actor2", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Actor2", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Actor2", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Actor2", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Language", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Language", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Language", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Language", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Rating", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Rating", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Genre", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Genre", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Genre", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Genre", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Release_year", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Release_year", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Release_year", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Release_year", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Poster", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Poster", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Poster", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Poster", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Movie_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Movie_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Movie_Id", System.Data.SqlDbType.Int, 4, "Movie_Id")})
        '
        'SqlDeleteCommand1
        '
        Me.SqlDeleteCommand1.CommandText = resources.GetString("SqlDeleteCommand1.CommandText")
        Me.SqlDeleteCommand1.Connection = Me.SqlConnection1
        Me.SqlDeleteCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@IsNull_Title", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Title", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Title", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Title", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Director", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Director", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Director", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Director", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Actor1", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Actor1", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Actor1", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Actor1", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Actor2", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Actor2", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Actor2", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Actor2", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Language", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Language", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Language", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Language", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Rating", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Rating", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Genre", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Genre", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Genre", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Genre", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Release_year", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Release_year", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Release_year", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Release_year", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Poster", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Poster", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Poster", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Poster", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Movie_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Movie_Id", System.Data.DataRowVersion.Original, Nothing)})
        '
        'DASrchTitle1
        '
        Me.DASrchTitle1.DeleteCommand = Me.SqlDeleteCommand1
        Me.DASrchTitle1.SelectCommand = Me.SqlSelectCommand1
        Me.DASrchTitle1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Movie", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("Title", "Title"), New System.Data.Common.DataColumnMapping("Director", "Director"), New System.Data.Common.DataColumnMapping("Actor1", "Actor1"), New System.Data.Common.DataColumnMapping("Actor2", "Actor2"), New System.Data.Common.DataColumnMapping("Language", "Language"), New System.Data.Common.DataColumnMapping("Rating", "Rating"), New System.Data.Common.DataColumnMapping("Genre", "Genre"), New System.Data.Common.DataColumnMapping("Release_year", "Release_year"), New System.Data.Common.DataColumnMapping("Poster", "Poster"), New System.Data.Common.DataColumnMapping("Movie_Id", "Movie_Id")})})
        Me.DASrchTitle1.UpdateCommand = Me.SqlUpdateCommand1
        '
        'poster
        '
        Me.poster.Location = New System.Drawing.Point(828, 154)
        Me.poster.Name = "poster"
        Me.poster.Size = New System.Drawing.Size(197, 275)
        Me.poster.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.poster.TabIndex = 25
        Me.poster.TabStop = False
        '
        'Label11
        '
        Me.Label11.AutoSize = True
        Me.Label11.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label11.ForeColor = System.Drawing.SystemColors.Window
        Me.Label11.Location = New System.Drawing.Point(12, 126)
        Me.Label11.Name = "Label11"
        Me.Label11.Size = New System.Drawing.Size(95, 24)
        Me.Label11.TabIndex = 27
        Me.Label11.Text = "Search by"
        Me.Label11.Visible = False
        '
        'ComboBox1
        '
        Me.ComboBox1.FormattingEnabled = True
        Me.ComboBox1.Items.AddRange(New Object() {"Title", "Director", "Release Year", "Genre", "Rating", "Language", "Actor"})
        Me.ComboBox1.Location = New System.Drawing.Point(111, 131)
        Me.ComboBox1.Name = "ComboBox1"
        Me.ComboBox1.Size = New System.Drawing.Size(132, 21)
        Me.ComboBox1.TabIndex = 26
        Me.ComboBox1.Visible = False
        '
        'Label12
        '
        Me.Label12.AutoSize = True
        Me.Label12.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label12.ForeColor = System.Drawing.SystemColors.Window
        Me.Label12.Location = New System.Drawing.Point(12, 223)
        Me.Label12.Name = "Label12"
        Me.Label12.Size = New System.Drawing.Size(75, 24)
        Me.Label12.TabIndex = 29
        Me.Label12.Text = "Director"
        Me.Label12.Visible = False
        '
        'cmbDir
        '
        Me.cmbDir.DataSource = Me.DsSrchTitle11
        Me.cmbDir.DisplayMember = "Movie.Title"
        Me.cmbDir.FormattingEnabled = True
        Me.cmbDir.Location = New System.Drawing.Point(88, 223)
        Me.cmbDir.Name = "cmbDir"
        Me.cmbDir.Size = New System.Drawing.Size(155, 21)
        Me.cmbDir.TabIndex = 28
        Me.cmbDir.Visible = False
        '
        'Label13
        '
        Me.Label13.AutoSize = True
        Me.Label13.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label13.ForeColor = System.Drawing.SystemColors.Window
        Me.Label13.Location = New System.Drawing.Point(12, 267)
        Me.Label13.Name = "Label13"
        Me.Label13.Size = New System.Drawing.Size(123, 24)
        Me.Label13.TabIndex = 31
        Me.Label13.Text = "Release Year"
        Me.Label13.Visible = False
        '
        'cmbRelYr
        '
        Me.cmbRelYr.DataSource = Me.DsSrchTitle11
        Me.cmbRelYr.DisplayMember = "Movie.Title"
        Me.cmbRelYr.FormattingEnabled = True
        Me.cmbRelYr.Location = New System.Drawing.Point(88, 271)
        Me.cmbRelYr.Name = "cmbRelYr"
        Me.cmbRelYr.Size = New System.Drawing.Size(155, 21)
        Me.cmbRelYr.TabIndex = 30
        Me.cmbRelYr.Visible = False
        '
        'Label14
        '
        Me.Label14.AutoSize = True
        Me.Label14.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label14.ForeColor = System.Drawing.SystemColors.Window
        Me.Label14.Location = New System.Drawing.Point(12, 314)
        Me.Label14.Name = "Label14"
        Me.Label14.Size = New System.Drawing.Size(95, 24)
        Me.Label14.TabIndex = 33
        Me.Label14.Text = "Language"
        Me.Label14.Visible = False
        '
        'cmbLang
        '
        Me.cmbLang.DataSource = Me.DsSrchTitle11
        Me.cmbLang.DisplayMember = "Movie.Title"
        Me.cmbLang.FormattingEnabled = True
        Me.cmbLang.Location = New System.Drawing.Point(88, 318)
        Me.cmbLang.Name = "cmbLang"
        Me.cmbLang.Size = New System.Drawing.Size(155, 21)
        Me.cmbLang.TabIndex = 32
        Me.cmbLang.Visible = False
        '
        'Label15
        '
        Me.Label15.AutoSize = True
        Me.Label15.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label15.ForeColor = System.Drawing.SystemColors.Window
        Me.Label15.Location = New System.Drawing.Point(12, 354)
        Me.Label15.Name = "Label15"
        Me.Label15.Size = New System.Drawing.Size(63, 24)
        Me.Label15.TabIndex = 35
        Me.Label15.Text = "Genre"
        Me.Label15.Visible = False
        '
        'cmbGenre
        '
        Me.cmbGenre.DataSource = Me.DsSrchTitle11
        Me.cmbGenre.DisplayMember = "Movie.Title"
        Me.cmbGenre.FormattingEnabled = True
        Me.cmbGenre.Location = New System.Drawing.Point(88, 358)
        Me.cmbGenre.Name = "cmbGenre"
        Me.cmbGenre.Size = New System.Drawing.Size(155, 21)
        Me.cmbGenre.TabIndex = 34
        Me.cmbGenre.Visible = False
        '
        'Label16
        '
        Me.Label16.AutoSize = True
        Me.Label16.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label16.ForeColor = System.Drawing.SystemColors.Window
        Me.Label16.Location = New System.Drawing.Point(12, 391)
        Me.Label16.Name = "Label16"
        Me.Label16.Size = New System.Drawing.Size(63, 24)
        Me.Label16.TabIndex = 37
        Me.Label16.Text = "Rating"
        Me.Label16.Visible = False
        '
        'cmbRating
        '
        Me.cmbRating.DataSource = Me.DsSrchTitle11
        Me.cmbRating.DisplayMember = "Movie.Title"
        Me.cmbRating.FormattingEnabled = True
        Me.cmbRating.Location = New System.Drawing.Point(88, 395)
        Me.cmbRating.Name = "cmbRating"
        Me.cmbRating.Size = New System.Drawing.Size(155, 21)
        Me.cmbRating.TabIndex = 36
        Me.cmbRating.Visible = False
        '
        'bDvdCopy
        '
        Me.bDvdCopy.BackColor = System.Drawing.Color.Gray
        Me.bDvdCopy.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bDvdCopy.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bDvdCopy.ForeColor = System.Drawing.Color.Maroon
        Me.bDvdCopy.Image = CType(resources.GetObject("bDvdCopy.Image"), System.Drawing.Image)
        Me.bDvdCopy.Location = New System.Drawing.Point(942, 466)
        Me.bDvdCopy.Name = "bDvdCopy"
        Me.bDvdCopy.Size = New System.Drawing.Size(83, 79)
        Me.bDvdCopy.TabIndex = 38
        Me.bDvdCopy.Text = " "
        Me.bDvdCopy.UseVisualStyleBackColor = False
        '
        'MovieSearch
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Gray
        Me.ClientSize = New System.Drawing.Size(1037, 557)
        Me.Controls.Add(Me.bDvdCopy)
        Me.Controls.Add(Me.Label16)
        Me.Controls.Add(Me.cmbRating)
        Me.Controls.Add(Me.Label15)
        Me.Controls.Add(Me.cmbGenre)
        Me.Controls.Add(Me.Label14)
        Me.Controls.Add(Me.cmbLang)
        Me.Controls.Add(Me.Label13)
        Me.Controls.Add(Me.cmbRelYr)
        Me.Controls.Add(Me.Label12)
        Me.Controls.Add(Me.cmbDir)
        Me.Controls.Add(Me.Label11)
        Me.Controls.Add(Me.ComboBox1)
        Me.Controls.Add(Me.poster)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.cmbTitle)
        Me.Controls.Add(Me.PictureBox1)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.Name = "MovieSearch"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "MovieSearch"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsSrchTitle11, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        CType(Me.poster, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents cmbTitle As System.Windows.Forms.ComboBox
    Friend WithEvents DsSrchTitle11 As DVD_STORE.DSSrchTitle1
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents SqlSelectCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlConnection1 As System.Data.SqlClient.SqlConnection
    Friend WithEvents SqlUpdateCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DASrchTitle1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents lblMId As System.Windows.Forms.Label
    Friend WithEvents lblRating As System.Windows.Forms.Label
    Friend WithEvents lblGenre As System.Windows.Forms.Label
    Friend WithEvents lblRelYr As System.Windows.Forms.Label
    Friend WithEvents lblActor As System.Windows.Forms.Label
    Friend WithEvents lblDir As System.Windows.Forms.Label
    Friend WithEvents lblTitle As System.Windows.Forms.Label
    Friend WithEvents Label8 As System.Windows.Forms.Label
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents poster As System.Windows.Forms.PictureBox
    Friend WithEvents Label9 As System.Windows.Forms.Label
    Friend WithEvents lblDvdId As System.Windows.Forms.Label
    Friend WithEvents lblLang As System.Windows.Forms.Label
    Friend WithEvents Label10 As System.Windows.Forms.Label
    Friend WithEvents Label11 As System.Windows.Forms.Label
    Friend WithEvents ComboBox1 As System.Windows.Forms.ComboBox
    Friend WithEvents Label12 As System.Windows.Forms.Label
    Friend WithEvents cmbDir As System.Windows.Forms.ComboBox
    Friend WithEvents Label13 As System.Windows.Forms.Label
    Friend WithEvents cmbRelYr As System.Windows.Forms.ComboBox
    Friend WithEvents Label14 As System.Windows.Forms.Label
    Friend WithEvents cmbLang As System.Windows.Forms.ComboBox
    Friend WithEvents Label15 As System.Windows.Forms.Label
    Friend WithEvents cmbGenre As System.Windows.Forms.ComboBox
    Friend WithEvents Label16 As System.Windows.Forms.Label
    Friend WithEvents cmbRating As System.Windows.Forms.ComboBox
    Friend WithEvents bDvdCopy As System.Windows.Forms.Button
End Class
