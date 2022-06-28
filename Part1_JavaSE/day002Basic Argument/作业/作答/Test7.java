package day02;

public class Test7 {

	public static void main(String[] args) {
		int week = 2;
		week += 100;
		int temp = week % 7;
		//方式一：
		if(temp == 0) {
			System.out.println("今天是周2,100天后是周日");
		}
		System.out.println("今天是周2,100天后是周"+(temp));
		//方式二：
		System.out.println("------------------");
		System.out.println("今天是周2,100天后是周"+(temp==0?"日":temp));
	}
}
