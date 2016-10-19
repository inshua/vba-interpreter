Attribute VB_Name = "Module1"

Sub main()
    Dim o As New Class2
    Set o.C1 = New Class1
    o.C1.Name = "tom"
    o.C1.test
    
    o.C1.Name = "jerry"
    o.C1.test
    
    Dim prevC1 As Class1
    Set prevC1 = o.C1
    
    Set o.C1 = New Class1
    o.C1.Name = "mary"
    o.C1.test
    
    prevC1.test     ' event bind with Set statemnet
    
    
    Dim o2 As New Class2
    Set o2.C1 = o.C1
    o.C1.test       ' print 'mary' twice
End Sub
