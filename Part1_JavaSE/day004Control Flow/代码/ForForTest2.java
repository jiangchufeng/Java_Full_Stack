/*
嵌套循环： 把一个循环作为另一个循环的循环体。


注意：
    1.外层循环控制行数
	
	2.内层循环控制列数
	
	3.外层循环执行一次 内层循环执行一遍

*/

class ForForTest2{

	public static void main(String [] args){
	
		for(int i = 1;i<=2;i++){
			//打印星星
			for(int j = 1;j<=5;j++){
				System.out.print("*");
			}
			//换行
			System.out.println();
			
		
		}
	
	}
}