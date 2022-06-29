/*
练习4：用数组存储一个星期的7个英文单词，然后从键盘输入星期的值[1-7]，输出对应的英文单词

Monday  Tuesday  Wednesday Thursday Friday Saturday  Sunday


*/


class ArrayTest11{

	public static void main(String [] args){
	
		//定义一个数组 存储7个英文单词
		String [] strArr ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		//创建键盘输入的对象
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("老铁 你想过周几");
		//输入星期的值[1-7]
		int num = input.nextInt();
		
		//展现结果
		
	    String result = strArr[num-1];
	
		System.out.println(num+"====>"+result);
		
		
	
	
	
	}
}