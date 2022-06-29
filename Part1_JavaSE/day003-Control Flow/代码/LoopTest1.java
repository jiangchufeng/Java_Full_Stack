/*
循环：满足特定条件反复执行的代码。
任何一个【标准】的循环 都有4个条件 

  初始化条件
  
  循环条件
  
  循环体
  
  迭代条件
  
  循环的作用：解放双手 解决重复问题

*/

class LoopTest1{

	public static void main(String [] args){
	
		/*System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");*/
		
		//初始化条件
		int i = 1;
		
		//i<=10000 循环条件
		while(i<=10){
		
		    //循环体 写循环的意义
			System.out.println("Hello World "+i);
			
			//迭代条件
			i++;

		}
	
	
	
	}


}