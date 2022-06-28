/*
赋值运算符：
  =
  +=
  -=
  *=
  /=
  %=
  
注意： 
    1.不会发生类型转换
	
	
*/

class Test10{

	public static void main(String [] args){
	
		int age = 10;
		
		int result = 6+4;
		
		System.out.println(age);
		
		System.out.println(result);
		
		 byte b = 2; // 
		 
		 byte b1 = 1; 
		 
		 System.out.println( b+b1);//-128
		// 从int转换到byte可能会有损失
		  //b = b+b1;
		 
		  b+=b1;// b = b+ b1;
		 System.out.println( b);
		 
		 int a1 = 2;
		 int a2 = 3;
		 
		 a1*=a2;// a1 = a1 * a2;
		 
		 System.out.println( a1);
		 
		  System.out.println( "==========================================");
		  
		  
		  a1  =10;
		  
		  a2 = 5;
		  
		  a1/=a2;// a1 = a1 / a2; 10 /5 = 2
		  System.out.println( a1);
		  
		  int num1 = 10;//孔融
		  
		  int num2 = 20;//孔融哥哥
		  
		   System.out.println( "交换前：num1 = "+num1+",num2 ="+ num2);
		  
		  //交换俩数的位置
		  
		 //新建一张桌子 孔融将梨放到了桌子上  孔融的手空了
		 int temp = num1;
		 
		 // 孔融的手空了 接收 他哥哥给他的梨  他哥哥的手空了
	 	 num1 = num2;
		//他哥哥的手空了 从桌上拿梨
		 num2 = temp;
		  
		 System.out.println( "交换后：num1 = "+num1+",num2 ="+ num2);
		  /*

		  和 = 加数1 + 加数2；
		  
		  加数1  = 和 - 加数2;
		    
		  加数2 = 和 -  加数1;
		  */
		   System.out.println( "==========================================");
		  num1 = 10;
		  
		  num2 = 20;
		   System.out.println( "交换前：num1 = "+num1+",num2 ="+ num2);
		   
		   num1 = num1 + num2;// 30
		   
		   num2 = num1 - num2;// 10
		   
		   num1 = num1 - num2;// 20
		  
		   System.out.println( "交换后：num1 = "+num1+",num2 ="+ num2);
	
	}
	
}