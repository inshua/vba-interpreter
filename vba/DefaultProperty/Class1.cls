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
Attribute VB_Ext_KEY = "SavedWithClassBuilder6" ,"Yes"
Attribute VB_Ext_KEY = "Top_Level" ,"Yes"
Private mName As String
Private mvarId As Integer
Public Property Let Id(ByVal vData As Integer)
    mvarId = vData
End Property


Public Property Get Id() As Integer
Attribute Id.VB_UserMemId = 0
    Id = mvarId
End Property



Public Property Get Name() As String
    Name = mName
End Property

Public Property Let Name(s As String)
    mName = s
End Property
