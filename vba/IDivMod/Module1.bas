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
    Dim c As Currency
    Dim v As Variant
    Dim e As Variant  ' empty
    
    i = 6
    v = 6
    s = "6"
    sng = 6
    dt = Now
	c = 6
	b = 6
	
	Dim i2 As Integer
    Dim b2 As Byte
    Dim yn2 As Boolean
    Dim s2 As String
    Dim l2 As Long
    Dim sng2 As Single
    Dim d2 As Double
    Dim dt2 As Date
    Dim c2 As Currency
    Dim v2 As Variant
    Dim e2 As Variant  ' empty
	
	b2 = 2
	Debug.Trace b \ b2    
    
    Debug.Trace 14 \ 3.5
    i = 14 / 3.5
    Debug.Trace i
    
    v2 = 2.5
    s2 = "6"
    sng2 = 6
    dt2 = Now
	c2 = 6
	b2 = 6
    
    Debug.Trace 15 \ i
    Debug.Trace 15 \ 0
    Debug.Trace dt \ s2
    Debug.Trace v \ i
    
    Debug.Print "--------MOD-----------"
    
    Debug.Trace 16 Mod 5
    Debug.Trace 0 Mod 5
    Debug.Trace 14 Mod 2.5
    Debug.Trace 14 Mod 3.5
    Debug.Trace 14.5 Mod 3.5
    b = 16
    Debug.Trace b Mod b2
    
    Debug.Print "--------POW-----------"
    
    Debug.Trace 16 ^ 5
    Debug.Trace 0 ^ 5
    Debug.Trace 14 ^ 2.5
    Debug.Trace 14 ^ 3.5
    Debug.Trace 14.5 ^ 3.5
    b = 16
    Debug.Trace b ^ b2
    
    Dim MyValue
	MyValue = 2 ^ 2   ' ·µ»Ø 4¡£
	Debug.Trace MyValue
	MyValue = 3 ^ 3 ^ 3   ' ·µ»Ø 19683¡£
	Debug.Trace MyValue
	MyValue = (-5) ^ 3   ' ·µ»Ø -125¡£
    Debug.Trace MyValue
    
    Exit Sub
ErrHandler:
    Debug.Print Err.Source & ":" & Err.Description
    Resume Next
End Sub
