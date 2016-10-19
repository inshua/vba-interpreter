Attribute VB_Name = "Module1"
Sub Main()
    On Error GoTo ErrHandler
    
    Dim MyCheck
	MyCheck = "aBBBa" Like "a*a"   ' 返回 True。
	Debug.Print MyCheck
	MyCheck = "F" Like "[A-Z]"   ' 返回 True。
	Debug.Print MyCheck
	MyCheck = "F" Like "[!A-Z]"   ' 返回 False。
	Debug.Print MyCheck
	MyCheck = "a2a" Like "a#a"   ' 返回 True。
	Debug.Print MyCheck
	MyCheck = "aM5b" Like "a[L-P]#[!c-e]"   ' 返回 True。
	Debug.Print MyCheck
	MyCheck = "BAT123khg" Like "B?T*"   ' 返回 True。
	Debug.Print MyCheck
	MyCheck = "CAT123khg" Like "B?T*"   ' 返回 False。
    Debug.Print MyCheck
    Exit Sub
ErrHandler:
    Debug.Print Err.Source & ":" & Err.Description
    Resume Next
End Sub
