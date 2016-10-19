Attribute VB_Name = "goto"

Sub Main()
    Debug.Print  1
    GoTo a
    Debug.Print  2
    Exit Sub
a:
    Debug.Print  3
    Debug.Print  4
End Sub
