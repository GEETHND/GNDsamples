<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class DVDStorage
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(DVDStorage))
        Me.bAdd = New System.Windows.Forms.Button()
        Me.bBack = New System.Windows.Forms.Button()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.tformat = New System.Windows.Forms.ComboBox()
        Me.DVDBindingSource1 = New System.Windows.Forms.BindingSource(Me.components)
        Me.DsAddDVD11 = New DVD_STORE.DSAddDVD1()
        Me.txtDVDId = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.SqlSelectCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlConnection1 = New System.Data.SqlClient.SqlConnection()
        Me.SqlInsertCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlUpdateCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.DAAddDVD1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.tStatus = New System.Windows.Forms.ComboBox()
        Me.DVDBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        CType(Me.DVDBindingSource1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsAddDVD11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DVDBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'bAdd
        '
        Me.bAdd.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bAdd.Location = New System.Drawing.Point(360, 375)
        Me.bAdd.Name = "bAdd"
        Me.bAdd.Size = New System.Drawing.Size(75, 23)
        Me.bAdd.TabIndex = 32
        Me.bAdd.Text = " Add"
        Me.bAdd.UseVisualStyleBackColor = True
        '
        'bBack
        '
        Me.bBack.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bBack.Location = New System.Drawing.Point(242, 375)
        Me.bBack.Name = "bBack"
        Me.bBack.Size = New System.Drawing.Size(75, 23)
        Me.bBack.TabIndex = 31
        Me.bBack.Text = " Back"
        Me.bBack.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.ForeColor = System.Drawing.SystemColors.Window
        Me.Label2.Location = New System.Drawing.Point(131, 249)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(117, 27)
        Me.Label2.TabIndex = 30
        Me.Label2.Text = "Format"
        '
        'tformat
        '
        Me.tformat.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.DVDBindingSource1, "Format", True))
        Me.tformat.FormattingEnabled = True
        Me.tformat.Items.AddRange(New Object() {"DVD-ROM", "DVD-D", "DVD Plus", "DVD-R for Authoring", "DVD-R", "DVD-RW", "DVD-R DL", "DVD-RW DL", "DVD-RAM", "DVD-AR", "DVD+R", "DVD+RW", "DVD+R DL", "DVD+RW DL", "Other"})
        Me.tformat.Location = New System.Drawing.Point(314, 249)
        Me.tformat.Name = "tformat"
        Me.tformat.Size = New System.Drawing.Size(121, 21)
        Me.tformat.TabIndex = 29
        Me.tformat.Text = "Other"
        '
        'DVDBindingSource1
        '
        Me.DVDBindingSource1.DataMember = "DVD"
        Me.DVDBindingSource1.DataSource = Me.DsAddDVD11
        '
        'DsAddDVD11
        '
        Me.DsAddDVD11.DataSetName = "DSAddDVD1"
        Me.DsAddDVD11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'txtDVDId
        '
        Me.txtDVDId.Location = New System.Drawing.Point(314, 179)
        Me.txtDVDId.Name = "txtDVDId"
        Me.txtDVDId.ReadOnly = True
        Me.txtDVDId.Size = New System.Drawing.Size(121, 20)
        Me.txtDVDId.TabIndex = 28
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.SystemColors.Window
        Me.Label1.Location = New System.Drawing.Point(131, 179)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(117, 27)
        Me.Label1.TabIndex = 27
        Me.Label1.Text = "DVD Id"
        '
        'Label9
        '
        Me.Label9.Image = CType(resources.GetObject("Label9.Image"), System.Drawing.Image)
        Me.Label9.Location = New System.Drawing.Point(1, -1)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(787, 104)
        Me.Label9.TabIndex = 26
        '
        'SqlSelectCommand1
        '
        Me.SqlSelectCommand1.CommandText = "SELECT        DVD.*" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            DVD"
        Me.SqlSelectCommand1.Connection = Me.SqlConnection1
        '
        'SqlConnection1
        '
        Me.SqlConnection1.ConnectionString = "Data Source=.;Initial Catalog=F5;Integrated Security=True"
        Me.SqlConnection1.FireInfoMessageEventOnUserErrors = False
        '
        'SqlInsertCommand1
        '
        Me.SqlInsertCommand1.CommandText = "INSERT INTO [DVD] ([Format], [Status]) VALUES (@Format, @Status);" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "SELECT DVD_Id," & _
            " Format, Status FROM DVD WHERE (DVD_Id = SCOPE_IDENTITY())"
        Me.SqlInsertCommand1.Connection = Me.SqlConnection1
        Me.SqlInsertCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Format", System.Data.SqlDbType.VarChar, 0, "Format"), New System.Data.SqlClient.SqlParameter("@Status", System.Data.SqlDbType.VarChar, 0, "Status")})
        '
        'SqlUpdateCommand1
        '
        Me.SqlUpdateCommand1.CommandText = resources.GetString("SqlUpdateCommand1.CommandText")
        Me.SqlUpdateCommand1.Connection = Me.SqlConnection1
        Me.SqlUpdateCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Format", System.Data.SqlDbType.VarChar, 0, "Format"), New System.Data.SqlClient.SqlParameter("@Status", System.Data.SqlDbType.VarChar, 0, "Status"), New System.Data.SqlClient.SqlParameter("@Original_DVD_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "DVD_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Format", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Format", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Format", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Format", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Status", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Status", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@DVD_Id", System.Data.SqlDbType.Int, 4, "DVD_Id")})
        '
        'SqlDeleteCommand1
        '
        Me.SqlDeleteCommand1.CommandText = "DELETE FROM [DVD] WHERE (([DVD_Id] = @Original_DVD_Id) AND ((@IsNull_Format = 1 A" & _
            "ND [Format] IS NULL) OR ([Format] = @Original_Format)) AND ([Status] = @Original" & _
            "_Status))"
        Me.SqlDeleteCommand1.Connection = Me.SqlConnection1
        Me.SqlDeleteCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Original_DVD_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "DVD_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Format", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Format", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Format", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Format", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Status", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Status", System.Data.DataRowVersion.Original, Nothing)})
        '
        'DAAddDVD1
        '
        Me.DAAddDVD1.DeleteCommand = Me.SqlDeleteCommand1
        Me.DAAddDVD1.InsertCommand = Me.SqlInsertCommand1
        Me.DAAddDVD1.SelectCommand = Me.SqlSelectCommand1
        Me.DAAddDVD1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "DVD", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("DVD_Id", "DVD_Id"), New System.Data.Common.DataColumnMapping("Format", "Format"), New System.Data.Common.DataColumnMapping("Status", "Status")})})
        Me.DAAddDVD1.UpdateCommand = Me.SqlUpdateCommand1
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.ForeColor = System.Drawing.SystemColors.Window
        Me.Label3.Location = New System.Drawing.Point(131, 216)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(117, 27)
        Me.Label3.TabIndex = 34
        Me.Label3.Text = "Status"
        '
        'tStatus
        '
        Me.tStatus.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.DVDBindingSource, "Status", True))
        Me.tStatus.FormattingEnabled = True
        Me.tStatus.Items.AddRange(New Object() {"In", "Out"})
        Me.tStatus.Location = New System.Drawing.Point(314, 216)
        Me.tStatus.Name = "tStatus"
        Me.tStatus.Size = New System.Drawing.Size(121, 21)
        Me.tStatus.TabIndex = 33
        Me.tStatus.Text = "In"
        '
        'DVDBindingSource
        '
        Me.DVDBindingSource.DataMember = "DVD"
        Me.DVDBindingSource.DataSource = Me.DsAddDVD11
        '
        'DVDStorage
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Gray
        Me.ClientSize = New System.Drawing.Size(788, 457)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.tStatus)
        Me.Controls.Add(Me.bAdd)
        Me.Controls.Add(Me.bBack)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.tformat)
        Me.Controls.Add(Me.txtDVDId)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Label9)
        Me.MaximizeBox = False
        Me.Name = "DVDStorage"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "DVDStorage"
        CType(Me.DVDBindingSource1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsAddDVD11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DVDBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents bAdd As System.Windows.Forms.Button
    Friend WithEvents bBack As System.Windows.Forms.Button
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents tformat As System.Windows.Forms.ComboBox
    Friend WithEvents txtDVDId As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label9 As System.Windows.Forms.Label
    Friend WithEvents DVDBindingSource1 As System.Windows.Forms.BindingSource
    Friend WithEvents DsAddDVD11 As DVD_STORE.DSAddDVD1
    Friend WithEvents SqlSelectCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlConnection1 As System.Data.SqlClient.SqlConnection
    Friend WithEvents SqlInsertCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlUpdateCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DAAddDVD1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents tStatus As System.Windows.Forms.ComboBox
    Friend WithEvents DVDBindingSource As System.Windows.Forms.BindingSource
End Class
