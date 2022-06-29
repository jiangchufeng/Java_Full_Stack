/*
输出 1~100内偶数

1.输出1~100内的数

2.对数进行校验 输出满足要求的 【偶数】
      2  4  6  8 10 
	  
	  %2 余数为0 
	  
	  1 3 5 7 9
    


*/


class WhileTest1{

	public static void main(String [] args){
	
		//1.起始点 初始化条件 ①
		int  i = 1;
		
		while(i <= 100){//循环条件②
			
			//循环体③
			/*if(i%2==0){// 1 2 3 4 5  6 7...100
			   System.out.println(i);
			}*/
			
			if(i%2!=0){
			  System.out.println(i);
			
			}
			
		
			
			//迭代条件④
			i++;
		
		}
	
	   System.out.println("Game Over!!!");
	
	}

}