class IfMoreTest2{


	public static void main(String [] args){
	
			//创建对象
			java.util.Scanner input = new java.util.Scanner(System.in);
		
			System.out.println("请您输入一个整数");
	
		
			//定义变量 记录X的值
			int x = input.nextInt();
			
			//定义变量 记录结果
			int y = 0;
			
			if(x >=3){
			
				y = 2 * x + 1;
			
			}else if(x >= -1){
			
			   y = 2 * x;
			
			}else{ // x<-1
			
			   y = 2 * x - 1;
			}
			
	
			System.out.println("y的值是："+ y);
	
	
	}

}