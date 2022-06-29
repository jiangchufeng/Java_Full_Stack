/*
 输入一个月份 判断这个月份属于哪一个季节。
 
 春季： 3 4 5
 
 夏季： 6 7 8
 
 秋季： 9 10 11
 
 冬季： 12 1 2

 
 输入一个季节：
 显示该季节的特点：
 
  春季：春暖花开
  
  夏季：烈日炎炎
  
  秋季：秋高气爽
  
  冬季：白雪皑皑
*/



class SwitchTest4{

	public static void main(String [] args){
	
		//1.创建键盘输入的对象
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//2.获取键盘输入的 季节:season
		System.out.println("请输入一个季节");
		String season = in.next();
		
		
		//定义变量 接收不同的内容
		
		String mess = "";//message 信息
		
		//3.判断此季节
		
		switch(season){
		
			case "春季":
			  mess = "春暖花开";
				//System.out.println("春暖花开");
				break;
			case "秋季":
				
				 mess = "秋高气爽";
				//System.out.println("秋高气爽");
				break;
			
			case "夏季":
			
				mess = "烈日炎炎";
				//System.out.println("烈日炎炎");
				break;
			
			case "冬季":
			    mess = "白雪皑皑";
				//System.out.println("白雪皑皑");
				break;
		
		
			default:
			 mess = "您的季节输入有误";
			//	System.out.println("您的季节输入有误");
				break;
		
		}
		
		//4.输出结果
	
		System.out.println("您输入的季节是:"+season +"，特点是："+mess);
	
	
	
	}
}