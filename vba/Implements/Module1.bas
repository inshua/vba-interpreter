Attribute VB_Name = "Module1"
Sub Main()
    On Error GoTo ErrHandler
    
    Dim sp As Sprite
    Set sp = New Dragon
    sp.ResourceKey = "Test"
    sp.Move
    
    Debug.Print TypeOf sp Is Dragon     ' True
    Debug.Print TypeOf sp Is Sprite     ' True
    Debug.Print TypeOf sp Is SaveLoadable   ' True
    
    sp.ResourceField = 222

    Debug.Print sp.Desc

    Dim s As SaveLoadable
    Set s = sp       ' 如不实现该接口则抛 13 类型不匹配
    s.Save

    Dim dg As Dragon
    Set dg = sp
    dg.Sprite_Move
    
    Debug.Print TypeOf dg Is Dragon     ' True
    Debug.Print TypeOf dg Is Sprite     ' True
    Debug.Print TypeOf dg Is SaveLoadable   ' True
    Debug.Print TypeOf dg Is Object         ' True
    

    Dim o As Object
    Debug.Print o Is Nothing    'True
    
    Set o = sp
    Debug.Print o Is Nothing    'True
    o.Load      '438 对象不支持该属性或方法


    Dim dg2 As New Dragon
    Set o = dg2
    o.Load              '438 对象不支持该属性或方法, 只能转为 SaveLoadable 接口才可以用该接口的函数
    
    Debug.Print TypeOf o Is Dragon  ' True
    Debug.Print TypeOf o Is Object  ' True
    
    Debug.Print dg2 Is o    ' True
    
    Exit Sub
ErrHandler:
    Debug.Print Err.Source & ":" & Err & ":" & Err.Description
    Resume Next
End Sub
