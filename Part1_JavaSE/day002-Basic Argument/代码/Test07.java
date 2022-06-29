/*
算数运算符
	+ - * / 
	% ： 取余数
	++ --
	
注意： 

  1.整数相除 不保留小数
  
  2.如果想要显示小数 使用浮点类型计算
  
  3. byte 与byte  short 与short 做运算 char 与char 
     或者 他们之间混合运算
     则结果会变为 int 类型

*/

class Test07{

	public static void main(String [] args){
	
		System.out.println(3*2);
		System.out.println(3-2);
		System.out.println(3+2);
		//小数默认数据类型是double
		System.out.println(3.0/2);
		
		
		byte b = 1;
		byte b1 = 2;
		// 不兼容的类型: 从int转换到byte可能会有损失
		//byte b3 = b*b1;
		//System.out.println(b3);
		
		char c1 = 'A';
		
		char c2 = 'B';
		// 不兼容的类型: 从int转换到char可能会有损失
	//	char c3 = c1 + c2;
		//System.out.println(c3);
		
	
	
	  System.out.println(10%3);//1
	  System.out.println(10%5);//0
		
	
	
	
	}

}