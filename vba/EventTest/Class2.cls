VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
  Persistable = 0  'NotPersistable
  DataBindingBehavior = 0  'vbNone
  DataSourceBehavior  = 0  'vbNone
  MTSTransactionMode  = 0  'NotAnMTSObject
END
Attribute VB_Name = "Class2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = True
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False
Private WithEvents c As Class1
Attribute c.VB_VarHelpID = -1

'Private WithEvents Class As Class1

Public Property Get C1() As Class1
    Set C1 = c
End Property

Public Property Set C1(v As Class1)
    Set c = v
End Property

Private Sub c_OnTest(s As String)
    Debug.Print "event come " & s
End Sub

Private Sub Class_OnTest(s As String)
    Debug.Print s
End Sub

Private Sub Class_Initialize()
    Debug.Print "Class2 Initialize"
End Sub

Private Sub Class_Terminate()
    Debug.Print "Class2 Terminate"
End Sub
