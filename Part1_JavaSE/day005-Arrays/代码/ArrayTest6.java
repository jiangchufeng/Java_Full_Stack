/*
键盘录入5个学生的成绩

放到数组内

求总和以及平均分

最后 在显示每一个学生的成绩


注意： 数组想要使用 必须指明其长度
*/



class ArrayTest6{

	public static void main(String [] args){
		//创建键盘输入的对象
		java.util.Scanner in = new java.util.Scanner(System.in);
	
	
		//定义数组
		int[] arr = new int[5];
		
	
		
		for(int i = 0;i<arr.length;i++){
			//向数组内添加分数
			System.out.println("请输入第"+(i+1)+"个学生的分数");
			//获取输入的分数
			int score = in.nextInt();
			//把分数添加到数组内
			arr[i] = score;
		}
		
		
		
		//因为只需要获取分数数组元素 使用增强for
		
		//定义变量记录总和
		int sum = 0;
		
		for(int ele:arr){
		//求总和
		  sum = sum +ele;// sum+=ele;
		
		//遍历元素
		System.out.println("===>"+ele);
		
		}
		//输出结果
		
		System.out.println("总和是："+sum+",平均分是："+sum/arr.length);
		
		
		
		
	
	
	}
}