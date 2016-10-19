Enum State
    Ready  = 2
    Complete = 3
End Enum

Type EmployeeRecord   '创建用户自定义的类型。
   ID As Integer   '定义元素的数据类型。
   Name As String * Ready
   Address As String  '* 30
   Phone As Long
   'HireDate As Date
End Type

Sub Main()
   Dim MyRecord As EmployeeRecord   '声明变量。

   '对 EmployeeRecord 变量的赋值必须在过程内进行。
   MyRecord.ID = 12003   '给一个元素赋值。
   
   Debug.Print  "MyRecrod " & MyRecord.ID
   
   Dim b As EmployeeRecord
   b = MyRecord
   
   Debug.Print  "Clonner " & b.ID
   
   b.ID = 11111
   
   Debug.Print  "Clonner Become " & b.ID

   Debug.Print  "MyRecrod Still " & MyRecord.ID
   
End Sub


