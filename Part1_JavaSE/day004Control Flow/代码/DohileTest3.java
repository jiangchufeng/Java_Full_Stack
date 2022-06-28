/*
随机数公式：
Math.random();
返回一个double值 [0.0,1.0);

1~100

22~33
n:较大的数
m:较小的数
[n,m]
(int)(Math.random()*(n-m+1)+m);


(int)(Math.random()*(33-22+1)+22);
*/

class DohileTest3{

	public static void main(String [] args){
	
		int i = 1;
		
		while(i<=100){
		
		//44 - 55
		//(int)(Math.random()*(55-44+1)+44);
		int num = (int)(Math.random()*(55-44+1)+44);
		
		System.out.println(num);
		
		
		i++;
		}
	
	}
}