Attribute VB_Name = "Module1"

Function ReturnTwice(Optional A)
   Debug.Trace a + 2
End Function

Sub Main()
    On Error GoTo ErrHandler
    
    Dim ReturnValue
    ReturnValue = ReturnTwice()  
    'Debug.Print ReturnValue
    ReturnValue = ReturnTwice(2)
    'Debug.Print ReturnValue
    
    Exit Sub
ErrHandler:
	Debug.Print "Err " & Err * 1
    Debug.Print Err.Source & " " & Err & ":" & Err.Description
    Resume Next
End Sub
