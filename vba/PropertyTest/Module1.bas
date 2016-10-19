Attribute VB_Name = "Module1"
Sub main()
    Dim p As New Person
    p.Name = "Tom"
    Debug.Print p.Name
    
    p.Name = p.Name & " Fox"
    
    Debug.Print p.Name
    
    Debug.Print p.Age(True, "a")
    p.Age(True, "b") = 22
    
'
'    Dim col As New Collection1
'    col.Add
'    For Each p In col
'
'    Next
End Sub
