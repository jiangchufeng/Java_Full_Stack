package day02;

public class Test3 {
	public static void main(String[] args) {
		char ch = 'J';
		ch = (char)(ch+32);
		System.out.println(ch);
		char ch2 = 'a';
		ch2 -= 32;
		System.out.println(ch2);
		double d3= 100.5;
		int i3=3;
		double sum3 = d3 + i3;
		System.out.println("sum3的值："+sum3);
		int temp = (int)sum3;
		System.out.println("sum3的整数部分的值为："+temp);
		double d4=4.0;
		int i4=435;
		int mul4=(int)(d4 * i4);
		System.out.println("mul4的整数部分值为："+mul4);
				
	
	}
}
