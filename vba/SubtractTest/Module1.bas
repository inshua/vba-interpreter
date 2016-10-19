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
    
    v = 22
    s = "22"
    Debug.Trace v - s    'Variant/Double 0.0
    
    v = 22
    s = "tom"
    Debug.Trace s - v    '类型不匹配
    
    v = "hello"
    s = "tom"
    Debug.Trace v - s
    
    Debug.Trace e - "jerry"
    Debug.Trace "111" - "222"	'Double -111.0
    Debug.Trace 111 - e		'Variant/Integer 111
	
	sng = 2.22
	l = 33
    Debug.Trace sng - l		'Double -30.78
    
    v = sng
    Dim v2 
    v2 = l
   	Debug.Trace v - v2
   	
   	Debug.Trace dt
   	Debug.Trace dt - "10"
   	
   	yn = True
   	Debug.Trace yn - "10"	'Double -11.0
   	
   	b = 8
   	Debug.Trace yn - b		'Integer -9
   	
   	Debug.Trace yn - e		'Variant/Integer -1
   	
   	Dim i2 As Integer
   	i2 = -32768
   	i = -32768
   	Debug.Trace i2 - i	
   	
   	v = i
   	v2 = i2
   	Debug.Trace v - v2	'V/Long
   	
   	dt = -657434&
   	Debug.Trace dt
   	
   	Debug.Trace dt - 2	'溢出
   	
   	v = dt
   	Debug.Trace v - 2	'V/Double
   	
   	Dim b2 As Byte
   	b = 20
   	b2 = 200
   	Debug.Trace b - b2	' 溢出
   	
   	v = b
   	Debug.Trace v - b2	' V/Integer
   
    Exit Sub
ErrHandler:
    Debug.Print Err.Source & ":" & Err.Description
    Resume Next
End Sub
