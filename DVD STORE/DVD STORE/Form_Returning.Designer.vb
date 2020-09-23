<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form_Returning
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form_Returning))
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.tCustomerId = New System.Windows.Forms.TextBox()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.tDvdCopyNumber = New System.Windows.Forms.ComboBox()
        Me.DsRetDVD11 = New DVD_STORE.DSRetDVD1()
        Me.RentalBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.btnFine = New System.Windows.Forms.Button()
        Me.SqlSelectCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlConnection1 = New System.Data.SqlClient.SqlConnection()
        Me.DARetDVD1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.tDueDate = New System.Windows.Forms.DateTimePicker()
        Me.tRetDate = New System.Windows.Forms.DateTimePicker()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.tFine = New System.Windows.Forms.TextBox()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.dtpCurrentDate = New System.Windows.Forms.DateTimePicker()
        Me.dtpDueDate = New System.Windows.Forms.DateTimePicker()
        Me.btnCalcFine = New System.Windows.Forms.Button()
        Me.tDelayDate = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsRetDVD11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.RentalBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox1.SuspendLayout()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.SystemColors.Window
        Me.Label1.Location = New System.Drawing.Point(20, 145)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(113, 23)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = " Dvd Copy Number"
        '
        'Label2
        '
        Me.Label2.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.ForeColor = System.Drawing.SystemColors.Window
        Me.Label2.Location = New System.Drawing.Point(20, 184)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(113, 23)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = " Customer Id"
        '
        'Label4
        '
        Me.Label4.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.ForeColor = System.Drawing.SystemColors.Window
        Me.Label4.Location = New System.Drawing.Point(20, 225)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(113, 23)
        Me.Label4.TabIndex = 3
        Me.Label4.Text = " Due Date"
        '
        'tCustomerId
        '
        Me.tCustomerId.Location = New System.Drawing.Point(150, 181)
        Me.tCustomerId.Name = "tCustomerId"
        Me.tCustomerId.ReadOnly = True
        Me.tCustomerId.Size = New System.Drawing.Size(141, 20)
        Me.tCustomerId.TabIndex = 6
        '
        'Button2
        '
        Me.Button2.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button2.Location = New System.Drawing.Point(99, 404)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(109, 38)
        Me.Button2.TabIndex = 11
        Me.Button2.Text = " Add"
        Me.Button2.UseVisualStyleBackColor = True
        '
        'PictureBox1
        '
        Me.PictureBox1.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Left) _
                    Or System.Windows.Forms.AnchorStyles.Right), System.Windows.Forms.AnchorStyles)
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(0, 1)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(825, 102)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 12
        Me.PictureBox1.TabStop = False
        '
        'tDvdCopyNumber
        '
        Me.tDvdCopyNumber.DataSource = Me.DsRetDVD11
        Me.tDvdCopyNumber.DisplayMember = "Rental.DVD_Id"
        Me.tDvdCopyNumber.FormattingEnabled = True
        Me.tDvdCopyNumber.Location = New System.Drawing.Point(150, 143)
        Me.tDvdCopyNumber.Name = "tDvdCopyNumber"
        Me.tDvdCopyNumber.Size = New System.Drawing.Size(141, 21)
        Me.tDvdCopyNumber.TabIndex = 13
        '
        'DsRetDVD11
        '
        Me.DsRetDVD11.DataSetName = "DSRetDVD1"
        Me.DsRetDVD11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'RentalBindingSource
        '
        Me.RentalBindingSource.DataMember = "Rental"
        Me.RentalBindingSource.DataSource = Me.DsRetDVD11
        '
        'Button1
        '
        Me.Button1.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button1.Location = New System.Drawing.Point(214, 404)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(102, 38)
        Me.Button1.TabIndex = 10
        Me.Button1.Text = " Back"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.ForeColor = System.Drawing.SystemColors.Window
        Me.Label3.Location = New System.Drawing.Point(23, 266)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(113, 23)
        Me.Label3.TabIndex = 14
        Me.Label3.Text = "Returned Date"
        '
        'btnFine
        '
        Me.btnFine.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnFine.Location = New System.Drawing.Point(220, 330)
        Me.btnFine.Name = "btnFine"
        Me.btnFine.Size = New System.Drawing.Size(96, 34)
        Me.btnFine.TabIndex = 16
        Me.btnFine.Text = "Fine"
        Me.btnFine.UseVisualStyleBackColor = True
        '
        'SqlSelectCommand1
        '
        Me.SqlSelectCommand1.CommandText = "SELECT        Customer_Id, DVD_Id, Due_date, Returned_date" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            Renta" & _
            "l"
        Me.SqlSelectCommand1.Connection = Me.SqlConnection1
        '
        'SqlConnection1
        '
        Me.SqlConnection1.ConnectionString = "Data Source=.;Initial Catalog=F5;Integrated Security=True"
        Me.SqlConnection1.FireInfoMessageEventOnUserErrors = False
        '
        'DARetDVD1
        '
        Me.DARetDVD1.SelectCommand = Me.SqlSelectCommand1
        Me.DARetDVD1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Rental", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("Customer_Id", "Customer_Id"), New System.Data.Common.DataColumnMapping("DVD_Id", "DVD_Id"), New System.Data.Common.DataColumnMapping("Due_date", "Due_date"), New System.Data.Common.DataColumnMapping("Returned_date", "Returned_date")})})
        '
        'tDueDate
        '
        Me.tDueDate.Location = New System.Drawing.Point(150, 225)
        Me.tDueDate.Name = "tDueDate"
        Me.tDueDate.Size = New System.Drawing.Size(200, 20)
        Me.tDueDate.TabIndex = 17
        '
        'tRetDate
        '
        Me.tRetDate.Location = New System.Drawing.Point(150, 266)
        Me.tRetDate.Name = "tRetDate"
        Me.tRetDate.Size = New System.Drawing.Size(200, 20)
        Me.tRetDate.TabIndex = 18
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.tFine)
        Me.GroupBox1.Controls.Add(Me.Label8)
        Me.GroupBox1.Controls.Add(Me.dtpCurrentDate)
        Me.GroupBox1.Controls.Add(Me.dtpDueDate)
        Me.GroupBox1.Controls.Add(Me.btnCalcFine)
        Me.GroupBox1.Controls.Add(Me.tDelayDate)
        Me.GroupBox1.Controls.Add(Me.Label5)
        Me.GroupBox1.Controls.Add(Me.Label6)
        Me.GroupBox1.Controls.Add(Me.Label7)
        Me.GroupBox1.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox1.ForeColor = System.Drawing.SystemColors.Window
        Me.GroupBox1.Location = New System.Drawing.Point(396, 135)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(400, 328)
        Me.GroupBox1.TabIndex = 19
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Fine"
        Me.GroupBox1.Visible = False
        '
        'tFine
        '
        Me.tFine.Location = New System.Drawing.Point(15, 282)
        Me.tFine.Name = "tFine"
        Me.tFine.Size = New System.Drawing.Size(160, 26)
        Me.tFine.TabIndex = 40
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Font = New System.Drawing.Font("Calibri", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label8.ForeColor = System.Drawing.Color.White
        Me.Label8.Location = New System.Drawing.Point(11, 256)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(44, 23)
        Me.Label8.TabIndex = 39
        Me.Label8.Text = "Fine"
        '
        'dtpCurrentDate
        '
        Me.dtpCurrentDate.Location = New System.Drawing.Point(131, 77)
        Me.dtpCurrentDate.Name = "dtpCurrentDate"
        Me.dtpCurrentDate.Size = New System.Drawing.Size(263, 26)
        Me.dtpCurrentDate.TabIndex = 38
        '
        'dtpDueDate
        '
        Me.dtpDueDate.Location = New System.Drawing.Point(131, 120)
        Me.dtpDueDate.Name = "dtpDueDate"
        Me.dtpDueDate.Size = New System.Drawing.Size(263, 26)
        Me.dtpDueDate.TabIndex = 37
        '
        'btnCalcFine
        '
        Me.btnCalcFine.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCalcFine.ForeColor = System.Drawing.SystemColors.InfoText
        Me.btnCalcFine.Location = New System.Drawing.Point(149, 212)
        Me.btnCalcFine.Name = "btnCalcFine"
        Me.btnCalcFine.Size = New System.Drawing.Size(110, 40)
        Me.btnCalcFine.TabIndex = 35
        Me.btnCalcFine.Text = "Calculate"
        Me.btnCalcFine.UseVisualStyleBackColor = True
        '
        'tDelayDate
        '
        Me.tDelayDate.Location = New System.Drawing.Point(131, 156)
        Me.tDelayDate.Name = "tDelayDate"
        Me.tDelayDate.ReadOnly = True
        Me.tDelayDate.Size = New System.Drawing.Size(128, 26)
        Me.tDelayDate.TabIndex = 34
        '
        'Label5
        '
        Me.Label5.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.ForeColor = System.Drawing.Color.White
        Me.Label5.Location = New System.Drawing.Point(12, 156)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(113, 23)
        Me.Label5.TabIndex = 33
        Me.Label5.Text = "Delayed Dates"
        '
        'Label6
        '
        Me.Label6.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label6.ForeColor = System.Drawing.Color.White
        Me.Label6.Location = New System.Drawing.Point(12, 117)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(113, 23)
        Me.Label6.TabIndex = 32
        Me.Label6.Text = "Due Date"
        '
        'Label7
        '
        Me.Label7.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label7.ForeColor = System.Drawing.Color.White
        Me.Label7.Location = New System.Drawing.Point(12, 80)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(113, 23)
        Me.Label7.TabIndex = 31
        Me.Label7.Text = "Current Date"
        '
        'Form_Returning
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Gray
        Me.ClientSize = New System.Drawing.Size(825, 516)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.tRetDate)
        Me.Controls.Add(Me.tDueDate)
        Me.Controls.Add(Me.btnFine)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.tDvdCopyNumber)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.tCustomerId)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.Name = "Form_Returning"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = " Returning"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsRetDVD11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.RentalBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents tCustomerId As System.Windows.Forms.TextBox
    Friend WithEvents Button2 As System.Windows.Forms.Button
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents tDvdCopyNumber As System.Windows.Forms.ComboBox
    Friend WithEvents RentalBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents DsRetDVD11 As DVD_STORE.DSRetDVD1
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents btnFine As System.Windows.Forms.Button
    Friend WithEvents SqlSelectCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlConnection1 As System.Data.SqlClient.SqlConnection
    Friend WithEvents DARetDVD1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents tDueDate As System.Windows.Forms.DateTimePicker
    Friend WithEvents tRetDate As System.Windows.Forms.DateTimePicker
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents dtpCurrentDate As System.Windows.Forms.DateTimePicker
    Friend WithEvents dtpDueDate As System.Windows.Forms.DateTimePicker
    Friend WithEvents btnCalcFine As System.Windows.Forms.Button
    Friend WithEvents tDelayDate As System.Windows.Forms.TextBox
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents tFine As System.Windows.Forms.TextBox
    Friend WithEvents Label8 As System.Windows.Forms.Label
End Class
