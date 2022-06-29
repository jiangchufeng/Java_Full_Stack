
/*
求 3个数中的最大值

*/


class IfElseTest2{
	public static void main(String [] args){
	
		//定义变量
		int num1 = -100;
		
		int num2 = -20;
		
		int num3 = 30;
		
		//定义较大值
		int jiaoDaZhi = 0;
		
		//进行比较
		
		if(num1 > num2){
		
		      jiaoDaZhi = num1;
		
		}else{
		
			 jiaoDaZhi = num2;
		}
		
		//将较大值与最后的数值进行比较 
		
		if(jiaoDaZhi > num3){
		
		//输出结果
			System.out.println("最大值是："+jiaoDaZhi);
		}else{
		//输出结果
			System.out.println("最大值是："+num3);
		
		}
		
		
		
		
		
	
	
	
	
	}
	
}