VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Calculator"
   ClientHeight    =   5325
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   5835
   LinkTopic       =   "Form1"
   ScaleHeight     =   5325
   ScaleWidth      =   5835
   StartUpPosition =   3  '´°¿ÚÈ±Ê¡
   Begin VB.CommandButton Command1 
      Caption         =   "="
      Height          =   735
      Index           =   17
      Left            =   3720
      TabIndex        =   18
      Top             =   4440
      Width           =   1695
   End
   Begin VB.CommandButton Command1 
      Caption         =   "CE"
      Height          =   735
      Index           =   16
      Left            =   4680
      TabIndex        =   17
      Top             =   1200
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "C"
      Height          =   735
      Index           =   15
      Left            =   3720
      TabIndex        =   16
      Top             =   1200
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "/"
      Height          =   735
      Index           =   14
      Left            =   4680
      TabIndex        =   15
      Top             =   3360
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "+"
      Height          =   735
      Index           =   13
      Left            =   3720
      TabIndex        =   14
      Top             =   2280
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "-"
      Height          =   735
      Index           =   12
      Left            =   4680
      TabIndex        =   13
      Top             =   2280
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "*"
      Height          =   735
      Index           =   11
      Left            =   3720
      TabIndex        =   12
      Top             =   3360
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "."
      Height          =   735
      Index           =   10
      Left            =   2640
      TabIndex        =   11
      Top             =   4440
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "0"
      Height          =   735
      Index           =   9
      Left            =   360
      TabIndex        =   10
      Top             =   4440
      Width           =   1815
   End
   Begin VB.CommandButton Command1 
      Caption         =   "3"
      Height          =   735
      Index           =   8
      Left            =   2640
      TabIndex        =   9
      Top             =   3360
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "2"
      Height          =   735
      Index           =   7
      Left            =   1440
      TabIndex        =   8
      Top             =   3360
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "1"
      Height          =   735
      Index           =   6
      Left            =   360
      TabIndex        =   7
      Top             =   3360
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "6"
      Height          =   735
      Index           =   5
      Left            =   2640
      TabIndex        =   6
      Top             =   2280
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "5"
      Height          =   735
      Index           =   4
      Left            =   1440
      TabIndex        =   5
      Top             =   2280
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "4"
      Height          =   735
      Index           =   3
      Left            =   360
      TabIndex        =   4
      Top             =   2280
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "9"
      Height          =   735
      Index           =   2
      Left            =   2640
      TabIndex        =   3
      Top             =   1200
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "8"
      Height          =   735
      Index           =   1
      Left            =   1440
      TabIndex        =   2
      Top             =   1200
      Width           =   735
   End
   Begin VB.CommandButton Command1 
      Caption         =   "7"
      Height          =   735
      Index           =   0
      Left            =   360
      TabIndex        =   1
      Top             =   1200
      Width           =   735
   End
   Begin VB.TextBox Text1 
      Alignment       =   1  'Right Justify
      BeginProperty Font 
         Name            =   "Consolas"
         Size            =   24
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   360
      TabIndex        =   0
      Text            =   "0"
      Top             =   240
      Width           =   5055
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
'Copyright (C) 2017 Inshua<inshua@gmail.com>
'
'Permission is hereby granted, free of charge, to any person obtaining a copy
'of this software and associated documentation files (the "Software"), to deal
'in the Software without restriction, including without limitation the rights
'to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
'copies of the Software, and to permit persons to whom the Software is
'furnished to do so, subject to the following conditions:
'
'The above copyright notice and this permission notice shall be included in
'all copies or substantial portions of the Software.
'
'THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
'IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
'FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
'AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
'LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
'OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
'SOFTWARE.

Option Explicit
Enum StateEnum
    Start
    Num1Int
    Num1Float
    Operator
    Num2Int
    Num2Float
    Result
    Exception
End Enum

Enum MessageType
    Number
    Dot
    Operator
    Eq
    Command
End Enum

Dim state As StateEnum

Dim number1 As Double
Dim number2 As Double
Dim s As String
Dim op As String
        
Function typeOfMessage(key As String) As MessageType
    Select Case key
    Case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        typeOfMessage = MessageType.Number
    Case "."
        typeOfMessage = MessageType.Dot
    Case "+", "-", "*", "/"
        typeOfMessage = MessageType.Operator
    Case "="
        typeOfMessage = MessageType.Eq
    Case Else
        typeOfMessage = MessageType.Command       ' C / CE
    End Select
End Function

    
Sub handle(key As String)
    On Error GoTo ErrHandle
    Dim t As MessageType
    t = typeOfMessage(key)
    Select Case state
    Case StateEnum.Start
        handle_start t, key
    Case StateEnum.Num1Int
        Me.handle_num1_int t, key
    Case StateEnum.Num1Float
        Me.handle_num1_float t, key
    Case StateEnum.Operator
        Me.handle_op t, key
    Case StateEnum.Num2Int
        Me.handle_num2_int t, key
    Case StateEnum.Num2Float
        Me.handle_num2_float t, key
    Case StateEnum.Result
        Me.handle_result t, key
    Case StateEnum.Exception
        Me.handle_error t, key
    End Select
    Exit Sub
ErrHandle:
    s = Err.Description
    display
    state = StateEnum.Exception
End Sub

Sub handle_start(opType As MessageType, value As String)
    Select Case opType
    Case Number
        s = value
        display
        state = Num1Int
    Case Dot
        s = "0."
        display
        state = Num1Float
    Case Eq
        display
        state = Result
    Case MessageType.Operator
        number1 = 0
        state = StateEnum.Operator
    Case Command
        ' pass
    End Select
End Sub

Sub handle_num1_int(opType As MessageType, value As String)
    Select Case opType
    Case Number
        s = s + value
        display
    Case Dot
        s = s + "."
        display
        state = Num1Float
    Case Eq
        number1 = CDbl(s)
        s = number1
        display
        state = Result
    Case MessageType.Operator
        op = value
        number1 = CDbl(s)
        s = number1
        display
        state = StateEnum.Operator
    Case Command
        s = "0"
        display
        If value = "C" Then
            state = Start
        Else    ' CE
            state = Num1Int
        End If
    End Select
End Sub

Sub handle_num1_float(opType As MessageType, value As String)
    Select Case opType
    Case Number
        Me.handle_num1_int opType, value
    Case Dot
        ' pass
    Case Eq
        Me.handle_num1_int opType, value
    Case MessageType.Operator
        Me.handle_num1_int opType, value
    Case Command
        Me.handle_num1_int opType, value
    End Select
End Sub

Sub handle_op(opType As MessageType, value As String)
    Select Case opType
    Case Number
        s = value
        display
        state = Num2Int
    Case Dot
        s = "0."
        state = Num2Float
    Case Eq
        number2 = number1
        calc
        s = number1
        display
        state = Result
    Case MessageType.Operator
        op = value
    Case Command
        s = "0"
        display
        If value = "C" Then
            state = Start
        Else
            state = Num2Int
        End If
    End Select
End Sub

Sub handle_num2_int(opType As MessageType, value As String)
    Select Case opType
    Case Number
        s = s + value
        display
    Case Dot
        s = s + "."
        display
        state = Num2Float
    Case Eq
        number2 = CDbl(s)
        calc
        s = number1
        display
        state = Result
    Case MessageType.Operator
        number2 = CDbl(s)
        calc
        s = number1
        display
        state = StateEnum.Operator
    Case Command
        s = "0"
        display
        If value = "C" Then
            state = Start
        Else    ' CE
            state = Num2Int
        End If
    End Select
End Sub

Sub handle_num2_float(opType As MessageType, value As String)
    Select Case opType
    Case Number
        Me.handle_num2_int opType, value
    Case Dot
        ' pass
    Case Eq
        Me.handle_num2_int opType, value
    Case MessageType.Operator
        Me.handle_num2_int opType, value
    Case Command
        Me.handle_num2_int opType, value
    End Select
End Sub

Sub handle_result(opType As MessageType, value As String)
    Select Case opType
    Case Number
        s = value
        state = Num1Int
        display
    Case Dot
        s = "0."
        state = Num1Float
        display
    Case Eq
        calc
        s = number1
        display
    Case MessageType.Operator
        op = value
        state = StateEnum.Operator
    Case Command
        state = Start
        s = "0"
        display
    End Select
End Sub

Sub handle_error(opType As MessageType, value As String)
    Select Case opType
    Case Number
    Case Dot
    Case Eq
    Case MessageType.Operator
    Case Command
        s = "0"
        display
        state = Start
    End Select
End Sub

Sub display()
    Me.Text1 = s
End Sub

Sub calc()
    Select Case op
    Case "+"
        number1 = number1 + number2
    Case "-"
        number1 = number1 - number2
    Case "*"
        number1 = number1 * number2
    Case "/"
        number1 = number1 / number2
    End Select
End Sub

Private Sub Command1_Click(Index As Integer)
    handle (Command1(Index).Caption)
End Sub

