package day02;

public class Test9 {

	public static void main(String[] args) {
		int year=(int)(Math.random()*2100);
		System.out.println("选取年份为："+year);
		//方式一：
		if(year%4==0 & year%100!=0 | year%400==0) {
			System.out.println(year+"是闰年");
		}else {
			System.out.println(year+"不是闰年");
		}
		//方式二：
		System.out.println("-----------------------");
		boolean result= year%4==0 && year%100!=0 || year%400==0;
		System.out.println(year+(result?"是闰年":"不是闰年"));
	}
}
