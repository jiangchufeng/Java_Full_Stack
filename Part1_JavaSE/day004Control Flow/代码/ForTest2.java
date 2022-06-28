/*
1~100 能被5整除的数 都是谁

及其总和

1.列出1~100内的数

2.判断能否被5整除

3.求总和


*/



class ForTest2{

	public static void main(String [] args){
	
	
		//定义变量记录总和
		
		int sum = 0;
	//1.列出1~100内的数
		for(int i = 1;i<=100;i++){
		
		 //2.判断能否被5整除
		 if(i%5==0){
			System.out.println(i);
			sum+=i;// sum = sum + i;
		 }
		}
		System.out.println("总和是："+sum);
	
	
	
	}
}