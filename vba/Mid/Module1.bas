Attribute VB_Name = "Module1"
Sub Main()
	Dim MyString
	MyString = "The dog jumps"   ' 设置字符串初值。
	Mid(MyString, 5, 3) = "f"   ' MyString = "The fog jumps"。
	Debug.Trace MyString
	Mid(MyString, 5, 3) = "fox"   ' MyString = "The fox jumps"。
	Debug.Print MyString
	Mid(MyString, 5) = "cow"   ' MyString = "The cow jumps"。
	Debug.Print MyString
	Mid(MyString, 5) = "cow jumped over"   ' MyString = "The cow jumpe"。
	Debug.Print MyString
	Mid(MyString, 5, 3) = "duck"   ' MyString = "The duc jumpe"。
	Debug.Print MyString
	
	
	Dim FirstWord, LastWord, MidWords
	MyString = "Mid Function Demo"   '建立一个字符串。
	FirstWord = Mid(MyString, 1, 3)   ' 返回 "Mid"。
	Debug.Print FirstWord
	LastWord = Mid(MyString, 14, 4)   ' 返回 "Demo"。
	Debug.Print LastWord
	MidWords = Mid(MyString, 5)   ' 返回 "Funcion Demo"。
	Debug.Print MidWords
End Sub
