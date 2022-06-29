/*
随机生成一个100以内的数，猜数字游戏

从键盘输入数，
如果大了提示，大了，
如果小了，提示小了，
如果对了，就不再猜了[结束循环]
并统计一共猜了多少次。

【66】  25  88  70 79 100 45

*/

class DoWhileTest4{

	public static void main(String [] args){
	
		//1.先去定义这样的随机数
		//(int)(Math.random()*(n-m+1)+m); 1~100
		int num = (int)(Math.random()*(100-1+1)+1);
		
		//2.创建键盘输入的对象
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//3.定义变量接收 一共猜了多少次
		int count = 0;
		//之前在{}内声明 (mineNum!=num) 无法使用   提升作用域
		int mineNum=0;
		
		//4.接收键盘输入的数 与 随机数 进行对比 此过程应该在循环内
		do{
			System.out.println("请输入您要猜的数");
			//接收键盘输入的数 mine:我的
			mineNum = in.nextInt();
			//4.1 各种对比
			
			if(mineNum> num){
				System.out.println(mineNum+" 猜大了");
			}else if(mineNum < num){
				System.out.println(mineNum+" 猜小了");
			
			}
			
			//每进入一次循环 意味着猜了一遍
			count++;
		
		}while(mineNum!=num);
		
		//5.输出结果
		System.out.println("幸运数字是"+num+"，您一共猜了"+count+"次");
		
	
	
	
	
	
	}

}