Attribute VB_Name = "ArrayDim"

Sub Main()
	'DayArray 是一个有 51 个索引（从 0 到 50）元素的 Variant 数组，
	'假设在当前模块中 Option Base 被设为 0（缺省设置）。
	Dim DayArray(50)
	DayArray(0) = 2
	DayArray(0) = DayArray(0) * 2
	Debug.Print  DayArray(0)
	
	'Matrix 是一个二维 Integer 数组。
	Dim Matrix(3, 4) As Integer
	Matrix(2, 2) = 8
	Matrix(2, 2) = Matrix(2,2) * 8
	Debug.Print  Matrix(2,2)
	
	'MyMatrix 是一个显式指定了上下界
	'的三维 double 数组。
	Dim MyMatrix(1 To 5,  4 To 9,  3 To 5) As Double
	
	'BirthDay 是一个索引从 1 到 10 的 date 数组。
	Dim BirthDay(1 To 10) As Double      
	
	'MyArray 是一个 variant 动态数组。
	Dim MyArray()
	
End Sub