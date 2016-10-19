VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
END
Attribute VB_Name = "MOp"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False

Public Function add(a As Integer, b As Integer) As Integer
	add = a + b
	
	Debug.Print a & " + " & b & "=" & add
End Function
