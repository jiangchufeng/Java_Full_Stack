/*
if 多分支


	if(表达式1){
		分支1
	
	}else if(表达式2){
		分支2
	}else if(表达式3){
		分支3
	}...[else]{
		当所有的分支都不满足时 执行else
	
	}

	多选一:
注意： java 表示 区间运算  -1 <=x < 3  错误的


（1）x>=3；    y = 2x + 1;
（2）-1<=x<3； y = 2x;
（3）x<-1；    y = 2x – 1;

*/

class IfMoreTest1{


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
			
			}else if(x >= -1 && x < 3){
			
			   y = 2 * x;
			
			}else{ // x<-1
			
			   y = 2 * x - 1;
			}
			
	
			System.out.println("y的值是："+ y);
	
	
	}

}