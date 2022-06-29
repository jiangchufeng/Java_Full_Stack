/*
	初始化条件
	
	while(循环条件){
		
		循环体;
		
		迭代条件;
	}

注意：  

    i++ 和 ++i 没有区别
	
	
	输出1~100内所有的数 
	
*/

class LoopTest2{

	public static void main(String [] args){
	
		//初始化条件
		int  i =1;
		//循环条件
		while(i<=100){
		    //循环体
			if(i%2==0){//能被2整除的数 是偶数
			   System.out.println(i);
			}
			
			
			//迭代条件
			//i++;
			
			++i;
		
		}
		
		
	    System.out.println("Game Over");
	
	}
}