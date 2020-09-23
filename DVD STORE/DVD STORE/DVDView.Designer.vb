<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class DVDView
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(DVDView))
        Dim DataGridViewCellStyle1 As System.Windows.Forms.DataGridViewCellStyle = New System.Windows.Forms.DataGridViewCellStyle()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.SqlSelectCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlConnection1 = New System.Data.SqlClient.SqlConnection()
        Me.SqlInsertCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.DAViewDVD1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.SqlUpdateCommand = New System.Data.SqlClient.SqlCommand()
        Me.DataGridView1 = New System.Windows.Forms.DataGridView()
        Me.DVDIdDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.FormatDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.StatusDataGridViewTextBoxColumn = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DVDBindingSource1 = New System.Windows.Forms.BindingSource(Me.components)
        Me.DsdvdView11 = New DVD_STORE.DSDVDView1()
        Me.DVDBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.bUpdate = New System.Windows.Forms.Button()
        Me.bAdd = New System.Windows.Forms.Button()
        Me.bBack = New System.Windows.Forms.Button()
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DVDBindingSource1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsdvdView11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DVDBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Label9
        '
        Me.Label9.Image = CType(resources.GetObject("Label9.Image"), System.Drawing.Image)
        Me.Label9.Location = New System.Drawing.Point(0, -1)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(787, 104)
        Me.Label9.TabIndex = 27
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
        'SqlDeleteCommand1
        '
        Me.SqlDeleteCommand1.CommandText = "DELETE FROM [DVD] WHERE (([DVD_Id] = @Original_DVD_Id) AND ((@IsNull_Format = 1 A" & _
            "ND [Format] IS NULL) OR ([Format] = @Original_Format)) AND ([Status] = @Original" & _
            "_Status))"
        Me.SqlDeleteCommand1.Connection = Me.SqlConnection1
        Me.SqlDeleteCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Original_DVD_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "DVD_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Format", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Format", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Format", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Format", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Status", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Status", System.Data.DataRowVersion.Original, Nothing)})
        '
        'DAViewDVD1
        '
        Me.DAViewDVD1.DeleteCommand = Me.SqlDeleteCommand1
        Me.DAViewDVD1.InsertCommand = Me.SqlInsertCommand1
        Me.DAViewDVD1.SelectCommand = Me.SqlSelectCommand1
        Me.DAViewDVD1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "DVD", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("DVD_Id", "DVD_Id"), New System.Data.Common.DataColumnMapping("Format", "Format"), New System.Data.Common.DataColumnMapping("Status", "Status")})})
        Me.DAViewDVD1.UpdateCommand = Me.SqlUpdateCommand
        '
        'SqlUpdateCommand
        '
        Me.SqlUpdateCommand.CommandText = resources.GetString("SqlUpdateCommand.CommandText")
        Me.SqlUpdateCommand.Connection = Me.SqlConnection1
        Me.SqlUpdateCommand.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Format", System.Data.SqlDbType.VarChar, 0, "Format"), New System.Data.SqlClient.SqlParameter("@Status", System.Data.SqlDbType.VarChar, 0, "Status"), New System.Data.SqlClient.SqlParameter("@Original_DVD_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "DVD_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Format", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Format", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Format", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Format", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Status", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Status", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@DVD_Id", System.Data.SqlDbType.Int, 4, "DVD_Id")})
        '
        'DataGridView1
        '
        Me.DataGridView1.AllowUserToAddRows = False
        DataGridViewCellStyle1.BackColor = System.Drawing.SystemColors.ControlLight
        Me.DataGridView1.AlternatingRowsDefaultCellStyle = DataGridViewCellStyle1
        Me.DataGridView1.AutoGenerateColumns = False
        Me.DataGridView1.BackgroundColor = System.Drawing.Color.Gray
        Me.DataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.DataGridView1.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.DVDIdDataGridViewTextBoxColumn, Me.FormatDataGridViewTextBoxColumn, Me.StatusDataGridViewTextBoxColumn})
        Me.DataGridView1.DataSource = Me.DVDBindingSource1
        Me.DataGridView1.Location = New System.Drawing.Point(148, 123)
        Me.DataGridView1.Name = "DataGridView1"
        Me.DataGridView1.Size = New System.Drawing.Size(343, 150)
        Me.DataGridView1.TabIndex = 28
        '
        'DVDIdDataGridViewTextBoxColumn
        '
        Me.DVDIdDataGridViewTextBoxColumn.DataPropertyName = "DVD_Id"
        Me.DVDIdDataGridViewTextBoxColumn.HeaderText = "DVD_Id"
        Me.DVDIdDataGridViewTextBoxColumn.Name = "DVDIdDataGridViewTextBoxColumn"
        Me.DVDIdDataGridViewTextBoxColumn.ReadOnly = True
        '
        'FormatDataGridViewTextBoxColumn
        '
        Me.FormatDataGridViewTextBoxColumn.DataPropertyName = "Format"
        Me.FormatDataGridViewTextBoxColumn.HeaderText = "Format"
        Me.FormatDataGridViewTextBoxColumn.Name = "FormatDataGridViewTextBoxColumn"
        '
        'StatusDataGridViewTextBoxColumn
        '
        Me.StatusDataGridViewTextBoxColumn.DataPropertyName = "Status"
        Me.StatusDataGridViewTextBoxColumn.HeaderText = "Status"
        Me.StatusDataGridViewTextBoxColumn.Name = "StatusDataGridViewTextBoxColumn"
        '
        'DVDBindingSource1
        '
        Me.DVDBindingSource1.DataMember = "DVD"
        Me.DVDBindingSource1.DataSource = Me.DsdvdView11
        '
        'DsdvdView11
        '
        Me.DsdvdView11.DataSetName = "DSDVDView1"
        Me.DsdvdView11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'bUpdate
        '
        Me.bUpdate.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bUpdate.Location = New System.Drawing.Point(403, 347)
        Me.bUpdate.Name = "bUpdate"
        Me.bUpdate.Size = New System.Drawing.Size(75, 23)
        Me.bUpdate.TabIndex = 31
        Me.bUpdate.Text = "Update"
        Me.bUpdate.UseVisualStyleBackColor = True
        '
        'bAdd
        '
        Me.bAdd.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bAdd.Location = New System.Drawing.Point(167, 347)
        Me.bAdd.Name = "bAdd"
        Me.bAdd.Size = New System.Drawing.Size(75, 23)
        Me.bAdd.TabIndex = 30
        Me.bAdd.Text = " Add"
        Me.bAdd.UseVisualStyleBackColor = True
        '
        'bBack
        '
        Me.bBack.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bBack.Location = New System.Drawing.Point(287, 347)
        Me.bBack.Name = "bBack"
        Me.bBack.Size = New System.Drawing.Size(75, 23)
        Me.bBack.TabIndex = 29
        Me.bBack.Text = " Back"
        Me.bBack.UseVisualStyleBackColor = True
        '
        'DVDView
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Gray
        Me.ClientSize = New System.Drawing.Size(786, 479)
        Me.Controls.Add(Me.bUpdate)
        Me.Controls.Add(Me.bAdd)
        Me.Controls.Add(Me.bBack)
        Me.Controls.Add(Me.DataGridView1)
        Me.Controls.Add(Me.Label9)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.Name = "DVDView"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "DVDView"
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DVDBindingSource1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsdvdView11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DVDBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents Label9 As System.Windows.Forms.Label
    Friend WithEvents SqlSelectCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlConnection1 As System.Data.SqlClient.SqlConnection
    Friend WithEvents SqlInsertCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DAViewDVD1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents SqlUpdateCommand As System.Data.SqlClient.SqlCommand
    Friend WithEvents DataGridView1 As System.Windows.Forms.DataGridView
    Friend WithEvents DVDIdDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents FormatDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents StatusDataGridViewTextBoxColumn As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents DVDBindingSource1 As System.Windows.Forms.BindingSource
    Friend WithEvents DsdvdView11 As DVD_STORE.DSDVDView1
    Friend WithEvents DVDBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents bUpdate As System.Windows.Forms.Button
    Friend WithEvents bAdd As System.Windows.Forms.Button
    Friend WithEvents bBack As System.Windows.Forms.Button
End Class
