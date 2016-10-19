Attribute VB_Name = "Module1"
Sub Main()
    On Error GoTo ErrHandler
    
   	Dim MyResult, Var1, Var2
	MyResult = (45 < 35)   ' 返回 False。
	Debug.Trace MyResult
	MyResult = (45 = 45)   ' 返回 True。
	Debug.Trace MyResult
	MyResult = (4 <> 3)   ' 返回 True。
	Debug.Trace MyResult
	MyResult = ("5" > "4")   ' 返回 True。
	Debug.Trace MyResult
	
	Var1 = "5": Var2 = 4   ' 设置变量初值。
	MyResult = (Var1 > Var2)   ' 返回 True。
	Debug.Trace MyResult
	
	Var1 = 5: Var2 = Empty
	MyResult = (Var1 > Var2)   ' 返回 True。
	Debug.Trace MyResult
	
	Var1 = 0: Var2 = Empty
	MyResult = (Var1 = Var2)   ' 返回 True。
	Debug.Trace MyResult
   
    Exit Sub
ErrHandler:
    Debug.Print Err.Source & ":" & Err.Description
    Resume Next
End Sub
