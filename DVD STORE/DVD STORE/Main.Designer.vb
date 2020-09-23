<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form_dvd
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form_dvd))
        Me.bCustomerDetails = New System.Windows.Forms.Button()
        Me.bMovieDetails = New System.Windows.Forms.Button()
        Me.bDvdCopy = New System.Windows.Forms.Button()
        Me.bDvdCopyIssue = New System.Windows.Forms.Button()
        Me.bReturningDetails = New System.Windows.Forms.Button()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.bFine = New System.Windows.Forms.Button()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.ToolTip1 = New System.Windows.Forms.ToolTip(Me.components)
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'bCustomerDetails
        '
        Me.bCustomerDetails.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.bCustomerDetails.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bCustomerDetails.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bCustomerDetails.ForeColor = System.Drawing.Color.Maroon
        Me.bCustomerDetails.Image = Global.DVD_STORE.My.Resources.Resources.cust2
        Me.bCustomerDetails.ImageAlign = System.Drawing.ContentAlignment.TopLeft
        Me.bCustomerDetails.Location = New System.Drawing.Point(35, 120)
        Me.bCustomerDetails.Name = "bCustomerDetails"
        Me.bCustomerDetails.Size = New System.Drawing.Size(105, 104)
        Me.bCustomerDetails.TabIndex = 0
        Me.bCustomerDetails.Text = " "
        Me.ToolTip1.SetToolTip(Me.bCustomerDetails, "Customer Detail")
        Me.bCustomerDetails.UseVisualStyleBackColor = False
        '
        'bMovieDetails
        '
        Me.bMovieDetails.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.bMovieDetails.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bMovieDetails.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bMovieDetails.ForeColor = System.Drawing.Color.Maroon
        Me.bMovieDetails.Image = Global.DVD_STORE.My.Resources.Resources.mov1
        Me.bMovieDetails.Location = New System.Drawing.Point(298, 120)
        Me.bMovieDetails.Name = "bMovieDetails"
        Me.bMovieDetails.Size = New System.Drawing.Size(107, 104)
        Me.bMovieDetails.TabIndex = 1
        Me.bMovieDetails.Text = " "
        Me.bMovieDetails.UseVisualStyleBackColor = False
        '
        'bDvdCopy
        '
        Me.bDvdCopy.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.bDvdCopy.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bDvdCopy.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bDvdCopy.ForeColor = System.Drawing.Color.Maroon
        Me.bDvdCopy.Image = Global.DVD_STORE.My.Resources.Resources.dvd_icon
        Me.bDvdCopy.Location = New System.Drawing.Point(298, 251)
        Me.bDvdCopy.Name = "bDvdCopy"
        Me.bDvdCopy.Size = New System.Drawing.Size(107, 106)
        Me.bDvdCopy.TabIndex = 2
        Me.bDvdCopy.Text = " "
        Me.bDvdCopy.UseVisualStyleBackColor = False
        '
        'bDvdCopyIssue
        '
        Me.bDvdCopyIssue.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.bDvdCopyIssue.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bDvdCopyIssue.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bDvdCopyIssue.ForeColor = System.Drawing.Color.Maroon
        Me.bDvdCopyIssue.Image = Global.DVD_STORE.My.Resources.Resources.rent
        Me.bDvdCopyIssue.Location = New System.Drawing.Point(707, 412)
        Me.bDvdCopyIssue.Name = "bDvdCopyIssue"
        Me.bDvdCopyIssue.Size = New System.Drawing.Size(93, 81)
        Me.bDvdCopyIssue.TabIndex = 3
        Me.bDvdCopyIssue.UseVisualStyleBackColor = False
        '
        'bReturningDetails
        '
        Me.bReturningDetails.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.bReturningDetails.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bReturningDetails.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bReturningDetails.ForeColor = System.Drawing.Color.Maroon
        Me.bReturningDetails.Image = Global.DVD_STORE.My.Resources.Resources.ret
        Me.bReturningDetails.Location = New System.Drawing.Point(35, 394)
        Me.bReturningDetails.Name = "bReturningDetails"
        Me.bReturningDetails.Size = New System.Drawing.Size(105, 99)
        Me.bReturningDetails.TabIndex = 4
        Me.bReturningDetails.Text = " "
        Me.bReturningDetails.UseVisualStyleBackColor = False
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
        Me.PictureBox1.TabIndex = 6
        Me.PictureBox1.TabStop = False
        '
        'bFine
        '
        Me.bFine.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.bFine.Cursor = System.Windows.Forms.Cursors.Hand
        Me.bFine.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.bFine.ForeColor = System.Drawing.Color.Maroon
        Me.bFine.Image = Global.DVD_STORE.My.Resources.Resources.US_dollar
        Me.bFine.Location = New System.Drawing.Point(298, 394)
        Me.bFine.Name = "bFine"
        Me.bFine.Size = New System.Drawing.Size(107, 99)
        Me.bFine.TabIndex = 5
        Me.bFine.UseVisualStyleBackColor = False
        '
        'Button1
        '
        Me.Button1.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.Button1.Cursor = System.Windows.Forms.Cursors.Hand
        Me.Button1.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button1.ForeColor = System.Drawing.Color.Maroon
        Me.Button1.Image = Global.DVD_STORE.My.Resources.Resources.emp2
        Me.Button1.ImageAlign = System.Drawing.ContentAlignment.TopCenter
        Me.Button1.Location = New System.Drawing.Point(35, 251)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(105, 106)
        Me.Button1.TabIndex = 7
        Me.Button1.UseVisualStyleBackColor = False
        '
        'ToolTip1
        '
        Me.ToolTip1.IsBalloon = True
        Me.ToolTip1.ShowAlways = True
        Me.ToolTip1.ToolTipIcon = System.Windows.Forms.ToolTipIcon.Info
        Me.ToolTip1.ToolTipTitle = "Customer"
        '
        'Form_dvd
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(825, 523)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.bFine)
        Me.Controls.Add(Me.bReturningDetails)
        Me.Controls.Add(Me.bDvdCopyIssue)
        Me.Controls.Add(Me.bDvdCopy)
        Me.Controls.Add(Me.bMovieDetails)
        Me.Controls.Add(Me.bCustomerDetails)
        Me.ForeColor = System.Drawing.SystemColors.ControlText
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Name = "Form_dvd"
        Me.Text = "DVD STORE"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents bCustomerDetails As System.Windows.Forms.Button
    Friend WithEvents bMovieDetails As System.Windows.Forms.Button
    Friend WithEvents bDvdCopy As System.Windows.Forms.Button
    Friend WithEvents bDvdCopyIssue As System.Windows.Forms.Button
    Friend WithEvents bReturningDetails As System.Windows.Forms.Button
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents bFine As System.Windows.Forms.Button
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents ToolTip1 As System.Windows.Forms.ToolTip

End Class
