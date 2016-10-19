Attribute VB_Name = "IfThenElse"

Sub Main()
	Dim Number As Integer, Digits As Integer, MyString As String
	Number = 52   ' 设置变量初始值。
	If Number < 10 Then
	   Digits = 1
	ElseIf Number < 100 Then
		' 若判断结果为 True，则完成下一行语句。
	   Digits = 2
	Else
	   Digits = 3
	End If
	
	Debug.Print  Digits
	
	If Number > 50 Then
		Debug.Print  "large than 50"
	End If
	
	If Number < 50 Then
		Debug.Print  "little than 50"
	Else
		Debug.Print  "ge 50"
	End If
	
	If Digits = 1 Then MyString = "One" Else MyString = "More than one" 
	Debug.Print  MyString
	
End Sub


