VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   3030
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   4560
   LinkTopic       =   "Form1"
   ScaleHeight     =   3030
   ScaleWidth      =   4560
   StartUpPosition =   3  '´°¿ÚÈ±Ê¡
   Begin VB.TextBox Text1 
      BeginProperty Font 
         Name            =   "ËÎÌå"
         Size            =   18
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   480
      TabIndex        =   1
      Text            =   "Visual Basic"
      Top             =   360
      Width           =   3615
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Click Me"
      Height          =   855
      Left            =   1320
      TabIndex        =   0
      Top             =   1800
      Width           =   1815
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim WithEvents fnt As StdFont
Attribute fnt.VB_VarHelpID = -1
Private Sub Command1_Click()
    Debug.Print Now
    Me.Text1.Text = Now
    
    Me.Text1.Font.Size = Me.Text1.Font.Size + 1
End Sub

Private Sub fnt_FontChanged(ByVal PropertyName As String)
	Debug.Print "font changed"
    Debug.Print PropertyName
End Sub

Private Sub Form_Load()
    Set fnt = Me.Text1.Font
End Sub
