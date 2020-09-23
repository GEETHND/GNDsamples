<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form_Fine
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form_Fine))
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.DsFine11 = New DVD_STORE.DSFine1()
        Me.SqlSelectCommand1 = New System.Data.SqlClient.SqlCommand()
        Me.SqlConnection1 = New System.Data.SqlClient.SqlConnection()
        Me.DAFine1 = New System.Data.SqlClient.SqlDataAdapter()
        Me.DsFine11BindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.dtpCurrentDate = New System.Windows.Forms.DateTimePicker()
        Me.dtpDueDate = New System.Windows.Forms.DateTimePicker()
        Me.tFine = New System.Windows.Forms.TextBox()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.btnCalcFine = New System.Windows.Forms.Button()
        Me.tDelayDate = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsFine11, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.DsFine11BindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = Global.DVD_STORE.My.Resources.Resources.Banner_copy
        Me.PictureBox1.Location = New System.Drawing.Point(-1, -1)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(704, 80)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 12
        Me.PictureBox1.TabStop = False
        '
        'DsFine11
        '
        Me.DsFine11.DataSetName = "DSFine1"
        Me.DsFine11.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'SqlSelectCommand1
        '
        Me.SqlSelectCommand1.CommandText = "SELECT        Due_date, Returned_date, Fine_payment" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FROM            Rental"
        Me.SqlSelectCommand1.Connection = Me.SqlConnection1
        '
        'SqlConnection1
        '
        Me.SqlConnection1.ConnectionString = "Data Source=.;Initial Catalog=F5;Integrated Security=True"
        Me.SqlConnection1.FireInfoMessageEventOnUserErrors = False
        '
        'DAFine1
        '
        Me.DAFine1.SelectCommand = Me.SqlSelectCommand1
        Me.DAFine1.TableMappings.AddRange(New System.Data.Common.DataTableMapping() {New System.Data.Common.DataTableMapping("Table", "Rental", New System.Data.Common.DataColumnMapping() {New System.Data.Common.DataColumnMapping("Due_date", "Due_date"), New System.Data.Common.DataColumnMapping("Returned_date", "Returned_date"), New System.Data.Common.DataColumnMapping("Fine_payment", "Fine_payment")})})
        '
        'DsFine11BindingSource
        '
        Me.DsFine11BindingSource.DataSource = Me.DsFine11
        Me.DsFine11BindingSource.Position = 0
        '
        'dtpCurrentDate
        '
        Me.dtpCurrentDate.Location = New System.Drawing.Point(183, 174)
        Me.dtpCurrentDate.Name = "dtpCurrentDate"
        Me.dtpCurrentDate.Size = New System.Drawing.Size(200, 20)
        Me.dtpCurrentDate.TabIndex = 30
        '
        'dtpDueDate
        '
        Me.dtpDueDate.Location = New System.Drawing.Point(183, 217)
        Me.dtpDueDate.Name = "dtpDueDate"
        Me.dtpDueDate.Size = New System.Drawing.Size(200, 20)
        Me.dtpDueDate.TabIndex = 29
        '
        'tFine
        '
        Me.tFine.Location = New System.Drawing.Point(499, 121)
        Me.tFine.Name = "tFine"
        Me.tFine.Size = New System.Drawing.Size(160, 20)
        Me.tFine.TabIndex = 28
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Font = New System.Drawing.Font("Calibri", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label6.ForeColor = System.Drawing.Color.White
        Me.Label6.Location = New System.Drawing.Point(495, 95)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(44, 23)
        Me.Label6.TabIndex = 27
        Me.Label6.Text = "Fine"
        '
        'Button2
        '
        Me.Button2.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button2.Location = New System.Drawing.Point(313, 309)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(110, 40)
        Me.Button2.TabIndex = 26
        Me.Button2.Text = "Back"
        Me.Button2.UseVisualStyleBackColor = True
        '
        'btnCalcFine
        '
        Me.btnCalcFine.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCalcFine.Location = New System.Drawing.Point(183, 309)
        Me.btnCalcFine.Name = "btnCalcFine"
        Me.btnCalcFine.Size = New System.Drawing.Size(110, 40)
        Me.btnCalcFine.TabIndex = 25
        Me.btnCalcFine.Text = "Calculate"
        Me.btnCalcFine.UseVisualStyleBackColor = True
        '
        'tDelayDate
        '
        Me.tDelayDate.Location = New System.Drawing.Point(183, 253)
        Me.tDelayDate.Name = "tDelayDate"
        Me.tDelayDate.Size = New System.Drawing.Size(240, 20)
        Me.tDelayDate.TabIndex = 24
        '
        'Label5
        '
        Me.Label5.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.ForeColor = System.Drawing.Color.White
        Me.Label5.Location = New System.Drawing.Point(46, 253)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(113, 23)
        Me.Label5.TabIndex = 21
        Me.Label5.Text = "Delayed Dates"
        '
        'Label4
        '
        Me.Label4.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.ForeColor = System.Drawing.Color.White
        Me.Label4.Location = New System.Drawing.Point(46, 214)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(113, 23)
        Me.Label4.TabIndex = 20
        Me.Label4.Text = "Due Date"
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Calibri", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.ForeColor = System.Drawing.Color.White
        Me.Label3.Location = New System.Drawing.Point(46, 177)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(113, 23)
        Me.Label3.TabIndex = 19
        Me.Label3.Text = "Current Date"
        '
        'Form_Fine
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Gray
        Me.ClientSize = New System.Drawing.Size(704, 444)
        Me.Controls.Add(Me.dtpCurrentDate)
        Me.Controls.Add(Me.dtpDueDate)
        Me.Controls.Add(Me.tFine)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.btnCalcFine)
        Me.Controls.Add(Me.tDelayDate)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.PictureBox1)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.Name = "Form_Fine"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Fine"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsFine11, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.DsFine11BindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents DsFine11 As DVD_STORE.DSFine1
    Friend WithEvents SqlSelectCommand1 As System.Data.SqlClient.SqlCommand
    Friend WithEvents SqlConnection1 As System.Data.SqlClient.SqlConnection
    Friend WithEvents DAFine1 As System.Data.SqlClient.SqlDataAdapter
    Friend WithEvents DsFine11BindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents dtpCurrentDate As System.Windows.Forms.DateTimePicker
    Friend WithEvents dtpDueDate As System.Windows.Forms.DateTimePicker
    Friend WithEvents tFine As System.Windows.Forms.TextBox
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents Button2 As System.Windows.Forms.Button
    Friend WithEvents btnCalcFine As System.Windows.Forms.Button
    Friend WithEvents tDelayDate As System.Windows.Forms.TextBox
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
End Class
