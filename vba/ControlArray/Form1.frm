VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   3150
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   5385
   LinkTopic       =   "Form1"
   ScaleHeight     =   3150
   ScaleWidth      =   5385
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command1 
      Caption         =   "点击"
      Height          =   615
      Index           =   5
      Left            =   3840
      TabIndex        =   2
      Tag             =   "5"
      Top             =   2040
      Width           =   1215
   End
   Begin VB.CommandButton Command1 
      Caption         =   "点击"
      Height          =   615
      Index           =   1
      Left            =   2400
      TabIndex        =   1
      Tag             =   "CHN"
      Top             =   1080
      Width           =   1215
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Click"
      Height          =   615
      Index           =   0
      Left            =   600
      TabIndex        =   0
      Tag             =   "En"
      Top             =   1080
      Width           =   1215
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click(Index As Integer)
    Dim btn As CommandButton
    Set btn = Me.Command1(Index)
    Debug.Print btn.Tag
    Debug.Print btn.Name
End Sub

Private Sub Form_Load()
    For Each cmd In Me.Command1
        Debug.Print cmd.Caption
    Next
'    Print Command1(22)
End Sub
