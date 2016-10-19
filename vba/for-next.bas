Attribute VB_Name = "ForNext"

Sub Main()
	Debug.Print "hello"
	
	Dim i As Integer
	For i = 1 To 10
		Debug.Print i
	Next
	
	Dim arr(1 To 10) As Integer
	For i = 1 To 10
		arr(i) = i
	Next
	
	Debug.Print "Sum:" & SumOf(arr)
	
	For i = 1 To 10
		Debug.Print arr(i)
		If arr(i) > 5 Then Exit For
	Next
End Sub

Function SumOf(arr() As Integer) As Integer
	Dim i As Integer
	For i = 1 To 10
		SumOf = SumOf + arr(i)
	Next
End Function
