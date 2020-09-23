<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Admin_View
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Admin_View))
        Me.Button1 = New System.Windows.Forms.Button()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.bReturningDetails = New System.Windows.Forms.Button()
        Me.bDvdCopyIssue = New System.Windows.Forms.Button()
        Me.bDvdCopy = New System.Windows.Forms.Button()
        Me.bMovieDetails = New System.Windows.Forms.Button()
        Me.bCustomerDetails = New System.Windows.Forms.Button()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.ToolTip1 = New System.Windows.Forms.ToolTip(Me.components)
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Button1
        '
        Me.Button1.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.Button1.Cursor = System.Windows.Forms.Cursors.Hand
        Me.Button1.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button1.ForeColor = System.Drawing.Color.Maroon
        Me.Button1.Image = Global.DVD_STORE.My.Resources.Resources.emp2
        Me.Button1.ImageAlign = System.Drawing.ContentAlignment.TopCenter
        Me.Button1.Location = New System.Drawing.Point(297, 120)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(105, 106)
        Me.Button1.TabIndex = 15
        Me.ToolTip1.SetToolTip(Me.Button1, "Employee Details")
        Me.Button1.UseVisualStyleBackColor = False
        '
        'PictureBox1
        '
        Me.PictureBox1.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Left) _
                    Or System.Windows.Forms.AnchorStyles.Right), System.Windows.Forms.AnchorStyles)
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(-1, 0)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(839, 102)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 14
        Me.PictureBox1.TabStop = False
        '
        'bReturningDetails
        '
        Me.bReturningDetails.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.bReturningDetails.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bReturningDetails.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bReturningDetails.ForeColor = System.Drawing.Color.Maroon
        Me.bReturningDetails.Image = Global.DVD_STORE.My.Resources.Resources.undo
        Me.bReturningDetails.Location = New System.Drawing.Point(34, 394)
        Me.bReturningDetails.Name = "bReturningDetails"
        Me.bReturningDetails.Size = New System.Drawing.Size(105, 99)
        Me.bReturningDetails.TabIndex = 12
        Me.bReturningDetails.Text = " "
        Me.ToolTip1.SetToolTip(Me.bReturningDetails, "DVD Returns")
        Me.bReturningDetails.UseVisualStyleBackColor = False
        '
        'bDvdCopyIssue
        '
        Me.bDvdCopyIssue.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.bDvdCopyIssue.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bDvdCopyIssue.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bDvdCopyIssue.ForeColor = System.Drawing.Color.Maroon
        Me.bDvdCopyIssue.Image = Global.DVD_STORE.My.Resources.Resources.rent
        Me.bDvdCopyIssue.Location = New System.Drawing.Point(297, 394)
        Me.bDvdCopyIssue.Name = "bDvdCopyIssue"
        Me.bDvdCopyIssue.Size = New System.Drawing.Size(105, 99)
        Me.bDvdCopyIssue.TabIndex = 11
        Me.ToolTip1.SetToolTip(Me.bDvdCopyIssue, "Rental Management")
        Me.bDvdCopyIssue.UseVisualStyleBackColor = False
        '
        'bDvdCopy
        '
        Me.bDvdCopy.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.bDvdCopy.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bDvdCopy.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bDvdCopy.ForeColor = System.Drawing.Color.Maroon
        Me.bDvdCopy.Image = Global.DVD_STORE.My.Resources.Resources.dvd_icon
        Me.bDvdCopy.Location = New System.Drawing.Point(297, 251)
        Me.bDvdCopy.Name = "bDvdCopy"
        Me.bDvdCopy.Size = New System.Drawing.Size(107, 106)
        Me.bDvdCopy.TabIndex = 10
        Me.bDvdCopy.Text = " "
        Me.ToolTip1.SetToolTip(Me.bDvdCopy, "DVD Info")
        Me.bDvdCopy.UseVisualStyleBackColor = False
        '
        'bMovieDetails
        '
        Me.bMovieDetails.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.bMovieDetails.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bMovieDetails.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bMovieDetails.ForeColor = System.Drawing.Color.Maroon
        Me.bMovieDetails.Image = Global.DVD_STORE.My.Resources.Resources.mov1
        Me.bMovieDetails.Location = New System.Drawing.Point(34, 251)
        Me.bMovieDetails.Name = "bMovieDetails"
        Me.bMovieDetails.Size = New System.Drawing.Size(107, 104)
        Me.bMovieDetails.TabIndex = 9
        Me.bMovieDetails.Text = " "
        Me.ToolTip1.SetToolTip(Me.bMovieDetails, "Movie Details")
        Me.bMovieDetails.UseVisualStyleBackColor = False
        '
        'bCustomerDetails
        '
        Me.bCustomerDetails.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.bCustomerDetails.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bCustomerDetails.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bCustomerDetails.ForeColor = System.Drawing.Color.Maroon
        Me.bCustomerDetails.Image = Global.DVD_STORE.My.Resources.Resources.cust2
        Me.bCustomerDetails.ImageAlign = System.Drawing.ContentAlignment.TopLeft
        Me.bCustomerDetails.Location = New System.Drawing.Point(34, 120)
        Me.bCustomerDetails.Name = "bCustomerDetails"
        Me.bCustomerDetails.Size = New System.Drawing.Size(105, 104)
        Me.bCustomerDetails.TabIndex = 8
        Me.bCustomerDetails.Text = " "
        Me.ToolTip1.SetToolTip(Me.bCustomerDetails, "Customer Details")
        Me.bCustomerDetails.UseVisualStyleBackColor = False
        '
        'Button2
        '
        Me.Button2.BackColor = System.Drawing.Color.Gray
        Me.Button2.Cursor = System.Windows.Forms.Cursors.Hand
        Me.Button2.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button2.ForeColor = System.Drawing.Color.Maroon
        Me.Button2.Image = CType(resources.GetObject("Button2.Image"), System.Drawing.Image)
        Me.Button2.Location = New System.Drawing.Point(746, 426)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(83, 79)
        Me.Button2.TabIndex = 39
        Me.Button2.Text = " "
        Me.Button2.UseVisualStyleBackColor = False
        '
        'Admin_View
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = Global.DVD_STORE.My.Resources.Resources._13177359_cd_dvd_on_blue_digital_background
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(838, 513)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.bReturningDetails)
        Me.Controls.Add(Me.bDvdCopyIssue)
        Me.Controls.Add(Me.bDvdCopy)
        Me.Controls.Add(Me.bMovieDetails)
        Me.Controls.Add(Me.bCustomerDetails)
        Me.Cursor = System.Windows.Forms.Cursors.Hand
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MaximizeBox = False
        Me.Name = "Admin_View"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Admin_View"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents bReturningDetails As System.Windows.Forms.Button
    Friend WithEvents bDvdCopyIssue As System.Windows.Forms.Button
    Friend WithEvents bDvdCopy As System.Windows.Forms.Button
    Friend WithEvents bMovieDetails As System.Windows.Forms.Button
    Friend WithEvents bCustomerDetails As System.Windows.Forms.Button
    Friend WithEvents Button2 As System.Windows.Forms.Button
    Friend WithEvents ToolTip1 As System.Windows.Forms.ToolTip
End Class
