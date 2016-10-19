Attribute VB_Name = "FuncCall"

Sub Main()
	Dim r As Double
	r = CalculateSquareRoot(2)
	Debug.Print  r
	
	Dim n As Double
	n = aNumber
	Debug.Print  n
	
	Stop
	r = SqrRoot(1.0, n)
	Debug.Print  r
End Sub

Function aNumber() As Double
	aNumber = 2.0
End Function

Function add(a As Integer, b as Integer) As Double
	add = a + b
End Function

'下面的用户自定义函数返回
'它的参数的平方根。
Function CalculateSquareRoot(NumberArg As Double) As Double
   If NumberArg < 0 Then   '评估参数。
      Exit Function   '退出调用过程。
   Else
      CalculateSquareRoot = Sqr(NumberArg)   '返回平方根。
   End If
End Function

Function IsGoodEnough(guess As Double, x As Double) As Boolean
    IsGoodEnough = Abs(x - guess * guess) <= 0.00001
End Function

Function NewGuess(guess As Double, x As Double) As Double
    NewGuess = (guess + x / guess) / 2.0
End Function

Function SqrRoot(guess As Double, x As Double) As Double
    'Debug.Print  "guess " & guess
    If IsGoodEnough(guess, x) Then
        SqrRoot = guess
    Else
        SqrRoot = SqrRoot(NewGuess(guess, x), x)
    End If
End Function

