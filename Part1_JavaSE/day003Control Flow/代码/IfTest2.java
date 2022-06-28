/*

闰年： 四年一闰 
    
	2000 
	
	2004
	
	1996
	
满足闰年的标准：两者满足一个即可
  1.能被4整除不能被100整除
  
  2.能被400整除
		
余数为0就是整除 

*/
class IfTest2{
	public static void main(String [] args){
		//直接创建对象
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("请输入一个年份");
		
		int year  = input.nextInt();
		
		//1.能被4整除不能被100整除      能被400整除
		if(year %4==0 && year %100!=0 || year % 400 ==0){
		
			System.out.println(year+"是闰年");
		}
	
		System.out.println("GameOver!!!!");p
	}
}