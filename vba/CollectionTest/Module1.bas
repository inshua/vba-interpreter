Attribute VB_Name = "Module1"
Sub Main()
    On Error GoTo ErrHandler
    
    Dim a As Variant
    Dim col As New Collection
    Set a = col
    col.Add "Tom", "no1"
    col.Add "Jack", "no1"   '该关键字已经与该集合的一个元素相关联
    col.Add "Jack", "no2"
    col.Add "Tim", , "no1"
    col.Add "Mary", "22"
    
    Debug.Print col.Item(3)
    Debug.Print col("no1")
    Debug.Print a("no1")
    Debug.Print col!no2
    Debug.Print a!no2
    Debug.Print col(3)
    Debug.Print a(3)

    Debug.Print col!notExist    '无效的过程调用或参数
    Debug.Print col(22)         '下标越界
    Debug.Print col("22")
    Debug.Print col("1")        '无效的过程调用或参数

    col.Remove 22               '下标越界
    col.Remove -1               '下标越界
    col.Remove "Jack"           '无效的过程调用或参数
 
    For Each p In col
        Debug.Print p
    Next
    
    For Each p In a
        Debug.Print p
    Next
    Exit Sub
    
ErrHandler:
    Debug.Print Err.Source & " " & Err.Number & " " & Err.Description
    Resume Next
End Sub
