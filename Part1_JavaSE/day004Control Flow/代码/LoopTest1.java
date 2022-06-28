/*
一般情况下如何选择循环：
	1.当循环次数固定的时候 for

	2.当循环次数不固定的时候 while

	3.当初始化条件不满足循环条件 也要执行一次循环体 do{}while(); 


*/

class LoopTest1{

	public static void main(String [] args){
	/*
	   没有初始化 【循环条件】 【迭代条件】
	   
		for(;;){
			System.out.println("Hello");
		}
	*/
	
	  int  i = 1;
	
	  while(i<10){
		  System.out.println(i+"  Hello");
		  i++;
	  
	  }
	  System.out.println("i的值是："+i);
	   System.out.println("------------------------------------------");
	   
		// 声明的初始化条件 只能在 循环内使用
	   for(int j = 1;j<=10;j++){
	   
		System.out.println(j+"  Hello");
	   
	   }
	  // System.out.println(j);//11
	
	}
}