/*
1.语法格式
   初始化条件 只执行一次
   
   do{
	循环体；
	
	迭代条件；
   
   }while(循环条件); 最后执行
   
   
   输出1~10 
   
 注意：
      do{} while();
	  当初始化条件 不满足循环条件也会执行一次循环体
*/

class DohileTest1{

	public static void main(String [] args){
		//初始化条件
		int i = 100;
		
		do{
			//循环体
			System.out.println(i);//100
			//迭代条件
			i++;
		//循环条件
		}while(i<=10);
		
		
		System.out.println("Game Over!!!!");
	
	
	}
}