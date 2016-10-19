Attribute VB_Name = "Module1"
Sub Main()
    Dim op As MathOp
    Set op = New MathOp
    'op.add 1, 2
        
    'Call op.add(3, 4)
    
    'op.Self.add 2, 3
    
    Dim a
    Set a = op.Self
    'a.add 3, 3
    
'    Call a.Self.add(5, 6)
'    Call a.This(2).add(4, 6)
    
    ' vb 的蠢点：如果无参函数返回数组，() 到底是属于数组还是属于参数，vb 将无法处理
    ' 错误的参数号或无效的属性赋值， 本解析器能搞定 :D
    ' Call op.arr(1).add(2, 3)
    
    ' 但是即使有参函数返回数组也无法 f(arg)()  ——语法错误
    'Call op.arr(2)(1).add(2, 3)   ' 本解析器能搞定 :D
    
    'Dim j
    'j = op.arr(2)
    'Call op.arr(2)(1).add(2, 3)
    
    
    With op
        .add 20, 30
        With .Self
            Call .add(30, 50)
        End With
    End With
    
End Sub
