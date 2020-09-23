<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Add_New_Employee
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Add_New_Employee))
        Me.bAdd = New System.Windows.Forms.Button()
        Me.bBack = New System.Windows.Forms.Button()
        Me.tDesig = New System.Windows.Forms.TextBox()
        Me.tEmpNmae = New System.Windows.Forms.TextBox()
        Me.tTP = New System.Windows.Forms.TextBox()
        Me.tPAddress = New System.Windows.Forms.TextBox()
        Me.tPass = New System.Windows.Forms.TextBox()
        Me.tCustomerId = New System.Windows.Forms.TextBox()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'bAdd
        '
        Me.bAdd.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bAdd.Location = New System.Drawing.Point(500, 399)
        Me.bAdd.Name = "bAdd"
        Me.bAdd.Size = New System.Drawing.Size(75, 23)
        Me.bAdd.TabIndex = 34
        Me.bAdd.Text = " Add"
        Me.bAdd.UseVisualStyleBackColor = True
        '
        'bBack
        '
        Me.bBack.Font = New System.Drawing.Font("Arial Rounded MT Bold", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bBack.Location = New System.Drawing.Point(411, 399)
        Me.bBack.Name = "bBack"
        Me.bBack.Size = New System.Drawing.Size(75, 23)
        Me.bBack.TabIndex = 33
        Me.bBack.Text = " Back"
        Me.bBack.UseVisualStyleBackColor = True
        '
        'tDesig
        '
        Me.tDesig.Location = New System.Drawing.Point(411, 307)
        Me.tDesig.Name = "tDesig"
        Me.tDesig.Size = New System.Drawing.Size(164, 20)
        Me.tDesig.TabIndex = 32
        '
        'tEmpNmae
        '
        Me.tEmpNmae.Location = New System.Drawing.Point(411, 204)
        Me.tEmpNmae.Name = "tEmpNmae"
        Me.tEmpNmae.Size = New System.Drawing.Size(164, 20)
        Me.tEmpNmae.TabIndex = 31
        '
        'tTP
        '
        Me.tTP.Location = New System.Drawing.Point(411, 273)
        Me.tTP.Name = "tTP"
        Me.tTP.Size = New System.Drawing.Size(164, 20)
        Me.tTP.TabIndex = 30
        '
        'tPAddress
        '
        Me.tPAddress.Location = New System.Drawing.Point(411, 236)
        Me.tPAddress.Name = "tPAddress"
        Me.tPAddress.Size = New System.Drawing.Size(164, 20)
        Me.tPAddress.TabIndex = 29
        '
        'tPass
        '
        Me.tPass.Location = New System.Drawing.Point(411, 163)
        Me.tPass.Name = "tPass"
        Me.tPass.Size = New System.Drawing.Size(164, 20)
        Me.tPass.TabIndex = 27
        '
        'tCustomerId
        '
        Me.tCustomerId.Location = New System.Drawing.Point(411, 134)
        Me.tCustomerId.Name = "tCustomerId"
        Me.tCustomerId.ReadOnly = True
        Me.tCustomerId.Size = New System.Drawing.Size(164, 20)
        Me.tCustomerId.TabIndex = 26
        '
        'Label8
        '
        Me.Label8.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label8.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label8.Location = New System.Drawing.Point(231, 309)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(131, 21)
        Me.Label8.TabIndex = 25
        Me.Label8.Text = "Designation"
        '
        'Label6
        '
        Me.Label6.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label6.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label6.Location = New System.Drawing.Point(231, 206)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(131, 22)
        Me.Label6.TabIndex = 24
        Me.Label6.Text = "Name"
        '
        'Label5
        '
        Me.Label5.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label5.Location = New System.Drawing.Point(231, 275)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(131, 20)
        Me.Label5.TabIndex = 23
        Me.Label5.Text = " TP No"
        '
        'Label4
        '
        Me.Label4.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label4.Location = New System.Drawing.Point(231, 238)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(131, 18)
        Me.Label4.TabIndex = 22
        Me.Label4.Text = " Permenent Address"
        '
        'Label2
        '
        Me.Label2.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label2.Location = New System.Drawing.Point(231, 169)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(131, 20)
        Me.Label2.TabIndex = 20
        Me.Label2.Text = "Password"
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Calibri", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label1.Location = New System.Drawing.Point(231, 134)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(131, 20)
        Me.Label1.TabIndex = 19
        Me.Label1.Text = "Emp Id"
        '
        'Label9
        '
        Me.Label9.Image = CType(resources.GetObject("Label9.Image"), System.Drawing.Image)
        Me.Label9.Location = New System.Drawing.Point(0, 0)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(787, 104)
        Me.Label9.TabIndex = 35
        '
        'Add_New_Employee
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Gray
        Me.ClientSize = New System.Drawing.Size(783, 498)
        Me.Controls.Add(Me.Label9)
        Me.Controls.Add(Me.bAdd)
        Me.Controls.Add(Me.bBack)
        Me.Controls.Add(Me.tDesig)
        Me.Controls.Add(Me.tEmpNmae)
        Me.Controls.Add(Me.tTP)
        Me.Controls.Add(Me.tPAddress)
        Me.Controls.Add(Me.tPass)
        Me.Controls.Add(Me.tCustomerId)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.Name = "Add_New_Employee"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Add_New_Employee"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Label9 As System.Windows.Forms.Label
    Friend WithEvents bAdd As System.Windows.Forms.Button
    Friend WithEvents bBack As System.Windows.Forms.Button
    Friend WithEvents tDesig As System.Windows.Forms.TextBox
    Friend WithEvents tEmpNmae As System.Windows.Forms.TextBox
    Friend WithEvents tTP As System.Windows.Forms.TextBox
    Friend WithEvents tPAddress As System.Windows.Forms.TextBox
    Friend WithEvents tPass As System.Windows.Forms.TextBox
    Friend WithEvents tCustomerId As System.Windows.Forms.TextBox
    Friend WithEvents Label8 As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label1 As System.Windows.Forms.Label
End Class
