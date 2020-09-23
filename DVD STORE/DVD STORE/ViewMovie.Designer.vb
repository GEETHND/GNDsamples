<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class ViewMovie
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(ViewMovie))
        Dim DataGridViewCellStyle2 As System.Windows.Forms.DataGridViewCellStyle = New System.Windows.Forms.DataGridViewCellStyle()
        Me.SqlSelectCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlConnection1 = New System.Data.SqlClient.SqlConnection()
        Me.SqlInsertCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlUpdateCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.DAViewMov1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.DsViewMov11 = New DVD_STORE.DSViewMov1()
        Me.DataGridView1 = New System.Windows.Forms.DataGridView()
        Me.MovieIdDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DVDIdDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.TitleDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DirectorDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.Actor1DataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.Actor2DataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.LanguageDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.RatingDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.GenreDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.ReleaseyearDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DurationDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.PosterDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.MovieBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.bUpdate = New System.Windows.Forms.Button()
        Me.bAdd = New System.Windows.Forms.Button()
        Me.bBack = New System.Windows.Forms.Button()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        CType(Me.DsViewMov11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MovieBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
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
        'DAViewMov1
        '
        Me.DAViewMov1.DeleteCommand = Me.SqlDeleteCommand1
        Me.DAViewMov1.InsertCommand = Me.SqlInsertCommand1
        Me.DAViewMov1.SelectCommand = Me.SqlSelectCommand1
        Me.DAViewMov1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Movie", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("Movie_Id", "Movie_Id"), New System.Data.Common.DataColumnMapping("DVD_Id", "DVD_Id"), New System.Data.Common.DataColumnMapping("Title", "Title"), New System.Data.Common.DataColumnMapping("Director", "Director"), New System.Data.Common.DataColumnMapping("Actor1", "Actor1"), New System.Data.Common.DataColumnMapping("Actor2", "Actor2"), New System.Data.Common.DataColumnMapping("Language", "Language"), New System.Data.Common.DataColumnMapping("Rating", "Rating"), New System.Data.Common.DataColumnMapping("Genre", "Genre"), New System.Data.Common.DataColumnMapping("Release_year", "Release_year"), New System.Data.Common.DataColumnMapping("Duration", "Duration"), New System.Data.Common.DataColumnMapping("Poster", "Poster")})})
        Me.DAViewMov1.UpdateCommand = Me.SqlUpdateCommand1
        '
        'DsViewMov11
        '
        Me.DsViewMov11.DataSetName = "DSViewMov1"
        Me.DsViewMov11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'DataGridView1
        '
        Me.DataGridView1.AllowUserToAddRows = False
        DataGridViewCellStyle2.BackColor = System.Drawing.SystemColors.ControlLight
        DataGridViewCellStyle2.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.DataGridView1.AlternatingRowsDefaultCellStyle = DataGridViewCellStyle2
        Me.DataGridView1.AutoGenerateColumns = False
        Me.DataGridView1.BackgroundColor = System.Drawing.Color.Gray
        Me.DataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.DataGridView1.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.MovieIdDataGridViewTextBoxColumn, Me.DVDIdDataGridViewTextBoxColumn, Me.TitleDataGridViewTextBoxColumn, Me.DirectorDataGridViewTextBoxColumn, Me.Actor1DataGridViewTextBoxColumn, Me.Actor2DataGridViewTextBoxColumn, Me.LanguageDataGridViewTextBoxColumn, Me.RatingDataGridViewTextBoxColumn, Me.GenreDataGridViewTextBoxColumn, Me.ReleaseyearDataGridViewTextBoxColumn, Me.DurationDataGridViewTextBoxColumn, Me.PosterDataGridViewTextBoxColumn})
        Me.DataGridView1.DataSource = Me.MovieBindingSource
        Me.DataGridView1.GridColor = System.Drawing.SystemColors.ControlDarkDark
        Me.DataGridView1.Location = New System.Drawing.Point(12, 128)
        Me.DataGridView1.Name = "DataGridView1"
        Me.DataGridView1.Size = New System.Drawing.Size(1091, 168)
        Me.DataGridView1.TabIndex = 21
        '
        'MovieIdDataGridViewTextBoxColumn
        '
        Me.MovieIdDataGridViewTextBoxColumn.DataPropertyName = "Movie_Id"
        Me.MovieIdDataGridViewTextBoxColumn.HeaderText = "Movie_Id"
        Me.MovieIdDataGridViewTextBoxColumn.Name = "MovieIdDataGridViewTextBoxColumn"
        Me.MovieIdDataGridViewTextBoxColumn.ReadOnly = True
        '
        'DVDIdDataGridViewTextBoxColumn
        '
        Me.DVDIdDataGridViewTextBoxColumn.DataPropertyName = "DVD_Id"
        Me.DVDIdDataGridViewTextBoxColumn.HeaderText = "DVD_Id"
        Me.DVDIdDataGridViewTextBoxColumn.Name = "DVDIdDataGridViewTextBoxColumn"
        '
        'TitleDataGridViewTextBoxColumn
        '
        Me.TitleDataGridViewTextBoxColumn.DataPropertyName = "Title"
        Me.TitleDataGridViewTextBoxColumn.HeaderText = "Title"
        Me.TitleDataGridViewTextBoxColumn.Name = "TitleDataGridViewTextBoxColumn"
        '
        'DirectorDataGridViewTextBoxColumn
        '
        Me.DirectorDataGridViewTextBoxColumn.DataPropertyName = "Director"
        Me.DirectorDataGridViewTextBoxColumn.HeaderText = "Director"
        Me.DirectorDataGridViewTextBoxColumn.Name = "DirectorDataGridViewTextBoxColumn"
        '
        'Actor1DataGridViewTextBoxColumn
        '
        Me.Actor1DataGridViewTextBoxColumn.DataPropertyName = "Actor1"
        Me.Actor1DataGridViewTextBoxColumn.HeaderText = "Actor1"
        Me.Actor1DataGridViewTextBoxColumn.Name = "Actor1DataGridViewTextBoxColumn"
        '
        'Actor2DataGridViewTextBoxColumn
        '
        Me.Actor2DataGridViewTextBoxColumn.DataPropertyName = "Actor2"
        Me.Actor2DataGridViewTextBoxColumn.HeaderText = "Actor2"
        Me.Actor2DataGridViewTextBoxColumn.Name = "Actor2DataGridViewTextBoxColumn"
        '
        'LanguageDataGridViewTextBoxColumn
        '
        Me.LanguageDataGridViewTextBoxColumn.DataPropertyName = "Language"
        Me.LanguageDataGridViewTextBoxColumn.HeaderText = "Language"
        Me.LanguageDataGridViewTextBoxColumn.Name = "LanguageDataGridViewTextBoxColumn"
        '
        'RatingDataGridViewTextBoxColumn
        '
        Me.RatingDataGridViewTextBoxColumn.DataPropertyName = "Rating"
        Me.RatingDataGridViewTextBoxColumn.HeaderText = "Rating"
        Me.RatingDataGridViewTextBoxColumn.Name = "RatingDataGridViewTextBoxColumn"
        '
        'GenreDataGridViewTextBoxColumn
        '
        Me.GenreDataGridViewTextBoxColumn.DataPropertyName = "Genre"
        Me.GenreDataGridViewTextBoxColumn.HeaderText = "Genre"
        Me.GenreDataGridViewTextBoxColumn.Name = "GenreDataGridViewTextBoxColumn"
        '
        'ReleaseyearDataGridViewTextBoxColumn
        '
        Me.ReleaseyearDataGridViewTextBoxColumn.DataPropertyName = "Release_year"
        Me.ReleaseyearDataGridViewTextBoxColumn.HeaderText = "Release_year"
        Me.ReleaseyearDataGridViewTextBoxColumn.Name = "ReleaseyearDataGridViewTextBoxColumn"
        '
        'DurationDataGridViewTextBoxColumn
        '
        Me.DurationDataGridViewTextBoxColumn.DataPropertyName = "Duration"
        Me.DurationDataGridViewTextBoxColumn.HeaderText = "Duration"
        Me.DurationDataGridViewTextBoxColumn.Name = "DurationDataGridViewTextBoxColumn"
        '
        'PosterDataGridViewTextBoxColumn
        '
        Me.PosterDataGridViewTextBoxColumn.DataPropertyName = "Poster"
        Me.PosterDataGridViewTextBoxColumn.HeaderText = "Poster"
        Me.PosterDataGridViewTextBoxColumn.Name = "PosterDataGridViewTextBoxColumn"
        '
        'MovieBindingSource
        '
        Me.MovieBindingSource.DataMember = "Movie"
        Me.MovieBindingSource.DataSource = Me.DsViewMov11
        '
        'bUpdate
        '
        Me.bUpdate.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bUpdate.Location = New System.Drawing.Point(636, 386)
        Me.bUpdate.Name = "bUpdate"
        Me.bUpdate.Size = New System.Drawing.Size(75, 23)
        Me.bUpdate.TabIndex = 26
        Me.bUpdate.Text = "Update"
        Me.bUpdate.UseVisualStyleBackColor = True
        '
        'bAdd
        '
        Me.bAdd.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bAdd.Location = New System.Drawing.Point(400, 386)
        Me.bAdd.Name = "bAdd"
        Me.bAdd.Size = New System.Drawing.Size(75, 23)
        Me.bAdd.TabIndex = 25
        Me.bAdd.Text = " Add"
        Me.bAdd.UseVisualStyleBackColor = True
        '
        'bBack
        '
        Me.bBack.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bBack.Location = New System.Drawing.Point(520, 386)
        Me.bBack.Name = "bBack"
        Me.bBack.Size = New System.Drawing.Size(75, 23)
        Me.bBack.TabIndex = 24
        Me.bBack.Text = " Back"
        Me.bBack.UseVisualStyleBackColor = True
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(1, 0)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(1111, 102)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 27
        Me.PictureBox1.TabStop = False
        '
        'ViewMovie
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Gray
        Me.ClientSize = New System.Drawing.Size(1106, 449)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.bUpdate)
        Me.Controls.Add(Me.bAdd)
        Me.Controls.Add(Me.bBack)
        Me.Controls.Add(Me.DataGridView1)
        Me.MaximizeBox = False
        Me.Name = "ViewMovie"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "ViewMovie"
        CType(Me.DsViewMov11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MovieBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents SqlSelectCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlConnection1 As System.Data.SqlClient.SqlConnection
    Friend WithEvents SqlInsertCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlUpdateCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DAViewMov1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents DsViewMov11 As DVD_STORE.DSViewMov1
    Friend WithEvents DataGridView1 As System.Windows.Forms.DataGridView
    Friend WithEvents MovieIdDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DVDIdDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents TitleDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DirectorDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents Actor1DataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents Actor2DataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents LanguageDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents RatingDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents GenreDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents ReleaseyearDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DurationDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents PosterDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents MovieBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents bUpdate As System.Windows.Forms.Button
    Friend WithEvents bAdd As System.Windows.Forms.Button
    Friend WithEvents bBack As System.Windows.Forms.Button
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
End Class
