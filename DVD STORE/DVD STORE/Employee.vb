Public Class Employee

    Private Sub Employee_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        DsEmp11.Clear()
        DAEmp1.Fill(DsEmp11)
    End Sub

    Private Sub bAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles bAdd.Click
        Try
            DAEmp1.Update(DsEmp11)
            MsgBox("Successfully save changes.")
        Catch ex As Exception

        End Try
    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Me.Visible = False
    End Sub

    Private Sub btnAdd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAdd.Click
        Add_New_Employee.Visible = True
    End Sub
End Class