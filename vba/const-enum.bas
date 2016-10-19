Enum State
    Ready  = 2
    Complete = 3
End Enum

Const a As Integer = 3
Const b As Integer = a * 2
Const cc As Integer = Ready * 2
Const ccc As Integer = State.Complete * 2
Sub Main()
	Dim st As State
    'st = Ready
    st = State.Complete
    
    'Const a As Integer = 2
    
    'Dim arr(a To b) As Integer
    
    'Debug.Print  cc
    'Debug.Print  ccc
    
    
End Sub
