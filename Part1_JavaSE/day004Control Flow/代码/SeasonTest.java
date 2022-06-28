/*
 输入一个月份 判断此月是什么季节


*/

class SeasonTest{

	public static void main(String [] args){
	
		//1.创建键盘输入的对象
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//2.定义变量记录月份
		System.out.println("请输入一个月份");
		
		int month = in.nextInt();
		
		//3.判断此月是哪个季节
		
		switch(month){// 12 1 2 冬天    345  春天
		 case 12:
		 case 1:
		 case 2:
		    System.out.println("冬天");
			break;
		case 3:
		case 4:
		case 5:
			 System.out.println("春天");
			break;
		case 6:
		case 7:
		case 8:
			 System.out.println("夏天");
			 break;
			
		case 9:
		case 10:
		case 11:
			 System.out.println("秋天");
			 break;
		
		default:
		    System.out.println("您的月份输入有误");
			 break;
		
		}
		
		
		//4.输出结果
	
	
	}


}