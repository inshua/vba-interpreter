Attribute VB_Name = "Module1"
Sub Main()
    OptionalTest a:=2, c:=3
    OptionalTest c:=3, a:=2
'    OptionalTest 2
'
    ParamArrayTest 1, 2, 3, 4, 5
    
    Dim a
    Set a = New Class1
    
    a.OptionalTest a:=2, c:=3
    a.OptionalTest c:=3, a:=2
End Sub

Sub ByRefTest(ByRef a As Integer)
    a = a + 1
End Sub

Sub OptionalTest(a As Integer, Optional b As Integer = 3, Optional c As Integer = 4)
    Debug.Print a + b + c
End Sub

Sub ParamArrayTest(a As Integer, ParamArray b())
    For Each i In b
         a = a + i
    Next
    Debug.Print a
End Sub


