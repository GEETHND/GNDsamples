Public Class Form_CustomerDetail

    Private Sub bBack_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bBack.Click
        Me.Visible = False
    End Sub

    Private Sub bAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bAdd.Click
        If tCustomerName.Text <> "" Then
            'Dim id As Integer = Convert.ToInt32(tCustomerId.Text)
            Dim dob As Date = Convert.ToDateTime(tBirthDate.Text)

            Dim row As DSAddCust1.CustomerRow
            row = DsAddCust11.Customer.NewCustomerRow

            'row.Customer_ID = (id)
            row.Name = (tCustomerName.Text)
            row.NIC_No = (tNIc.Text)
            row.Tel_No = (tTP.Text)
            row.Birth_date = (dob)
            row.Address_line1 = (tPAddress.Text)
            row.Address_line2 = (tWorkAddress.Text)

            Try
                DsAddCust11.Customer.Rows.Add(row)
                DAAddCust1.Update(DsAddCust11)

            Catch ex As Exception
                MsgBox("error")
            End Try
        Else
            MsgBox("Please enter customer id.", MsgBoxStyle.Critical)
        End If
    End Sub

    Private Sub Form_CustomerDetail_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub
End Class