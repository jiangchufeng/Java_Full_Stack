/*
Scanner: 接收键盘录入的数据

使用Scanner 需要 3步：
 0.导包  导入别人的资源
    注意位置 在类的外面
	import 导入的意思

 1.创建对象
 
 2.对象调方法
 
 
 注意： 
     1.输入的数据必须和接收的类型匹配 否则 报错
	 Exception in thread "main" java.util.InputMismatchException
	 
	 
	 2.Scanner没有提供返回char类型数据的方法
	 
	   可以采用 字符串.charAt(0) 0 代表字符串内第一个字符  1第二个 。。。。
		char cc = 	"你好".charAt(1);
	     System.out.println(cc);//好

*/
//import java.util.*; //导入java.util 包下的资源
class InputTest1{


	public static void main(String [] args){
	
		 char cc = 	"你好".charAt(1);
		 
		 System.out.println(cc);
	
	
	
	
	
		//创建对象 input 可以自定义    input 对象可以重复使用
		// int age = 10;
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		System.out.println("请输入您的姓名");
		
		
		String name = input.next();//张三
		
	    System.out.println("姓名是："+name);
		
		char c1 = name.charAt(0);//张
		 System.out.println("字符是："+c1);
		
		
		
		
		//提高用户体验度
		System.out.println("请输入您的年龄");
		//对象  调方法
		int age = input.nextInt();
		
		System.out.println("年龄是："+age);
		
		System.out.println("请输入您的身高");
		
		double height = input.nextDouble();
		System.out.println("身高是："+height);
		
		
	
	
	
	
	}


}