Attribute VB_Name = "Module1"
Sub Main()
   Dim r 
   Stop
   r = SqrRoot(1.0, 2)
   Debug.Print r
End Sub

Function IsGoodEnough(guess As Double, x As Double) As Boolean
    IsGoodEnough = Abs(x - guess * guess) <= 0.00001
End Function

Function NewGuess(guess As Double, x As Double) As Double
    NewGuess = (guess + x / guess) / 2.0
End Function

Rule SqrRoot(guess As Double, x As Double) As Double
	SqrRoot = SqrRoot(NewGuess(guess, x), x)
End Rule

Rule SqrRoot When IsGoodEnough(guess, x)
	SqrRoot = guess
End Rule

