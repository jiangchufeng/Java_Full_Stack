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
     char
布尔型：
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
*/


class Test03{

	public static void main(String []args){
		/*
		float 和double 可以表示小数
		注意： 不兼容的类型: 从double转换到float可能会有损失
		 浮点类型 默认数据类型是 double 
		 
		*/

		float f = 3.14F;
		
		System.out.println(f);
		
		double height = 3.1415926;
		System.out.println(height);
		
		double d1 = 3.14E2;
		
		
		System.out.println(d1);
		
	
	}
}