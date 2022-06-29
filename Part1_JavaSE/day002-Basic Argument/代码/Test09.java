/*
+:  正号
 : 加号
 :字符串连接符
 
 
注意： 
    可以使用 小括号提高运算的等级
	



*/



class Test09{

	public static void main(String [] args){
		System.out.println(+3);
		System.out.println(-3);
		System.out.println(9+3);
		
		//声明字符串变量 
		String str = "hello";
		
		System.out.println(str+10+20);//hello1020
		
		System.out.println(10+20+str);//30hello
		
		System.out.println(str+(10+20));//hello30
		
		//获取一个四位数的个位，十位，百位，千位 数都是谁 求和
		
		int num = 5678;
		
		
		//除以1000拿到千位
		
		int qianWei = num / 1000;
		
		System.out.println("千位："+qianWei);//hello30
		// 除以100 取模10 
		int baiWei = num /100%10;
		//方式2 
		   baiWei = num%1000/100;
		   
		   System.out.println("百位："+baiWei);
		   
		 int shiWei = num%100/10;
		  System.out.println("十位："+shiWei);
		 int geWei = num % 10;
		 
		 System.out.println("个位："+geWei);
	
		
		
	
	}
}