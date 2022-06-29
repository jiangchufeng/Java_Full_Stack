/*
基本类型数据：四类八种

整数型： 

      1 byte = 8 bit;   2^8 -1 没有符号的范围  -128 ~ 127 
      byte    1    杯子
	  short   2    水壶
	  int     4    锅
	  long    8    缸
浮点型：
     float   4     洒水车
	 double  8     水库
字符型：
     char   0~65535  2个字符
	    使用单引号 表示 char类型的数据
		
		char c = '你';
		
		0  48
		
		A  65
		
		a  97
		
布尔型： 1 bit
     boolean


注意：
整型
    0.整数类型 默认的数据类型是int 
    1. 错误: 不兼容的类型: 从int转换到byte可能会有损失
	
	   当我们赋的值在 byte 或者 short的范围内  则 不会有变化
	   
	   但是 当 赋的值不在 byte 或者 short的范围内 则会将此值作为int类型处理

	2. 错误: 过大的整数: 2222222222
	   
	   声明long类型数值的时候 要在数值的末尾+l/L
	   
	   建议使用大写的L
	
浮点型： 
    1.	浮点类型 默认的数据类型是 double
	2.  不兼容的类型: 从double转换到float可能会有损失
	    
		声明float类型的数据 要在数值的末尾 + f/F
		
		建议大家使用 F
		
	3.浮点类型底层采用的是科学计数法表示 
	   double d1 = 3.14e2;
	          d1 = 3.14E2;
			  
    4.小数底层存储方式与 整数不同  符号位 指数位  尾数位
	
	5. 小数不能精确的表示一个值 如果想要精确的表示一个值
	    后面会学到 bigdecimal
		
char 
    1.只能存储一个字符
	
	2.转义字符 \n 换行
	
	3. 转义字符 \t 一个tab键的距离
	
	4.转义字符 一般都用在字符串内
	
	
boolean
   有且仅有两个值 true / false 

	
*/


class Test04{

	public static void main(String []args){
	
		char c = '你';
		
		System.out.println(c);
		
		c = 'a';
		System.out.println(c);
		c = 'の';
		System.out.println(c);
		
		char c1 = 65;//A
		
		System.out.println(c1);
	
		char c2  ='\u4f60';
	
		System.out.println(c2);
		
		//int 哈哈 = 18;
		//System.out.println(哈哈);
		
		String str = "李白";
		
		System.out.println(str);
		
		
		boolean flag = true;
		System.out.println(flag);
		
		flag = false;
	   System.out.println(flag);
	
	}
}