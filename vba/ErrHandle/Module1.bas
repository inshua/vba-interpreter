Attribute VB_Name = "Module1"

Sub Main()
    test
    
    Call CallDontHandle
End Sub

Sub test()
    On Error GoTo ErrHandle
    Dim a As Integer
    Dim b As Integer
    a = 2
    b = 0
    b = a / b
    'Debug.Print b
    
    Debug.Print a / b
    Exit Sub
    
ErrHandle:
    Debug.Print Err.Description
    b = 2
    Resume
End Sub


Sub DontHandle()
    Dim i As Integer
    i = Null
End Sub

Sub CallDontHandle()
    DontHandle
End Sub
