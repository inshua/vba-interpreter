Attribute VB_Name = "gosub"

Sub Main()
    Debug.Print  1
    GoSub a
    Debug.Print  2
    Exit Sub
a:
    Debug.Print  3
    Debug.Print  4
    GoSub b
    Debug.Print  "4.1"
    Return
    Exit Sub
b:
    Debug.Print  5
    Return
End Sub
