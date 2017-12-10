package org.siphon.visualbasic.runtime;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.SourceLocation;

/*
 * 

 */
public class VbRuntimeException extends Exception {
	
	public final static int 没有返回的GoSub=3;

	public final static int 无效的过程调用=5;

	public final static int 溢出=6;

	public final static int 内存不足=7;

	public final static int 下标越界=9;

	public final static int 此数组为固定的或暂时锁定=10;

	public final static int 除以零=11;

	public final static int 类型不匹配=13;

	public final static int 字符串空间不足=14;

	public final static int 表达式太复杂=16;

	public final static int 不能完成所要求的操作=17;

	public final static int 发生用户中断=18;

	public final static int 没有恢复的错误=20;

	public final static int 堆栈空间不足=28;

	public final static int 没有定义子程序_函数_或属性=35;

	public final static int DLL应用程序的客户端过多=47;

	public final static int 装入DLL时发生错误=48;

	public final static int DLL调用规格错误=49;

	public final static int 内部错误=51;

	public final static int 错误的文件名或数目=52;

	public final static int 文件找不到=53;

	public final static int 错误的文件方式=54;

	public final static int 文件已打开=55;

	public final static int  IO设备错误=57;

	public final static int 文件已经存在=58;

	public final static int 记录的长度错误=59;

	public final static int 磁盘已满=61;

	public final static int 输入已超过文件结尾=62;

	public final static int 记录的个数错误=63;

	public final static int 文件过多=67;

	public final static int 设备不可用=68;

	public final static int 没有访问权限=70;

	public final static int 磁盘尚未就绪=71;

	public final static int 不能用其他磁盘机重命名=74;

	public final static int 路径_文件访问错误=75;

	public final static int 找不到路径=76;

	public final static int 尚未设置对象变量或With区块变量=91;

	public final static int For循环没有被初始化=92;

	public final static int 无效的模式字符串=93;

	public final static int Null的使用无效=94;

	public final static int 不能在对象上调用Friend过程_该对象不是定义类的实例=97;

	public final static int 系统DLL不能被加载=298;

	public final static int 在指定的文件中不能使用字符设备名=320;

	public final static int 无效的文件格式=321;

	public final static int 不能建立必要的临时文件=322;

	public final static int 源文件中有无效的格式=325;

	public final static int 未找到命名的数据值=327;

	public final static int 非法参数_不能写入数组=328;

	public final static int 不能访问系统注册表=335;

	public final static int ActiveX部件不能正确注册=336;

	public final static int 未找到ActiveX部件=337;

	public final static int ActiveX部件不能正确运行=338;
	
	public final static int 控件数组元素不存在=340;

	public final static int 对象已经加载=360;

	public final static int 不能加载或卸载该对象=361;

	public final static int 未找到指定的ActiveX控件=363;

	public final static int 对象未卸载=364;

	public final static int 在该上下文中不能卸载=365;

	public final static int 指定文件过时_该程序要求较新版本=368;

	public final static int 指定的对象不能用作供显示的所有者窗体=371;

	public final static int 属性值无效=380;

	public final static int 无效的属性数组索引=381;

	public final static int 属性设置不能在运行时完成=382;

	public final static int 属性设置不能用于只读属性=383;

	public final static int 需要属性数组索引=385;

	public final static int 属性设置不允许=387;

	public final static int 属性的取得不能在运行时完成 =393;

	public final static int 属性的取得不能用于只写属性=394;

	public final static int 窗体已经显示_不能显示为模式窗体=400;

	public final static int 代码必须先关闭顶端模式窗体=402;

	public final static int 允许使用否定的对象=419;

	public final static int 找不到属性=422;

	public final static int 找不到属性或方法=423;

	public final static int 要求对象=424;

	public final static int 无效的对象使用=425;

	public final static int ActiveX部件不能建立对象或返回对此对象的引用=429;

	public final static int 类不支持自动操作=430;

	public final static int 在自动操作期间找不到文件或类名=432;

	public final static int 对象不支持此属性或方法=438;

	public final static int 自动操作错误=440;

	public final static int 连接至型态程序库或对象程序库的远程处理已经丢失=442;

	public final static int 自动操作对象没有默认值=443;

	public final static int 对象不支持此动作=445;

	public final static int 对象不支持指定参数=446;

	public final static int 对象不支持当前的位置设置=447;

	public final static int 找不到指定参数=448;

	public final static int 参数无选择性或无效的属性设置=449;

	public final static int 参数的个数错误或无效的属性设置=450;

	public final static int 对象不是集合对象=451;

	public final static int 序数无效=452;

	public final static int 找不到指定的DLL函数=453;

	public final static int 找不到源代码=454;

	public final static int 代码源锁定错误=455;

	public final static int 此键已经与集合对象中的某元素相关=457;

	public final static int 变量使用的型态是VisualBasic不支持的=458;

	public final static int 此部件不支持事件=459;

	public final static int 剪贴板格式无效 =460;

	public final static int 未找到方法或数据成员 =461;
	public final static int 远程服务器机器不存在或不可用=462;

	public final static int 类未在本地机器上注册=463;

	public final static int 不能创建AutoRedraw图象=480;

	public final static int 图片无效=481;

	public final static int 打印机错误=482;

	public final static int 打印驱动不支持指定的属性=483;

	public final static int 从系统得到打印机信息时出错_确保正确设置了打印机=484;

	public final static int 无效的图片类型=485;

	public final static int 不能用这种类型的打印机打印窗体图象=486;

	public final static int 不能清空剪贴板=520;

	public final static int 不能打开剪贴板=521;

	public final static int 不能将文件保存至TEMP目录=735;

	public final static int 找不到要搜寻的文本=744;

	public final static int 取代数据过长=746;

	public final static int 内存溢出=31001;

	public final static int 无对象=31004;

	public final static int 未设置类=31018;

	public final static int 不能激活对象=31027;

	public final static int 不能创建内嵌对象=31032;

	public final static int 存储到文件时出错=31036;

	public final static int 从文件读出时出错=31037;
	
	public final static int 无匹配规则=34000;
	
	private final static Map<Integer, String> messages = new HashMap<>();

	
	
	static{
		messages.put(3, "没有返回的GoSub");
		
		
		messages.put(5, "无效的过程调用");
		
		
		messages.put(6, "溢出");
		
		
		messages.put(7, "内存不足");
		
		
		messages.put(9, "下标越界");
		
		
		messages.put(10, "此数组为固定的或暂时锁定");
		
		
		messages.put(11, "除以零");
		
		
		messages.put(13, "类型不匹配");
		
		
		messages.put(14, "字符串空间不足");
		
		
		messages.put(16, "表达式太复杂");
		
		
		messages.put(17, "不能完成所要求的操作");
		
		
		messages.put(18, "发生用户中断");
		
		
		messages.put(20, "没有恢复的错误");
		
		
		messages.put(28, "堆栈空间不足");
		
		
		messages.put(35, "没有定义 子程序、函数，或属性");
		
		
		messages.put(47, "DLL 应用程序的客户端过多");
		
		
		messages.put(48, "装入 DLL 时发生错误");
		
		
		messages.put(49, "DLL 调用规格错误");
		
		
		messages.put(51, "内部错误");
		
		
		messages.put(52, "错误的文件名或数目");
		
		
		messages.put(53, "文件找不到");
		
		
		messages.put(54, "错误的文件方式");
		
		
		messages.put(55, "文件已打开");
		
		
		messages.put(57, " I/O 设备错误");
		
		
		messages.put(58, "文件已经存在");
		
		
		messages.put(59, "记录的长度错误");
		
		
		messages.put(61, "磁盘已满");
		
		
		messages.put(62, "输入已超过文件结尾");
		
		
		messages.put(63, "记录的个数错误");
		
		
		messages.put(67, "文件过多");
		
		
		messages.put(68, "设备不可用");
		
		
		messages.put(70, "没有访问权限");
		
		
		messages.put(71, "磁盘尚未就绪");
		
		
		messages.put(74, "不能用其他磁盘机重命名");
		
		
		messages.put(75, "路径/文件访问错误");
		
		
		messages.put(76, "找不到路径");
		
		
		messages.put(91, "尚未设置对象变量或 With 区块变量");
		
		
		messages.put(92, "For循环没有被初始化");
		
		
		messages.put(93, "无效的模式字符串");
		
		
		messages.put(94, "Null 的使用无效");
		
		
		messages.put(97, "不能在对象上调用 Friend 过程，该对象不是定义类的实例");
		
		
		messages.put(298, "系统 DLL 不能被加载");
		
		
		messages.put(320, "在指定的文件中不能使用字符设备名");
		
		
		messages.put(321, "无效的文件格式");
		
		
		messages.put(322, "不能建立必要的临时文件");
		
		
		messages.put(325, "源文件中有无效的格式");
		
		
		messages.put(327, "未找到命名的数据值");
		
		
		messages.put(328, "非法参数，不能写入数组");
		
		
		messages.put(335, "不能访问系统注册表");
		
		
		messages.put(336, "ActiveX 部件不能正确注册");
		
		
		messages.put(337, "未找到 ActiveX 部件");
		
		
		messages.put(338, "ActiveX 部件不能正确运行");
		
		
		messages.put(360, "对象已经加载");
		
		
		messages.put(361, "不能加载或卸载该对象");
		
		
		messages.put(363, "未找到指定的 ActiveX 控件");
		
		
		messages.put(364, "对象未卸载");
		
		
		messages.put(365, "在该上下文中不能卸载");
		
		
		messages.put(368, "指定文件过时。该程序要求较新版本");
		
		
		messages.put(371, "指定的对象不能用作供显示的所有者窗体");
		
		
		messages.put(380, "属性值无效");
		
		
		messages.put(381, "无效的属性数组索引");
		
		
		messages.put(382, "属性设置不能在运行时完成");
		
		
		messages.put(383, "属性设置不能用于只读属性");
		
		
		messages.put(385, "需要属性数组索引");
		
		
		messages.put(387, "属性设置不允许");
		
		
		messages.put(393, "属性的取得不能在运行时完成 ");
		
		
		messages.put(394, "属性的取得不能用于只写属性");
		
		
		messages.put(400, "窗体已经显示，不能显示为模式窗体");
		
		
		messages.put(402, "代码必须先关闭顶端模式窗体");
		
		
		messages.put(419, "允许使用否定的对象");
		
		
		messages.put(422, "找不到属性");
		
		
		messages.put(423, "找不到属性或方法");
		
		
		messages.put(424, "需要对象");
		
		
		messages.put(425, "无效的对象使用");
		
		
		messages.put(429, "ActiveX 部件不能建立对象或返回对此对象的引用");
		
		
		messages.put(430, "类不支持自动操作");
		
		
		messages.put(432, "在自动操作期间找不到文件或类名");
		
		
		messages.put(438, "对象不支持此属性或方法");
		
		
		messages.put(440, "自动操作错误");
		
		
		messages.put(442, "连接至型态程序库或对象程序库的远程处理已经丢失");
		
		
		messages.put(443, "自动操作对象没有默认值");
		
		
		messages.put(445, "对象不支持此动作");
		
		
		messages.put(446, "对象不支持指定参数");
		
		
		messages.put(447, "对象不支持当前的位置设置");
		
		
		messages.put(448, "找不到指定参数");
		
		
		messages.put(449, "参数无选择性或无效的属性设置");
		
		
		messages.put(450, "参数的个数错误或无效的属性设置");
		
		
		messages.put(451, "对象不是集合对象");
		
		
		messages.put(452, "序数无效");
		
		
		messages.put(453, "找不到指定的 DLL 函数");
		
		
		messages.put(454, "找不到源代码");
		
		
		messages.put(455, "代码源锁定错误");
		
		
		messages.put(457, "此键已经与集合对象中的某元素相关");
		
		
		messages.put(458, "变量使用的型态是 Visual Basic 不支持的");
		
		
		messages.put(459, "此部件不支持事件");
		
		
		messages.put(460, "剪贴板格式无效 ");
		
		
		messages.put(461, "未找到方法或数据成员 ");
		
		messages.put(462, "远程服务器机器不存在或不可用");
		
		
		messages.put(463, "类未在本地机器上注册");
		
		
		messages.put(480, "不能创建 AutoRedraw 图象");
		
		
		messages.put(481, "图片无效");
		
		
		messages.put(482, "打印机错误");
		
		
		messages.put(483, "打印驱动不支持指定的属性");
		
		
		messages.put(484, "从系统得到打印机信息时出错。 确保正确设置了打印机");
		
		
		messages.put(485, "无效的图片类型");
		
		
		messages.put(486, "不能用这种类型的打印机打印窗体图象");
		
		
		messages.put(520, "不能清空剪贴板");
		
		
		messages.put(521, "不能打开剪贴板");
		
		
		messages.put(735, "不能将文件保存至 TEMP 目录");
		
		
		messages.put(744, "找不到要搜寻的文本");
		
		
		messages.put(746, "取代数据过长");
		
		
		messages.put(31001, "内存溢出");
		
		
		messages.put(31004, "无对象");
		
		
		messages.put(31018, "未设置类");
		
		
		messages.put(31027, "不能激活对象");
		
		
		messages.put(31032, "不能创建内嵌对象");
		
		
		messages.put(31036, "存储到文件时出错");
		
		
		messages.put(31037, "从文件读出时出错");

		messages.put(34000, "无匹配规则");
	}
	
	
	public final int code;
	private final SourceLocation sourceLocation;

	private boolean hasVbStackTrace;
	
	public VbRuntimeException(int code, SourceLocation sourceLocation){
		this(code, sourceLocation, null);
	}

	public VbRuntimeException(int code) {
		this(code, SourceLocation.ByInterpreter);
	}

	public VbRuntimeException(int code, SourceLocation sourceLocation, Exception cause) {
		super(StringUtils.defaultIfEmpty(messages.get(code), "unknown error " + code), cause);
		this.code = code;
		this.sourceLocation = sourceLocation;
	}
	
	public VbRuntimeException(int code, Exception cause) {
		this(code, SourceLocation.ByInterpreter, cause);
	}

	public SourceLocation getSourceLocation() {
		return sourceLocation;
	}

	public void setVbStackTrace(StackTraceElement[] stackTrace){
		StackTraceElement[] old = this.getStackTrace();
		StackTraceElement[] items = new StackTraceElement[old.length + stackTrace.length];
		for(int i=0; i<stackTrace.length; i++){
			items[i] = stackTrace[i];
		}
		for(int i =0; i<old.length ; i++){
			items[stackTrace.length + i] = old[i];
		}
		this.setStackTrace(items);
		this.hasVbStackTrace = true;
	}

	public boolean hasVbStackTrace() {
		return hasVbStackTrace;
	}

}
