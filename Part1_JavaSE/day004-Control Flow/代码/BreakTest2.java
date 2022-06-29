/*
键盘录入n个整数

统计 一共有多少个正数 

    多少个负数
*/

class BreakTest2{
	public static void main(String [] args){
	// 键盘录入n个整数  统计 一共有多少个正数  多少个负数
		//创建Scanner对象
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//定义变量 记录正数的个数
		
		int zhengShu = 0;
		//定义变量 记录负数的个数
		
		int fuShu = 0;
		
		//有一个循环
		while(true){
			//不断地接收键盘录入的数
			
			System.out.println("请您输入一个数");
			int num = in.nextInt();
			
			//对输入的数进行校验 判断是正数 还是负数
			if(num > 0){
			//是正数 正数个数+1
				zhengShu++;
			}else if(num <0){
			//是负数 负数个数+1
			    fuShu++;
			}else {
			//当输入0的时候 终止循环
			break;
			}
		}
		//输出结果
		System.out.println("正数个数有："+zhengShu+"\n负数个数有："+fuShu);
	
	
	
	}
}