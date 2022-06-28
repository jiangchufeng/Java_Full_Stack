/*
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
     char    2    盆
	 

基本类型数据转换： 
	1.自动类型提升：
	    小的数据类型 可以自动转换为大的数据类型
		
	
	2.强制类型转换：
		将大的数据类型转为小的数据类型 需要 强制转换
	 
	 强制转换的公式
	   小的数据类型 标识符 = （小的数据类型）大的数据类型的值；
	
	 不兼容的类型: 从double转换到int可能会有损失
	 
	 
	注意：
	   1.浮点类型转为 整数类型 会 丢失小数

*/

class Test06{

	public static void main(String[] args){
			
			double d = 3.14;
			
			// 小的数据类型 标识符 = （小的数据类型）大的数据类型的值；
			//int i = d;
			
			int num = (int)d;
			
			System.out.println(num);// 3
			
			
			float f = 6.66F;// 转为byte 类型
			// 小的数据类型 标识符 = （小的数据类型）大的数据类型的值；
			
			byte b = (byte)f;
			
	        System.out.println(b);//6
			
			
			
			int i1 = 200;// 转为byte
			// 小的数据类型 标识符 = （小的数据类型）大的数据类型的值；
				
			byte b1 = (byte)i1;// -128 ~ 127
			
			System.out.println(b1);// -56
			
			
			int i3 = 97;
			
			// 小的数据类型 标识符 = （小的数据类型）大的数据类型的值；
			char cc = (char)i3;
			
			System.out.println(cc);// -56
			
	}
	
	
}