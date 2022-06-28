/*
条件运算符：

语法规则： X?Y:Z;
  X：是boolean类型的表达式
    当 X为 true的时候 
    执行Y表达式
   	
	当 X为 false的时候
	执行Z表达式
 
 注意：
    1.需要注意 条件表达式的语法规则 
	
	2.Y 和 Z的数据类型必须保持一致 否则 报错
	        错误: 不兼容的类型: 条件表达式中的类型错误
                int rs = num1 > num2?num1:"num2大";
	
	  
*/




class Test12{

	public static void main(String [] args){
	
		int age = 8;
		
		//result 结果
		String result =  age >= 18?"成年了":"未成年";
		
		
		System.out.println(result);
		
		// 比较俩数的大小
		
		
		int num1 = 10;
		
		
		int num2 = 20;
		
		
		//int rs = num1 > num2?num1:"num2大";
	
//		System.out.println(rs);
		
		//求 三个数中的最大值
		
		
		
		int n1 = 10;
		
		int n2 = 200;
		
		int n3 = 30;
		
		//找到n1 和n2中 较大的数
		//int n4 =  n1>n2?n1:n2;
		
		//将 较大的数 与 第三个数进行对比 判断 最大的是谁
		
		//int maxNum = n4 > n3?n4:n3;
		
		// 附加题： 
		
		int maxNum = (n1>n2?n1:n2)>n3?(n1>n2?n1:n2):n3;
		
		System.out.println(maxNum);
		
		
	}
	
}