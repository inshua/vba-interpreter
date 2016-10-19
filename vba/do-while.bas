Attribute VB_Name = "DoWhile"

Sub Main()
	Dim i As Integer
	Do While i < 5
		Debug.Print  i
		i = i + 1
	Loop
	Debug.Print  "at last " & i
	
	i = 0
	Do Until i > 5
		Debug.Print  i
		i = i + 1
	Loop
	Debug.Print  "at last " & i
	
	i = 0
	Do
		Debug.Print  i
		i = i + 1
	Loop While i < 5
	Debug.Print  "at last " & i
	
	i = 0
	Do
		Debug.Print  i
		i = i + 1
	Loop Until i > 5
	Debug.Print  "at last " & i
	
	
	i = 0
	While i < 5
		Debug.Print  i
		i = i + 1
	WEnd
	Debug.Print  "at last " & i
	
	msdn
End Sub

Sub msdn()
	Dim Check, Counter
	Check = True: Counter = 0   ' 设置变量初始值。
	Do   ' 外层循环。
	   Do While Counter < 20   ' 内层循环。
	      Counter = Counter + 1   ' 计数器加一。
	      If Counter = 10 Then   ' 如果条件成立。
	         Check = False   ' 将标志值设成 False。
	         Exit Do   ' 退出内层循环。
	      End If
	   Loop
	Loop Until Check = False   ' 退出外层循环。

	Debug.Print  Check	
End Sub