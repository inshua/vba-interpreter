Attribute VB_Name = "Module1"
Sub Main()
    On Error GoTo ErrHandler
    
    Dim i As Integer
    Dim b As Byte
    Dim yn As Boolean
    Dim s As String
    Dim l As Long
    Dim sng As Single
    Dim d As Double
    Dim dt As Date
    dt = Now
    Dim c As Currency
    Dim v As Variant
    Dim e As Variant  ' empty
    
    i = 22
    Debug.Trace +i
    Debug.Trace -i
    
    v = i
    Debug.Trace +v
    Debug.Trace -v
    
    b = 2
    Debug.Trace -b
    
    s = "111"
    Debug.Trace +s
    Debug.Trace -s
    
    yn = True
    Debug.Trace +yn
    Debug.Trace -yn
    
    Debug.Trace +e
    Debug.Trace -e
    
    c = 22
    Debug.Trace +c
    Debug.Trace -c
    
    Debug.Trace +dt
    Debug.Trace -dt
    
    i = -32768
    Debug.Trace i
    Debug.Trace -i
    v = i
    Debug.Trace -v
    
    dt = 2958465
    Debug.Trace -dt
    v = dt
    Debug.Trace -v
   
    Exit Sub
ErrHandler:
    Debug.Print Err.Source & ":" & Err.Description
    Resume Next
End Sub
