<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form_CustomerDetail
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form_CustomerDetail))
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.tCustomerId = New System.Windows.Forms.TextBox()
        Me.tCustomerName = New System.Windows.Forms.TextBox()
        Me.CustomerBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.DsAddCust11 = New DVD_STORE.DSAddCust1()
        Me.tNIc = New System.Windows.Forms.TextBox()
        Me.CustomerBindingSource1 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tPAddress = New System.Windows.Forms.TextBox()
        Me.CustomerBindingSource2 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tTP = New System.Windows.Forms.TextBox()
        Me.CustomerBindingSource3 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tBirthDate = New System.Windows.Forms.TextBox()
        Me.CustomerBindingSource4 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tWorkAddress = New System.Windows.Forms.TextBox()
        Me.CustomerBindingSource5 = New System.Windows.Forms.BindingSource(Me.components)
        Me.bBack = New System.Windows.Forms.Button()
        Me.bAdd = New System.Windows.Forms.Button()
        Me.SqlSelectCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlConnection1 = New System.Data.SqlClient.SqlConnection()
        Me.SqlInsertCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlUpdateCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.DAAddCust1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        CType(Me.CustomerBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsAddCust11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.CustomerBindingSource1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.CustomerBindingSource2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.CustomerBindingSource3, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.CustomerBindingSource4, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.CustomerBindingSource5, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(258, 143)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(131, 20)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = " Customer Id"
        '
        'Label2
        '
        Me.Label2.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(258, 175)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(131, 20)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = " Customer Name"
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(258, 208)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(131, 20)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = " NIC Number"
        '
        'Label4
        '
        Me.Label4.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.Location = New System.Drawing.Point(258, 242)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(131, 18)
        Me.Label4.TabIndex = 3
        Me.Label4.Text = " Permenent Address"
        '
        'Label5
        '
        Me.Label5.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.Location = New System.Drawing.Point(258, 275)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(131, 20)
        Me.Label5.TabIndex = 4
        Me.Label5.Text = " TP No"
        '
        'Label6
        '
        Me.Label6.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label6.Location = New System.Drawing.Point(258, 307)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(131, 20)
        Me.Label6.TabIndex = 5
        Me.Label6.Text = " Birth Date"
        '
        'Label8
        '
        Me.Label8.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label8.Location = New System.Drawing.Point(258, 346)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(131, 21)
        Me.Label8.TabIndex = 7
        Me.Label8.Text = "Work Address"
        '
        'tCustomerId
        '
        Me.tCustomerId.Location = New System.Drawing.Point(423, 143)
        Me.tCustomerId.Name = "tCustomerId"
        Me.tCustomerId.ReadOnly = True
        Me.tCustomerId.Size = New System.Drawing.Size(164, 20)
        Me.tCustomerId.TabIndex = 8
        '
        'tCustomerName
        '
        Me.tCustomerName.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CustomerBindingSource, "Name", True))
        Me.tCustomerName.Location = New System.Drawing.Point(423, 172)
        Me.tCustomerName.Name = "tCustomerName"
        Me.tCustomerName.Size = New System.Drawing.Size(164, 20)
        Me.tCustomerName.TabIndex = 9
        '
        'CustomerBindingSource
        '
        Me.CustomerBindingSource.DataMember = "Customer"
        Me.CustomerBindingSource.DataSource = Me.DsAddCust11
        '
        'DsAddCust11
        '
        Me.DsAddCust11.DataSetName = "DSAddCust1"
        Me.DsAddCust11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'tNIc
        '
        Me.tNIc.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CustomerBindingSource1, "NIC_No", True))
        Me.tNIc.Location = New System.Drawing.Point(423, 205)
        Me.tNIc.Name = "tNIc"
        Me.tNIc.Size = New System.Drawing.Size(164, 20)
        Me.tNIc.TabIndex = 10
        '
        'CustomerBindingSource1
        '
        Me.CustomerBindingSource1.DataMember = "Customer"
        Me.CustomerBindingSource1.DataSource = Me.DsAddCust11
        '
        'tPAddress
        '
        Me.tPAddress.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CustomerBindingSource2, "Address_line1", True))
        Me.tPAddress.Location = New System.Drawing.Point(423, 239)
        Me.tPAddress.Name = "tPAddress"
        Me.tPAddress.Size = New System.Drawing.Size(164, 20)
        Me.tPAddress.TabIndex = 11
        '
        'CustomerBindingSource2
        '
        Me.CustomerBindingSource2.DataMember = "Customer"
        Me.CustomerBindingSource2.DataSource = Me.DsAddCust11
        '
        'tTP
        '
        Me.tTP.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CustomerBindingSource3, "Tel_No", True))
        Me.tTP.Location = New System.Drawing.Point(423, 272)
        Me.tTP.Name = "tTP"
        Me.tTP.Size = New System.Drawing.Size(164, 20)
        Me.tTP.TabIndex = 12
        '
        'CustomerBindingSource3
        '
        Me.CustomerBindingSource3.DataMember = "Customer"
        Me.CustomerBindingSource3.DataSource = Me.DsAddCust11
        '
        'tBirthDate
        '
        Me.tBirthDate.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CustomerBindingSource4, "Birth_date", True))
        Me.tBirthDate.Location = New System.Drawing.Point(423, 304)
        Me.tBirthDate.Name = "tBirthDate"
        Me.tBirthDate.Size = New System.Drawing.Size(164, 20)
        Me.tBirthDate.TabIndex = 13
        '
        'CustomerBindingSource4
        '
        Me.CustomerBindingSource4.DataMember = "Customer"
        Me.CustomerBindingSource4.DataSource = Me.DsAddCust11
        '
        'tWorkAddress
        '
        Me.tWorkAddress.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CustomerBindingSource5, "Address_line2", True))
        Me.tWorkAddress.Location = New System.Drawing.Point(423, 343)
        Me.tWorkAddress.Name = "tWorkAddress"
        Me.tWorkAddress.Size = New System.Drawing.Size(164, 20)
        Me.tWorkAddress.TabIndex = 15
        '
        'CustomerBindingSource5
        '
        Me.CustomerBindingSource5.DataMember = "Customer"
        Me.CustomerBindingSource5.DataSource = Me.DsAddCust11
        '
        'bBack
        '
        Me.bBack.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bBack.Location = New System.Drawing.Point(423, 408)
        Me.bBack.Name = "bBack"
        Me.bBack.Size = New System.Drawing.Size(75, 23)
        Me.bBack.TabIndex = 16
        Me.bBack.Text = " Back"
        Me.bBack.UseVisualStyleBackColor = True
        '
        'bAdd
        '
        Me.bAdd.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bAdd.Location = New System.Drawing.Point(512, 408)
        Me.bAdd.Name = "bAdd"
        Me.bAdd.Size = New System.Drawing.Size(75, 23)
        Me.bAdd.TabIndex = 17
        Me.bAdd.Text = " Add"
        Me.bAdd.UseVisualStyleBackColor = True
        '
        'SqlSelectCommand1
        '
        Me.SqlSelectCommand1.CommandText = "SELECT        Customer.*" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            Customer"
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
        Me.SqlInsertCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Name", System.Data.SqlDbType.VarChar, 0, "Name"), New System.Data.SqlClient.SqlParameter("@Tel_No", System.Data.SqlDbType.Int, 0, "Tel_No"), New System.Data.SqlClient.SqlParameter("@NIC_No", System.Data.SqlDbType.VarChar, 0, "NIC_No"), New System.Data.SqlClient.SqlParameter("@Birth_date", System.Data.SqlDbType.[Date], 0, "Birth_date"), New System.Data.SqlClient.SqlParameter("@Address_line1", System.Data.SqlDbType.VarChar, 0, "Address_line1"), New System.Data.SqlClient.SqlParameter("@Address_line2", System.Data.SqlDbType.VarChar, 0, "Address_line2")})
        '
        'SqlUpdateCommand1
        '
        Me.SqlUpdateCommand1.CommandText = resources.GetString("SqlUpdateCommand1.CommandText")
        Me.SqlUpdateCommand1.Connection = Me.SqlConnection1
        Me.SqlUpdateCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Name", System.Data.SqlDbType.VarChar, 0, "Name"), New System.Data.SqlClient.SqlParameter("@Tel_No", System.Data.SqlDbType.Int, 0, "Tel_No"), New System.Data.SqlClient.SqlParameter("@NIC_No", System.Data.SqlDbType.VarChar, 0, "NIC_No"), New System.Data.SqlClient.SqlParameter("@Birth_date", System.Data.SqlDbType.[Date], 0, "Birth_date"), New System.Data.SqlClient.SqlParameter("@Address_line1", System.Data.SqlDbType.VarChar, 0, "Address_line1"), New System.Data.SqlClient.SqlParameter("@Address_line2", System.Data.SqlDbType.VarChar, 0, "Address_line2"), New System.Data.SqlClient.SqlParameter("@Original_Customer_ID", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Customer_ID", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Name", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Name", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Name", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Name", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Tel_No", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Tel_No", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Tel_No", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Tel_No", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_NIC_No", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "NIC_No", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_NIC_No", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "NIC_No", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Birth_date", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Birth_date", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Birth_date", System.Data.SqlDbType.[Date], 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Birth_date", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Address_line1", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Address_line1", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Address_line1", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Address_line1", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Address_line2", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Address_line2", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Address_line2", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Address_line2", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Customer_ID", System.Data.SqlDbType.Int, 4, "Customer_ID")})
        '
        'SqlDeleteCommand1
        '
        Me.SqlDeleteCommand1.CommandText = resources.GetString("SqlDeleteCommand1.CommandText")
        Me.SqlDeleteCommand1.Connection = Me.SqlConnection1
        Me.SqlDeleteCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Original_Customer_ID", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Customer_ID", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Name", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Name", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Name", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Name", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Tel_No", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Tel_No", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Tel_No", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Tel_No", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_NIC_No", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "NIC_No", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_NIC_No", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "NIC_No", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Birth_date", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Birth_date", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Birth_date", System.Data.SqlDbType.[Date], 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Birth_date", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Address_line1", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Address_line1", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Address_line1", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Address_line1", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Address_line2", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Address_line2", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Address_line2", System.Data.SqlDbType.VarChar, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Address_line2", System.Data.DataRowVersion.Original, Nothing)})
        '
        'DAAddCust1
        '
        Me.DAAddCust1.DeleteCommand = Me.SqlDeleteCommand1
        Me.DAAddCust1.InsertCommand = Me.SqlInsertCommand1
        Me.DAAddCust1.SelectCommand = Me.SqlSelectCommand1
        Me.DAAddCust1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Customer", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("Customer_ID", "Customer_ID"), New System.Data.Common.DataColumnMapping("Name", "Name"), New System.Data.Common.DataColumnMapping("Tel_No", "Tel_No"), New System.Data.Common.DataColumnMapping("NIC_No", "NIC_No"), New System.Data.Common.DataColumnMapping("Birth_date", "Birth_date"), New System.Data.Common.DataColumnMapping("Address_line1", "Address_line1"), New System.Data.Common.DataColumnMapping("Address_line2", "Address_line2")})})
        Me.DAAddCust1.UpdateCommand = Me.SqlUpdateCommand1
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(1, 0)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(819, 101)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 18
        Me.PictureBox1.TabStop = False
        '
        'Form_CustomerDetail
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Gray
        Me.ClientSize = New System.Drawing.Size(820, 511)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.bAdd)
        Me.Controls.Add(Me.bBack)
        Me.Controls.Add(Me.tWorkAddress)
        Me.Controls.Add(Me.tBirthDate)
        Me.Controls.Add(Me.tTP)
        Me.Controls.Add(Me.tPAddress)
        Me.Controls.Add(Me.tNIc)
        Me.Controls.Add(Me.tCustomerName)
        Me.Controls.Add(Me.tCustomerId)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Name = "Form_CustomerDetail"
        Me.Text = "Customer Details"
        CType(Me.CustomerBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsAddCust11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.CustomerBindingSource1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.CustomerBindingSource2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.CustomerBindingSource3, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.CustomerBindingSource4, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.CustomerBindingSource5, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents Label8 As System.Windows.Forms.Label
    Friend WithEvents tCustomerId As System.Windows.Forms.TextBox
    Friend WithEvents tCustomerName As System.Windows.Forms.TextBox
    Friend WithEvents tNIc As System.Windows.Forms.TextBox
    Friend WithEvents tPAddress As System.Windows.Forms.TextBox
    Friend WithEvents tTP As System.Windows.Forms.TextBox
    Friend WithEvents tBirthDate As System.Windows.Forms.TextBox
    Friend WithEvents tWorkAddress As System.Windows.Forms.TextBox
    Friend WithEvents bBack As System.Windows.Forms.Button
    Friend WithEvents bAdd As System.Windows.Forms.Button
    Friend WithEvents CustomerBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents DsAddCust11 As DVD_STORE.DSAddCust1
    Friend WithEvents CustomerBindingSource1 As System.Windows.Forms.BindingSource
    Friend WithEvents CustomerBindingSource2 As System.Windows.Forms.BindingSource
    Friend WithEvents CustomerBindingSource3 As System.Windows.Forms.BindingSource
    Friend WithEvents CustomerBindingSource4 As System.Windows.Forms.BindingSource
    Friend WithEvents CustomerBindingSource5 As System.Windows.Forms.BindingSource
    Friend WithEvents SqlSelectCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlConnection1 As System.Data.SqlClient.SqlConnection
    Friend WithEvents SqlInsertCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlUpdateCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DAAddCust1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
End Class
