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

*/

class Test05{

	public static void main(String[] args){
		byte b = 20;
		
		int i = b;
		
		System.out.println(i);
		
		float f = 3.24F;
		
		System.out.println(f);
		
		
		double d = f;
		
		System.out.println(d);
		
		
		    /* int l = f;
		
			System.out.println(l);
			*/
			
			double i1 = 20*3.14;
		System.out.println(i1);
		
		
		char c1 = 'A';//2  65
		System.out.println("===>"+c1);
		int num = c1;//4
		System.out.println("===>"+num);
		
	
	}


}