<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form_DvdCopyIssue
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form_DvdCopyIssue))
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.RentalBindingSource2 = New System.Windows.Forms.BindingSource(Me.components)
        Me.DsRentDVD11 = New DVD_STORE.DSRentDVD1()
        Me.RentalBindingSource3 = New System.Windows.Forms.BindingSource(Me.components)
        Me.tPrimaryPayment = New System.Windows.Forms.TextBox()
        Me.RentalBindingSource4 = New System.Windows.Forms.BindingSource(Me.components)
        Me.bBack = New System.Windows.Forms.Button()
        Me.bAdd = New System.Windows.Forms.Button()
        Me.RentalBindingSource5 = New System.Windows.Forms.BindingSource(Me.components)
        Me.Label6 = New System.Windows.Forms.Label()
        Me.tDvdCopyNumber = New System.Windows.Forms.ComboBox()
        Me.RentalBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.DsGetDVDid11 = New DVD_STORE.DSGetDVDid1()
        Me.SqlSelectCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlConnection1 = New System.Data.SqlClient.SqlConnection()
        Me.SqlInsertCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.DAGetDVDid1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.DVDBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.SqlSelectCommand2 = New System.Data.SqlClient.SqlCommand()
        Me.SqlInsertCommand2 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand2 = New System.Data.SqlClient.SqlCommand()
        Me.DAGetCust1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.DsGetCust11 = New DVD_STORE.DSGetCust1()
        Me.tCustId = New System.Windows.Forms.ComboBox()
        Me.RentalBindingSource1 = New System.Windows.Forms.BindingSource(Me.components)
        Me.SqlSelectCommand3 = New System.Data.SqlClient.SqlCommand()
        Me.SqlInsertCommand3 = New System.Data.SqlClient.SqlCommand()
        Me.SqlUpdateCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand3 = New System.Data.SqlClient.SqlCommand()
        Me.DArentDVD1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.SqlSelectCommand4 = New System.Data.SqlClient.SqlCommand()
        Me.SqlInsertCommand4 = New System.Data.SqlClient.SqlCommand()
        Me.DAupdateStock1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.DSupdateStock11 = New DVD_STORE.DSupdateStock1()
        Me.tRentDate = New System.Windows.Forms.DateTimePicker()
        Me.tDueDate = New System.Windows.Forms.DateTimePicker()
        Me.tEmpId = New System.Windows.Forms.ComboBox()
        Me.DsEmpId11 = New DVD_STORE.DSEmpId1()
        Me.SqlSelectCommand5 = New System.Data.SqlClient.SqlCommand()
        Me.SqlDeleteCommand4 = New System.Data.SqlClient.SqlCommand()
        Me.DAEmpId1 = New System.Data.SqlClient.SqlDataAdapter()
        CType(Me.RentalBindingSource2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsRentDVD11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.RentalBindingSource3, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.RentalBindingSource4, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.RentalBindingSource5, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.RentalBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsGetDVDid11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DVDBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsGetCust11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.RentalBindingSource1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DSupdateStock11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsEmpId11, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.SystemColors.Window
        Me.Label1.Location = New System.Drawing.Point(258, 164)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(118, 23)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Dvd Copy Number"
        '
        'Label2
        '
        Me.Label2.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.ForeColor = System.Drawing.SystemColors.Window
        Me.Label2.Location = New System.Drawing.Point(256, 202)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(120, 23)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = " Customer Id"
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.ForeColor = System.Drawing.SystemColors.Window
        Me.Label3.Location = New System.Drawing.Point(256, 237)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(120, 23)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = " Rent Date"
        '
        'Label4
        '
        Me.Label4.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.ForeColor = System.Drawing.SystemColors.Window
        Me.Label4.Location = New System.Drawing.Point(256, 269)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(120, 23)
        Me.Label4.TabIndex = 3
        Me.Label4.Text = " Due Date"
        '
        'Label5
        '
        Me.Label5.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.ForeColor = System.Drawing.SystemColors.Window
        Me.Label5.Location = New System.Drawing.Point(257, 305)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(118, 23)
        Me.Label5.TabIndex = 4
        Me.Label5.Text = " Primary Payment"
        '
        'RentalBindingSource2
        '
        Me.RentalBindingSource2.DataMember = "Rental"
        Me.RentalBindingSource2.DataSource = Me.DsRentDVD11
        '
        'DsRentDVD11
        '
        Me.DsRentDVD11.DataSetName = "DSRentDVD1"
        Me.DsRentDVD11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'RentalBindingSource3
        '
        Me.RentalBindingSource3.DataMember = "Rental"
        Me.RentalBindingSource3.DataSource = Me.DsRentDVD11
        '
        'tPrimaryPayment
        '
        Me.tPrimaryPayment.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.RentalBindingSource4, "Payment_Rs", True))
        Me.tPrimaryPayment.Location = New System.Drawing.Point(400, 303)
        Me.tPrimaryPayment.Name = "tPrimaryPayment"
        Me.tPrimaryPayment.Size = New System.Drawing.Size(165, 20)
        Me.tPrimaryPayment.TabIndex = 9
        '
        'RentalBindingSource4
        '
        Me.RentalBindingSource4.DataMember = "Rental"
        Me.RentalBindingSource4.DataSource = Me.DsRentDVD11
        '
        'bBack
        '
        Me.bBack.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bBack.Location = New System.Drawing.Point(400, 408)
        Me.bBack.Name = "bBack"
        Me.bBack.Size = New System.Drawing.Size(77, 23)
        Me.bBack.TabIndex = 10
        Me.bBack.Text = " Back"
        Me.bBack.UseVisualStyleBackColor = True
        '
        'bAdd
        '
        Me.bAdd.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bAdd.Location = New System.Drawing.Point(483, 408)
        Me.bAdd.Name = "bAdd"
        Me.bAdd.Size = New System.Drawing.Size(82, 23)
        Me.bAdd.TabIndex = 11
        Me.bAdd.Text = " Add"
        Me.bAdd.UseVisualStyleBackColor = True
        '
        'RentalBindingSource5
        '
        Me.RentalBindingSource5.DataMember = "Rental"
        Me.RentalBindingSource5.DataSource = Me.DsRentDVD11
        '
        'Label6
        '
        Me.Label6.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label6.ForeColor = System.Drawing.SystemColors.Window
        Me.Label6.Location = New System.Drawing.Point(258, 342)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(120, 23)
        Me.Label6.TabIndex = 12
        Me.Label6.Text = " Emp Id"
        '
        'tDvdCopyNumber
        '
        Me.tDvdCopyNumber.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.RentalBindingSource, "DVD_Id", True))
        Me.tDvdCopyNumber.DataSource = Me.DsGetDVDid11
        Me.tDvdCopyNumber.DisplayMember = "DVD.DVD_Id"
        Me.tDvdCopyNumber.FormattingEnabled = True
        Me.tDvdCopyNumber.Location = New System.Drawing.Point(400, 164)
        Me.tDvdCopyNumber.Name = "tDvdCopyNumber"
        Me.tDvdCopyNumber.Size = New System.Drawing.Size(156, 21)
        Me.tDvdCopyNumber.TabIndex = 14
        '
        'RentalBindingSource
        '
        Me.RentalBindingSource.DataMember = "Rental"
        Me.RentalBindingSource.DataSource = Me.DsRentDVD11
        '
        'DsGetDVDid11
        '
        Me.DsGetDVDid11.DataSetName = "DSGetDVDid1"
        Me.DsGetDVDid11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'SqlSelectCommand1
        '
        Me.SqlSelectCommand1.CommandText = "SELECT        DVD_Id" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            DVD"
        Me.SqlSelectCommand1.Connection = Me.SqlConnection1
        '
        'SqlConnection1
        '
        Me.SqlConnection1.ConnectionString = "Data Source=.;Initial Catalog=F5;Integrated Security=True"
        Me.SqlConnection1.FireInfoMessageEventOnUserErrors = False
        '
        'SqlInsertCommand1
        '
        Me.SqlInsertCommand1.CommandText = "INSERT INTO [DVD] DEFAULT VALUES;" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "SELECT DVD_Id FROM DVD WHERE (DVD_Id = SCOPE_I" & _
            "DENTITY())"
        Me.SqlInsertCommand1.Connection = Me.SqlConnection1
        '
        'SqlDeleteCommand1
        '
        Me.SqlDeleteCommand1.CommandText = "DELETE FROM [DVD] WHERE (([DVD_Id] = @Original_DVD_Id))"
        Me.SqlDeleteCommand1.Connection = Me.SqlConnection1
        Me.SqlDeleteCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Original_DVD_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "DVD_Id", System.Data.DataRowVersion.Original, Nothing)})
        '
        'DAGetDVDid1
        '
        Me.DAGetDVDid1.DeleteCommand = Me.SqlDeleteCommand1
        Me.DAGetDVDid1.InsertCommand = Me.SqlInsertCommand1
        Me.DAGetDVDid1.SelectCommand = Me.SqlSelectCommand1
        Me.DAGetDVDid1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "DVD", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("DVD_Id", "DVD_Id")})})
        '
        'DVDBindingSource
        '
        Me.DVDBindingSource.DataMember = "DVD"
        Me.DVDBindingSource.DataSource = Me.DsGetDVDid11
        '
        'PictureBox1
        '
        Me.PictureBox1.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Left) _
                    Or System.Windows.Forms.AnchorStyles.Right), System.Windows.Forms.AnchorStyles)
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(0, 0)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(825, 102)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 15
        Me.PictureBox1.TabStop = False
        '
        'SqlSelectCommand2
        '
        Me.SqlSelectCommand2.CommandText = "SELECT        Customer_ID" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            Customer"
        Me.SqlSelectCommand2.Connection = Me.SqlConnection1
        '
        'SqlInsertCommand2
        '
        Me.SqlInsertCommand2.CommandText = "INSERT INTO [Customer] DEFAULT VALUES;" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "SELECT Customer_ID FROM Customer WHERE (C" & _
            "ustomer_ID = SCOPE_IDENTITY())"
        Me.SqlInsertCommand2.Connection = Me.SqlConnection1
        '
        'SqlDeleteCommand2
        '
        Me.SqlDeleteCommand2.CommandText = "DELETE FROM [Customer] WHERE (([Customer_ID] = @Original_Customer_ID))"
        Me.SqlDeleteCommand2.Connection = Me.SqlConnection1
        Me.SqlDeleteCommand2.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Original_Customer_ID", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Customer_ID", System.Data.DataRowVersion.Original, Nothing)})
        '
        'DAGetCust1
        '
        Me.DAGetCust1.DeleteCommand = Me.SqlDeleteCommand2
        Me.DAGetCust1.InsertCommand = Me.SqlInsertCommand2
        Me.DAGetCust1.SelectCommand = Me.SqlSelectCommand2
        Me.DAGetCust1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Customer", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("Customer_ID", "Customer_ID")})})
        '
        'DsGetCust11
        '
        Me.DsGetCust11.DataSetName = "DSGetCust1"
        Me.DsGetCust11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'tCustId
        '
        Me.tCustId.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.RentalBindingSource1, "Customer_Id", True))
        Me.tCustId.DataSource = Me.DsGetCust11
        Me.tCustId.DisplayMember = "Customer.Customer_ID"
        Me.tCustId.FormattingEnabled = True
        Me.tCustId.Location = New System.Drawing.Point(402, 200)
        Me.tCustId.Name = "tCustId"
        Me.tCustId.Size = New System.Drawing.Size(156, 21)
        Me.tCustId.TabIndex = 16
        '
        'RentalBindingSource1
        '
        Me.RentalBindingSource1.DataMember = "Rental"
        Me.RentalBindingSource1.DataSource = Me.DsRentDVD11
        '
        'SqlSelectCommand3
        '
        Me.SqlSelectCommand3.CommandText = "SELECT        Rental_Id, Emp_Id, Customer_Id, DVD_Id, Date, Payment_Rs, Due_date" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            Rental"
        Me.SqlSelectCommand3.Connection = Me.SqlConnection1
        '
        'SqlInsertCommand3
        '
        Me.SqlInsertCommand3.CommandText = resources.GetString("SqlInsertCommand3.CommandText")
        Me.SqlInsertCommand3.Connection = Me.SqlConnection1
        Me.SqlInsertCommand3.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Emp_Id", System.Data.SqlDbType.Int, 0, "Emp_Id"), New System.Data.SqlClient.SqlParameter("@Customer_Id", System.Data.SqlDbType.Int, 0, "Customer_Id"), New System.Data.SqlClient.SqlParameter("@DVD_Id", System.Data.SqlDbType.Int, 0, "DVD_Id"), New System.Data.SqlClient.SqlParameter("@Date", System.Data.SqlDbType.[Date], 0, "Date"), New System.Data.SqlClient.SqlParameter("@Payment_Rs", System.Data.SqlDbType.Int, 0, "Payment_Rs"), New System.Data.SqlClient.SqlParameter("@Due_date", System.Data.SqlDbType.[Date], 0, "Due_date")})
        '
        'SqlUpdateCommand1
        '
        Me.SqlUpdateCommand1.CommandText = resources.GetString("SqlUpdateCommand1.CommandText")
        Me.SqlUpdateCommand1.Connection = Me.SqlConnection1
        Me.SqlUpdateCommand1.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Emp_Id", System.Data.SqlDbType.Int, 0, "Emp_Id"), New System.Data.SqlClient.SqlParameter("@Customer_Id", System.Data.SqlDbType.Int, 0, "Customer_Id"), New System.Data.SqlClient.SqlParameter("@DVD_Id", System.Data.SqlDbType.Int, 0, "DVD_Id"), New System.Data.SqlClient.SqlParameter("@Date", System.Data.SqlDbType.[Date], 0, "Date"), New System.Data.SqlClient.SqlParameter("@Payment_Rs", System.Data.SqlDbType.Int, 0, "Payment_Rs"), New System.Data.SqlClient.SqlParameter("@Due_date", System.Data.SqlDbType.[Date], 0, "Due_date"), New System.Data.SqlClient.SqlParameter("@Original_Rental_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Rental_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Emp_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Emp_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Customer_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Customer_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_DVD_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "DVD_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Date", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Date", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Date", System.Data.SqlDbType.[Date], 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Date", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Payment_Rs", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Payment_Rs", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Payment_Rs", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Payment_Rs", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Due_date", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Due_date", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Due_date", System.Data.SqlDbType.[Date], 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Due_date", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Rental_Id", System.Data.SqlDbType.Int, 4, "Rental_Id")})
        '
        'SqlDeleteCommand3
        '
        Me.SqlDeleteCommand3.CommandText = resources.GetString("SqlDeleteCommand3.CommandText")
        Me.SqlDeleteCommand3.Connection = Me.SqlConnection1
        Me.SqlDeleteCommand3.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Original_Rental_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Rental_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Emp_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Emp_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_Customer_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Customer_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@Original_DVD_Id", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "DVD_Id", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Date", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Date", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Date", System.Data.SqlDbType.[Date], 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Date", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Payment_Rs", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Payment_Rs", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Payment_Rs", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Payment_Rs", System.Data.DataRowVersion.Original, Nothing), New System.Data.SqlClient.SqlParameter("@IsNull_Due_date", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, CType(0, Byte), CType(0, Byte), "Due_date", System.Data.DataRowVersion.Original, True, Nothing, "", "", ""), New System.Data.SqlClient.SqlParameter("@Original_Due_date", System.Data.SqlDbType.[Date], 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Due_date", System.Data.DataRowVersion.Original, Nothing)})
        '
        'DArentDVD1
        '
        Me.DArentDVD1.DeleteCommand = Me.SqlDeleteCommand3
        Me.DArentDVD1.InsertCommand = Me.SqlInsertCommand3
        Me.DArentDVD1.SelectCommand = Me.SqlSelectCommand3
        Me.DArentDVD1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Rental", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("Rental_Id", "Rental_Id"), New System.Data.Common.DataColumnMapping("Emp_Id", "Emp_Id"), New System.Data.Common.DataColumnMapping("Customer_Id", "Customer_Id"), New System.Data.Common.DataColumnMapping("DVD_Id", "DVD_Id"), New System.Data.Common.DataColumnMapping("Date", "Date"), New System.Data.Common.DataColumnMapping("Payment_Rs", "Payment_Rs"), New System.Data.Common.DataColumnMapping("Due_date", "Due_date")})})
        Me.DArentDVD1.UpdateCommand = Me.SqlUpdateCommand1
        '
        'SqlSelectCommand4
        '
        Me.SqlSelectCommand4.CommandText = "SELECT        Status" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            DVD"
        Me.SqlSelectCommand4.Connection = Me.SqlConnection1
        '
        'SqlInsertCommand4
        '
        Me.SqlInsertCommand4.CommandText = "INSERT INTO [DVD] ([Status]) VALUES (@Status)"
        Me.SqlInsertCommand4.Connection = Me.SqlConnection1
        Me.SqlInsertCommand4.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Status", System.Data.SqlDbType.VarChar, 0, "Status")})
        '
        'DAupdateStock1
        '
        Me.DAupdateStock1.InsertCommand = Me.SqlInsertCommand4
        Me.DAupdateStock1.SelectCommand = Me.SqlSelectCommand4
        Me.DAupdateStock1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "DVD", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("Status", "Status")})})
        '
        'DSupdateStock11
        '
        Me.DSupdateStock11.DataSetName = "DSupdateStock1"
        Me.DSupdateStock11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'tRentDate
        '
        Me.tRentDate.Location = New System.Drawing.Point(402, 237)
        Me.tRentDate.Name = "tRentDate"
        Me.tRentDate.Size = New System.Drawing.Size(200, 20)
        Me.tRentDate.TabIndex = 17
        '
        'tDueDate
        '
        Me.tDueDate.Location = New System.Drawing.Point(402, 269)
        Me.tDueDate.Name = "tDueDate"
        Me.tDueDate.Size = New System.Drawing.Size(200, 20)
        Me.tDueDate.TabIndex = 18
        '
        'tEmpId
        '
        Me.tEmpId.DataSource = Me.DsEmpId11
        Me.tEmpId.DisplayMember = "Employee.Emp_ID"
        Me.tEmpId.FormattingEnabled = True
        Me.tEmpId.Location = New System.Drawing.Point(400, 340)
        Me.tEmpId.Name = "tEmpId"
        Me.tEmpId.Size = New System.Drawing.Size(165, 21)
        Me.tEmpId.TabIndex = 19
        '
        'DsEmpId11
        '
        Me.DsEmpId11.DataSetName = "DSEmpId1"
        Me.DsEmpId11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'SqlSelectCommand5
        '
        Me.SqlSelectCommand5.CommandText = "SELECT        Emp_ID" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            Employee"
        Me.SqlSelectCommand5.Connection = Me.SqlConnection1
        '
        'SqlDeleteCommand4
        '
        Me.SqlDeleteCommand4.CommandText = "DELETE FROM [Employee] WHERE (([Emp_ID] = @Original_Emp_ID))"
        Me.SqlDeleteCommand4.Connection = Me.SqlConnection1
        Me.SqlDeleteCommand4.Parameters.AddRange(New System.Data.SqlClient.SqlParameter() {New System.Data.SqlClient.SqlParameter("@Original_Emp_ID", System.Data.SqlDbType.Int, 0, System.Data.ParameterDirection.Input, False, CType(0, Byte), CType(0, Byte), "Emp_ID", System.Data.DataRowVersion.Original, Nothing)})
        '
        'DAEmpId1
        '
        Me.DAEmpId1.DeleteCommand = Me.SqlDeleteCommand4
        Me.DAEmpId1.SelectCommand = Me.SqlSelectCommand5
        Me.DAEmpId1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Employee", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("Emp_ID", "Emp_ID")})})
        '
        'Form_DvdCopyIssue
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Gray
        Me.ClientSize = New System.Drawing.Size(818, 512)
        Me.Controls.Add(Me.tEmpId)
        Me.Controls.Add(Me.tDueDate)
        Me.Controls.Add(Me.tRentDate)
        Me.Controls.Add(Me.tCustId)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.tDvdCopyNumber)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.bAdd)
        Me.Controls.Add(Me.bBack)
        Me.Controls.Add(Me.tPrimaryPayment)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.Name = "Form_DvdCopyIssue"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "  Dvd Copy Issue"
        CType(Me.RentalBindingSource2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsRentDVD11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.RentalBindingSource3, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.RentalBindingSource4, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.RentalBindingSource5, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.RentalBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsGetDVDid11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DVDBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsGetCust11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.RentalBindingSource1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DSupdateStock11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsEmpId11, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents tPrimaryPayment As System.Windows.Forms.TextBox
    Friend WithEvents bBack As System.Windows.Forms.Button
    Friend WithEvents bAdd As System.Windows.Forms.Button
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents tDvdCopyNumber As System.Windows.Forms.ComboBox
    Friend WithEvents DsGetDVDid11 As DVD_STORE.DSGetDVDid1
    Friend WithEvents SqlSelectCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlConnection1 As System.Data.SqlClient.SqlConnection
    Friend WithEvents SqlInsertCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DAGetDVDid1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents DVDBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents SqlSelectCommand2 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlInsertCommand2 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand2 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DAGetCust1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents DsGetCust11 As DVD_STORE.DSGetCust1
    Friend WithEvents tCustId As System.Windows.Forms.ComboBox
    Friend WithEvents RentalBindingSource2 As System.Windows.Forms.BindingSource
    Friend WithEvents DsRentDVD11 As DVD_STORE.DSRentDVD1
    Friend WithEvents RentalBindingSource3 As System.Windows.Forms.BindingSource
    Friend WithEvents RentalBindingSource4 As System.Windows.Forms.BindingSource
    Friend WithEvents RentalBindingSource5 As System.Windows.Forms.BindingSource
    Friend WithEvents RentalBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents RentalBindingSource1 As System.Windows.Forms.BindingSource
    Friend WithEvents SqlSelectCommand3 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlInsertCommand3 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlUpdateCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand3 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DArentDVD1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents SqlSelectCommand4 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlInsertCommand4 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DAupdateStock1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents DSupdateStock11 As DVD_STORE.DSupdateStock1
    Friend WithEvents tRentDate As System.Windows.Forms.DateTimePicker
    Friend WithEvents tDueDate As System.Windows.Forms.DateTimePicker
    Friend WithEvents tEmpId As System.Windows.Forms.ComboBox
    Friend WithEvents DsEmpId11 As DVD_STORE.DSEmpId1
    Friend WithEvents SqlSelectCommand5 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlDeleteCommand4 As System.Data.SqlClient.SqlCommand
    Friend WithEvents DAEmpId1 As System.Data.SqlClient.SqlDataAdapter
End Class
