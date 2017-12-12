# vba-interpreter
implement a  vba interpreter in java

VBA 解析器、基于VBA语言的规则引擎

![preview](/vba/FormTwoControls/2controls.jpg?raw=true)
![Caculator on Mac](/vba/Calculator/calc_mac.png?raw=true)
![Caculator on Win](/vba/Calculator/calc_win.png?raw=true)
![Caculator on Old VB](/vba/Calculator/vb_calc_win.png?raw=true)

# 语法

| Feature   | Detail | Implemented |  |
| ----------| ------ | ------------| -----|
| 基本数据类型    | Boolean, Integer, Short, Long, Double, Float, Byte, Currency, Date, String, Variant, Void, vbNull, Empty  | Y | VB6 Integer 太短，按 Java Integer 处理 |
| Dim		| 变量定义, Private, Public ... | Y | |
| Const		| 常量定义 | Y | |
| UDT		| Type ... End Type | Y | |
| Enum 		| Enum ... End Enum | Y | |
| 数组 		| 数组、动态数组、ReDim Preserved | Y | |
| 对象类型		| Dim .. As New 	| Y | |
| Class		| 类模块, Implement, Event, _NewEnum, 默认成员, Iterable | Y |  |
| Module	| 模块				| Y | |
| Function  | Scope, Function Name as Return Variable, 递归, 调用堆栈   | Y | |
| Sub		| 同		| Y | |
| Property		| Get Let Set		| Y | 支持 Java Bean 的 get set 作为属性 |
| Rule(扩充) | 多支规则束, Guard 条件	 | Y | |
| 参数		 | ByVal/ByRef, Optional, Param Array | Y | |
| If Then 	|  If Then Else			| Y | |
| While		| While Loop			| Y | |
| For Loop		| For Next Loop			| Y | |
| Do While		| Do While Loop			| Y | |
| Do Until		| Do Until Loop			| Y | |
| Wend		| WEnd Loop			| Y | |
| For Each		| For Each At Iterable Object			| Y | |
| Select Case | Case val1, val2, ... Case Is X, Case Between, Case String Or Number | Y | |
| 文件语句			| Open ,Print #... Close  | N | 不实现 |
| 错误处理			| On Error Goto , On Error Resume [Next] | Y | 扩充 Err 支持错误堆栈信息 |
| 宏语法			| #If ... | N | |

# 调试器

支持单步、断点、Debug.Break、查看当前帧变量等，还不支持运行时修改代码。

# 库

## VBA

| Feature   	| Detail 						| Implemented 	|  		|
| ----------	| ------ 						| ------------	| -----	|
| Collection	| Item(default), Iterable, !key 访问	| Y 		| 扩充对 Java List, Map 的 支持 | 
| Strings		| Left Right Mid ...			| 部分实现			|
| Constants		| 								| Y |	|
| Conversion	| CByte() CDbl() CStr() Str() ... | 部分实现 | |
| DateTime		| Now, DateAdd ...				| 部分实现 | |
| ErrObject		| 								| Y | |
| FileSystem	| 								| N | |
| Financial		| 								| N | |
| Information	| Err, IsArray, IsDate ... 		| 部分实现 | |
| Interaction	| MsgBox, CreateObject ...		| 部分实现 | CreateObject 用于创建 Java对象 |
| Math			| Abs, Randomize, Rnd, Round...	| Y | | 

## stdole

| Feature   | Detail | Implemented |  |
| ----------| ------ | ------------| -----|
| StdFont	| 		 | Y | |
| StdPicture| 		 | N | |
| StdFunctions |	 | N | |

## VB

| Feature   | Detail | Implemented |  |
| ----------| ------ | ------------| -----|
| Form	| frm 解析、Load 事件、ClientWidth 等	 | 部分 | Load 语句(实为 Global.Load) 及 Unload 未实现 |
| TextBox | Font, Alignment 等 | 部分 | |
| CommandButton | Caption, Click 事件等 | 部分  | |
| Frame		| Caption 等 | 部分 | 典型容器、可容纳其它子控件 |

其它控件未实现。

# 扩充

* 扩充了如下java交互的特性：
1. CreateObject("java class", construtor arguments)
1. java.util.Map 对象可通过 !key 访问成员
1. java.util.List 对象可通过 (index) 访问成员
1. bean 可使用属性方式访问
* 引入一批 Java Annotation 用于表述 VB 成员：@VbMethod @VBEvent 等，使编写用于 VB 的模块较为轻松
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

Rule 个税() When 收入 < 3500
	个税 = 0
End Rule

Rule 个税() When 收入 ...
	...
End Rule 
```
规则是多个同名 Function 构成的束，在定义时使用  When 表达式实现入口匹配。

# 说明

本项目已覆盖了几乎 VB 所有的特性，只是库还不够全。

VB 语言自身较为落后，语法也有诸多设计不当。最严重的莫过于函数和数组都通过 ()访问，后面扩充的Item类成员也使用 ()，导致语法上歧义丛生。但 VB 语言采取的`函数名=结果`返回结果的形式非常适合编写业务规则，本项目的动机主要也是为了实现一个友好实用的规则引擎。

VB 语言设计混乱之处极多，如 Select Case 支持数字 '1' 与 1 匹配，而 1 = '1' 则报类型不匹配等等，理念不贯通，缺乏闭包、类定义等特性。但对于一些沿用 VBA 较久的公司和客户，用于编写业务规则仍有较大潜力，适合非职业程序员编写一些公积金个税规则等片段。

目前已完成多年前编写的 VB 计算器，算是心愿达成了。如无其它原因不会继续往下推进。如对 VBA 编写业务规则认可和感兴趣，需要在自己的项目中使用可与本人联系。


