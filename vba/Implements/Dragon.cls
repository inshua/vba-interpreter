VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
  Persistable = 0  'NotPersistable
  DataBindingBehavior = 0  'vbNone
  DataSourceBehavior  = 0  'vbNone
  MTSTransactionMode  = 0  'NotAnMTSObject
END
Attribute VB_Name = "Dragon"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = True
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = False
Option Explicit

Implements Sprite
Implements SaveLoadable

Private Sub SaveLoadable_Load()

End Sub

Private Sub SaveLoadable_Save()
    Debug.Print "Save " & Sprite_Desc
End Sub

Private Function Sprite_Desc() As String
    Sprite_Desc = "Great Fire Dragon"
End Function

Public Sub Sprite_Move()
    Debug.Print "Dragon Fly"
End Sub

Private Property Let Sprite_ResourceField(ByVal RHS As String)  ' Public Field ������ Property ����

End Property

Private Property Get Sprite_ResourceField() As String

End Property

Private Property Let Sprite_ResourceKey(RHS As String)
	Debug.Print "Resource Key Of Dragon is fixed, will not change to " + RHS
End Property

Public Property Get Sprite_ResourceKey() As String
    Sprite_ResourceKey = "Dragon Resource"
End Property

