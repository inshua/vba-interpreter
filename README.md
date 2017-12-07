# vba-interpreter
implement a  vba interpreter in java

VBA 解析器、基于VBA语言的规则引擎

![preview](/vba/FormTwoControls/2 controls.jpg?raw=true)
coding........

----

* 目前已经实现了绝大部分vba语言特性（传值传址、集合、默认方法、默认属性、类、implement、事件、调试等等）
* 不准备实现文件等等古老的命令语句
* 扩充了如下java交互的特性：
0. CreateObject("java class", construtor arguments)
0. java.util.Map 对象可通过 !key 访问成员
0. java.util.List 对象可通过 (index) 访问成员
0. bean 可使用属性方式访问
* 设计了规则语法，使之可以扮演规则引擎（这是本项目的创建动机）：

```vb
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

```
规则是多个同名 Function 构成的束，在定义时使用  When 表达式实现入口匹配。

----

VB 语言自身较为落后，语法也有诸多设计不当。最严重的莫过于函数和数组都通过 ()访问，后面扩充的Item类成员也使用 ()，导致语法上歧义丛生。但 VB 语言采取的`函数名=结果`返回结果的形式非常适合编写业务规则，本项目的动机主要也是为了实现一个友好实用的规则引擎。

