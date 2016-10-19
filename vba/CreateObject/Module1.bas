Attribute VB_Name = "Module1"
Sub Main()
	Dim o
	Set o = CreateObject("test.Sprite")
	'o.ResourceKey = "Dragon"
	'Debug.Print o.ResourceKey
	o.Move "Paris"
	
End Sub
