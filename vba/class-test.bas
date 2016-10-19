sub Main()
	Debug.Print "hello"
	
	Dim c As New Class1
	Dim r As Integer
	r = c.add(1,2)
	Debug.Print r
	
	dim c2 as new class1
	c2.a = 12
	
	c.a = 5
	r = c.addB(2)
	Debug.Print r
	
	Debug.Print c2.addB(3)		' c2 and c are diffrent object
	
	Dim t As New Class1
	t.a = 2
	t.b = 8
	Debug.Print t.AddAB
end sub