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
Dim n As String
Dim f As Class1

Dim c As New Collection

Public Property Get name() As String
    name = n
End Property

Public Property Let name(s As String)
    n = s
End Property


Public Property Get MyFriend() As Class1
    Set MyFriend = f
End Property


Public Property Set MyFriend(p As Class1)
    Set f = p
End Property


Public Property Get Contact(key As String) As Class1
    Contact = c(key)
End Property

Public Property Set Concat(key As String, p As Class1)
    c.Add p, key
End Property
