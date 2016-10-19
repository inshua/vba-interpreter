Attribute VB_Name = "Module1"
Sub Main()
    On Error GoTo ErrHandler
    
    Dim i As Integer
    Dim b As Byte
    Dim yn As Boolean
    Dim s As String
    Dim l As Long
    Dim sng As Single : sng = 2.2
    Dim d As Double
    Dim dt As Date
    dt = Now
    Dim c As Currency
    Dim v As Variant
    Dim e As Variant  ' empty
    
    c = 2.22
    i = 1
	Debug.Trace i + c 
	Debug.Print i + c
    
    v = 2.22
    Debug.Trace v + c
    
    v = "hello"
    Debug.Trace v + c
    
    Debug.Print "currency and double"
    d = 4.4
    Debug.Trace d + c	'Currency, 在 + - 运算 Currency 高于 Double，在乘法低于 Double
    Debug.Trace d - c
    Debug.Trace d * c	'Double
    Debug.Trace d / c	'Double

	v = d
    Debug.Trace v + c	'Variant/Currency
    
    v = c
    Debug.Trace v + c
    
    Debug.Trace c + "2.22"	'Currency, double < currency
    Debug.Trace v + "2.22"
        
   	yn = True
   	Debug.Trace yn + c
   	
   	b = 8
   	Debug.Trace b + c
   	
   	Debug.Trace c + e
   	
   	dt = 2958465&
   	Debug.Trace dt
   	
   	Debug.Trace dt + c	'溢出
   	
   	v = dt
   	Debug.Trace v + c	'V/Currency
   	
   	Debug.Trace c / sng
   	Debug.Trace c * sng
   	
    Exit Sub
ErrHandler:
    Debug.Print Err.Source & ":" & Err.Description
    Resume Next
End Sub
