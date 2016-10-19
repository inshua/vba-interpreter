Attribute VB_Name = "Module1"
Sub Main()
	Test True
	Debug.Print True
End Sub


Sub Test(ByRef a As Boolean)
	a = Not a
End Sub