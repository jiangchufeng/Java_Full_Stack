/*
1. 当初始化条件不满足循环条件 不会执行循环体
       int i = 10;
		
		while(i<5){
		
			System.out.println(i);
			
			
			i++;
		
		}

2.当没有迭代条件的时候  会变为死循环（无限循环）


3.WhileTest2.java:36: 错误: 无法访问的语句
                System.out.println("Game Over");
				
	当代码上面有while（true）的时候 下面的代码会报错
	
	无法访问的语句

*/

class WhileTest2{

	public static void main(String [] args){
	
		int i = 1;
		
		while(true){
		
			System.out.println(i);
			
			
			//i++;
		
		}
		//System.out.println("Game Over");
	
	
	
	}
}