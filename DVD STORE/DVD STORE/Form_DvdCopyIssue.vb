Public Class Form_DvdCopyIssue

    Private Sub bBack_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bBack.Click
        Me.Visible = False
    End Sub

    Private Sub Form_DvdCopyIssue_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        DAGetDVDid1.Fill(DsGetDVDid11)
        DAGetCust1.Fill(DsGetCust11)
        DAupdateStock1.Fill(DSupdateStock11)
        DAEmpId1.Fill(DsEmpId11)
    End Sub

    Private Sub bAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bAdd.Click
        Dim d As Date = Convert.ToDateTime(tRentDate.Text)
        Dim dd As Date = Convert.ToDateTime(tDueDate.Text)
        Dim pay As Integer = Convert.ToInt32(tPrimaryPayment.Text)
        Dim row As DSRentDVD1.RentalRow
        row = DsRentDVD11.Rental.NewRentalRow

        row.DVD_Id = (tDvdCopyNumber.Text)
        row.Customer_Id = (tCustId.Text)
        row.Emp_Id = (tEmpId.Text)
        row._Date = (d)
        row.Due_date = (dd)
        row.Payment_Rs = (pay)

        Try
            DsRentDVD11.Rental.Rows.Add(row)
            DArentDVD1.Update(DsRentDVD11)

            MsgBox("Successfully added!")

            Me.Visible = False
        Catch ex As Exception
            MsgBox("Error")
        End Try

    End Sub


End Class