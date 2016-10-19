Attribute VB_Name = "Module1"
Sub Main()
    On Error GoTo ErrHandler
    
    Dim MyArray() As Integer   '声明动态数组。
	Redim MyArray(5)   '分配 5 个元素。
	For I = 1 To 5   '循环 5 次。
	   MyArray(I) = I   '初始化数组。
	Next I
	
	Debug.Trace MyArray
	
	Redim MyArray(10)   '大小重定为 10 个元素。
	For I = 1 To 10   '循环 10 次。
	   MyArray(I) = I   '初始化数组。
	Next I
	
	Debug.Trace MyArray
	
	Redim Preserve MyArray(15)   '大小重定为 15 个元素。
	Debug.Trace MyArray    
   
    Exit Sub
ErrHandler:
    Debug.Print Err.Source & ":" & Err.Description
    Resume Next
End Sub
