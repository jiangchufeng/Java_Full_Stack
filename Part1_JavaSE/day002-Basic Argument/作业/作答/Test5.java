package day02;

public class Test5 {
	
	public static void main(String[] args) {
		
		int a=20,b=20;
		boolean bo;
		bo=(++a %3 ==0 )&&(a++ %7 ==0);
		System.out.println("bo的值："+bo);
		System.out.println("a的值："+a);
		System.out.println("----------------");
		boolean bo2;
		bo2=(b++ %3==0)&&(++b%7==0);
		System.out.println("bo2的值："+bo2);
		System.out.println("b的值："+b);
		
		
	}

}
