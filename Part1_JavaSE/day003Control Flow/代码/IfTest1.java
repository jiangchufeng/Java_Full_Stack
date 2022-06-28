/*
if分支：

	1. if单分支
	
	  if(boolean表达式){
	  
	     	分支内容；
	  }

	注意：

  	1.当 if分支结束后 会继续向下执行
	
	2.当只有一行分支内容可以没有大括号 
	  只对第一行语句有效
	  
	  建议大家不要省略括号
	 

*/

import java.util.*;
class IfTest1{


	public static void main(String [] args){
	
		//创建Scanenr对象 
	    Scanner in = new Scanner(System.in);
		
		//请输入您的年龄
		System.out.println("请输入您的年龄");

		int age = in.nextInt();
		
		//判断是否成年 
		
		if(age>=18)
			System.out.println("你已经没有童年了");
			System.out.println("111111111");
			System.out.println("111111111");
		
		
     	System.out.println("Game Over!!!");			
	
	}


}