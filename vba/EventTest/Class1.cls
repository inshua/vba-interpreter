VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
  Persistable = 0  'NotPersistable
  DataBindingBehavior = 0  'vbNone
  DataSourceBehavior  = 0  'vbNone
  MTSTransactionMode  = 0  'NotAnMTSObject
END
Attribute VB_Name = "Class1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = True
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False
Event OnTest(s As String)
Dim mName As String

Public Sub test()
    RaiseEvent OnTest("hello, i am " & mName)
End Sub

Property Get Name() As String
    Name = mName
End Property

Property Let Name(v As String)
    mName = v
End Property

Public Sub OnTest()

End Sub

