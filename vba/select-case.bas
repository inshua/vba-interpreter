Attribute VB_Name = "SelectCase"

Sub Main()
	Dim Number
	Number = 9   ' 设置变量初值。
	Select Case Number   ' 判断 Number 的值。
	Case Is <= 5   ' Number 的值在 1 到 5 之间，包含1 和 5 。
	   Debug.Print  "Between 1 and 5"
	' 下一个 Case 子句是本示例中唯一判断值为 True 的子句。
	Case 6, 7, 8   ' Number 的值在 6 到 8 之间。
	   Debug.Print  "Between 6 and 8"
	Case 9 To 10   ' Number 的值为 9 或 10。
		Debug.Print  "Greater than 8"
	Case Else   ' 其他数值。
	   Debug.Print  "Not between 1 and 10"
	End Select
	Debug.Print  "OVER"
End Sub


