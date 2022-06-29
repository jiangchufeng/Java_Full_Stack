package day02;

public class Test8 {

	public static void main(String[] args) {
		int x,y,z;
		x=(int)(Math.random()*200);
		y=(int)(Math.random()*200);
		z=(int)(Math.random()*200);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);
		int max=x>y?x:y;
		max=max>z?max:z;
		System.out.println("其中最大值为："+max);
	}
}
