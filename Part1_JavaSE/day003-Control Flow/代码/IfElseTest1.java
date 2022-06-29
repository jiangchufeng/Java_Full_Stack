/*
if双分支：

	if(boolean表达式){
		分支内容一
	}else{
		分支内容分二
	}
	
	二选一。
	
   注意： 三目运算符可以用来代替简单的 if else
   

*/



class IfElseTest1{
	public static void main(String [] args){
	
		
		//创建对象
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		System.out.println("请输入您的年龄");
		//定义年龄
		int age = input.nextInt();
		//判断
		
		/*if(age >=18){
		
			System.out.println("成年了");
		
		}else{
		    System.out.println("没有成年");
		
		}*/
		
		String result = age>=18?"成年了":"没有成年";
		
		System.out.println("结果是："+result);
		
		System.out.println("Game Over");
	
	
	}
}