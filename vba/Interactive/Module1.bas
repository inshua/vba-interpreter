Attribute VB_Name = "Module1"
Sub Main()
	Dim t As Object
	Set t = CreateObject("test.TypesTest")
	
	Dim d
	Set d = CreateObject("test.Dragon", "Jack")		' constructor params
	
	t.test1 d
	
	t.test2 d		' auto match signature test2(Dragon d)
	
	Dim arr(10) As Integer
	For i = 0 To 10 
		arr(i) = i
	Next
	t.test3 arr, "hello", True, Now
	
	t.test4 arr, 2.2, Nothing
	
	t.test5 2,3, "abc", True, Now
	
	Debug.Print t.test6("2", 3.5)		' auto convert type: int test6(int a, int b)
	
	Dim ls
	Set ls = CreateObject("java.util.ArrayList")
	ls.Add 2
	ls.Add "hello"
	ls(0) = 22			' access list element like vb array
	
	Debug.Print ls(1)
	
	For Each e In ls	' for each over Iterator
		Debug.Trace e
	Next
	
	Dim m 
	Set m = CreateObject("java.util.HashMap")
	m!name = "Tom"		' use ! access java map
	m!gender = "M"
	m!name = m!name & " Armstrong"		' can assign
	
	For Each k In m.KeySet			' for each over Iterator,  for each v in map, equals for each v in m.values
		Debug.Print k & ":" & m.get(k)
	Next
End Sub
