Attribute VB_Name = "ArrayRedim"

Sub Main()
	Dim MyArray() As Integer   '声明动态数组。
	Redim MyArray(5)   '分配 5 个元素。
	For I = 1 To 5   '循环 5 次。
	   MyArray(I) = I   '初始化数组。
	Next I
	
	'下一条语句重定义该数组的大小，并清除其中的元素。
	
	Redim MyArray(10)   '大小重定为 10 个元素。
	For I = 1 To 10   '循环 10 次。
	   MyArray(I) = I   '初始化数组。
	Next I
	
	'下面的语句重定义该数组的大小，但没有清除其中的元素。
	
	Redim Preserve MyArray(15)   '大小重定为 15 个元素。
End Sub