VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
END
Attribute VB_Name = "Class1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False

Public a As Integer

Public b As Integer

Public Function add(a As Integer, b As Integer) As Integer
	add = a + b
End Function

Public Function AddB(b As Integer) As Integer
	AddB = a + b
End Function

Public Function AddAB() As Integer
	AddAB = a + b
End Function

