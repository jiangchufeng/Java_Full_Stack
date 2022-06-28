/*
  90 ~ 100  A
  80 ~ 89   B
  70 ~ 79   C
  60 ~ 69   D
  <60       E
*/
class SwitchTest2{

	public static void main(String [] args){
	
		//创建键盘输入的对象
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//接收键盘输入的分数  98  88 78 68  
		
		System.out.println("请输入您的分数");
		int score = in.nextInt();
		
		//获取10位上的数字
		//int num = score/10;
		
		
		// 判断属于哪一个等级
		
		switch(score/10){
		
			case 10:
				//System.out.println("A");
			//	break;
			case 9:
				System.out.println("A");
				break;
			case 8:
			    System.out.println("B");
				break;
			case 7:
			    System.out.println("C");
				break;
			case 6:
			    System.out.println("D");
				break;
			default:
				System.out.println("E");
				break;
		}
		
		
		
		//输出结果
		
		System.out.println("Game Over");
	
	
	
	}
	
}