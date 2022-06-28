/*
一。变量：在java运行过程中值可以改变的量 变量

二。变量的三要素：
   变量类型
   
   变量名
   
   变量值
三。如何声明变量

    数据类型 变量名。
	35: 错误: 可能尚未初始化变量b
              System.out.println(b);
			  
	3.1在方法内的变量 先赋值才能使用
	
	   先声明  再赋值
	
	     byte b ;
		//完成变量的初始化
		b = 20;
	
	
	
	
*/



class DataType3{

	public static void main(String [] args){
	
	   //1.声明一个整数类型的变量
	   
	    byte b ;
		//完成变量的初始化
		b = 20;
		
		long l;
		
		float f;
		
		double d;
		
		char c;
		
		String s;
		
		System.out.println(b);
		
		System.out.println("Hello World");
	
	
	}
	
}