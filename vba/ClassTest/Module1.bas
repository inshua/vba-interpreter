Attribute VB_Name = "Module1"
Sub main()
    Dim c As New Class1
    
    c.name = "tom"
    Dim s
    s = "my name is " & c.name
    Debug.Print s
'
    Set c.MyFriend = New Class1
    c.MyFriend.name = "jerry"
    Debug.Print "my friend " & c.MyFriend.name
    
    Set c.MyFriend.MyFriend = New Class1
    c.MyFriend.MyFriend.name = "marry"
    
    Debug.Print "jerry's friend " & c.MyFriend.MyFriend.name
End Sub
