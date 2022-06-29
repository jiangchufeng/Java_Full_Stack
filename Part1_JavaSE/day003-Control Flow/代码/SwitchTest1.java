/*
switch 开关/道岔 分支

	switch(表达式){
	
		case 值:
		
			分支内容1;
			
			break;//打断
		case 值：
		  分支内容2;
		  break;
		
		........
		
		default:
			
			break;
	}

 注意： 
      1.default 当所有的case 都不满足的时候 执行
	  
	  2.default 是可有可无的
	  
	  3.case 的值不能重复
	  
	  4.break 防止语句块之间的穿透
	  
	  
	
*/

/*
需求： 
   1   A
   2   B
   3   C
   4   D
   当输入的不是 12 34 时 提醒 数字输入错误。

   
  90 ~ 100  A
  80 ~ 89   B
  70 ~ 79   C
  60 ~ 69   D
  <60       E
*/

class SwitchTest1{

	public static void main(String [] args){
		
		//创建Scanner 对象
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("请您输入一个数");
		
		
		//接收键盘输入的值
		int num = input.nextInt();
		
		//对值进行校验
		
		
		switch(num){
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
					
			default://默认
				System.out.println("您的数字输入有误");
				break;
			
		}
		
		//输出结果

	    System.out.println("Game Over");
	
	
	
	
	}


}