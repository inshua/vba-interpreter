VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   4695
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   7995
   LinkTopic       =   "Form1"
   ScaleHeight     =   4695
   ScaleWidth      =   7995
   StartUpPosition =   3  '´°¿ÚÈ±Ê¡
   Begin VB.CommandButton Command3 
      Caption         =   "Outside Frame 1"
      Height          =   495
      Left            =   1080
      TabIndex        =   3
      Top             =   3360
      Width           =   2055
   End
   Begin VB.Frame Frame1 
      Caption         =   "A Frame"
      Height          =   1935
      Left            =   720
      TabIndex        =   0
      Top             =   840
      Width           =   5775
      Begin VB.CommandButton Command2 
         Caption         =   "Inside Frame 2"
         Height          =   495
         Left            =   2520
         TabIndex        =   2
         Top             =   720
         Width           =   1455
      End
      Begin VB.CommandButton Command1 
         Caption         =   "Inside Frame 1"
         Height          =   495
         Left            =   360
         TabIndex        =   1
         Top             =   720
         Width           =   1455
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Load()
    
End Sub
