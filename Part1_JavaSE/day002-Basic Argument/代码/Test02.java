/*
基本类型数据：四类八种

整数型： 

      1 byte = 8 bit;   2^8 -1 没有符号的范围  -128 ~ 127 
      byte    1    杯子
	  short   2    水壶
	  int     4    锅
	  long    8    缸
浮点型：
     float
	 double
字符型：
     char
布尔型：
     boolean


注意：

    0.整数类型 默认的数据类型是int 
    1. 错误: 不兼容的类型: 从int转换到byte可能会有损失
	
	   当我们赋的值在 byte 或者 short的范围内  则 不会有变化
	   
	   但是 当 赋的值不在 byte 或者 short的范围内 则会将此值作为int类型处理

	2. 错误: 过大的整数: 2222222222
	   
	   声明long类型数值的时候 要在数值的末尾+l/L
	   
	   建议使用大写的L
	
	
*/


class Test02{

	public static void main(String []args){
	
		byte b = 20;
		
		System.out.println(b);
		
		short s = 20;
		
		int i  =30;
		
		long l = 2222222222L;
		
		System.out.println(l);
		
	
		
		
	
	
	
	}


}