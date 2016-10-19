VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
  Persistable = 0  'NotPersistable
  DataBindingBehavior = 0  'vbNone
  DataSourceBehavior  = 0  'vbNone
  MTSTransactionMode  = 0  'NotAnMTSObject
END
Attribute VB_Name = "MathOp"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = True
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False

Public Function add(a As Integer, b As Integer) As Integer
    add = a + b
    
    Debug.Print a & " + " & b & " = " & add
End Function

Private Sub Class_Initialize()
    Debug.Print "MathOp Class_Initialize"
End Sub

Public Function Self() As MathOp
    Set Self = Me
End Function

Public Function This(a As Integer) As MathOp
    Set This = Me
End Function

Public Function arr() As MathOp()
    Dim a(2) As MathOp
    Set a(0) = Me
    Set a(1) = Self
    arr = a
End Function
