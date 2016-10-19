VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
  Persistable = 0  'NotPersistable
  DataBindingBehavior = 0  'vbNone
  DataSourceBehavior  = 0  'vbNone
  MTSTransactionMode  = 0  'NotAnMTSObject
END
Attribute VB_Name = "Person"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = True
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False
Attribute VB_Ext_KEY = "SavedWithClassBuilder6" ,"Yes"
Attribute VB_Ext_KEY = "Top_Level" ,"Yes"

Dim name_ As String
Dim mAge As Integer

Public Property Get Name() As String
    Name = name_
End Property

Public Property Let Name(n As String)
    name_ = n
End Property

Public Property Get Age(mode As Boolean, s As String) As Integer
    Age = mAge
End Property

Public Property Let Age(mode As Boolean, s As String, a As Integer)
    mAge = a
End Property

Public Function get_Name() As String

End Function

Public Function getName() As String

End Function


