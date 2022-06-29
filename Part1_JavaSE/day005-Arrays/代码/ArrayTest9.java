
/*
用一个数组存储本组6个学员的年龄，
从键盘输入，并遍历显示
*/

class ArrayTest9{

	public static void main(String [] args){
	
		//定义数组 存储年龄 
		int[] arr = new int[6];
		
		//创建键盘输入的对象
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//对数组进行赋值
		
		for(int i = 0;i<arr.length;i++){
		
			System.out.println("请您输入第个"+(i+1)+"学生的年龄");
		
			arr[i] = input.nextInt();
		}
		
		
		//遍历显示年龄
	
		for(int e:arr){
		
			System.out.println(e);
		}
	}
}