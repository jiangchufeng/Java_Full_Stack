/*

练习3：用一个数组存储本组4个学员的姓名，从键盘输入，并遍历显示

练习4：用数组存储一个星期的7个英文单词，然后从键盘输入星期的值[1-7]，输出对应的英文单词

?        Monday  Tuesday  Wednesday Thursday Friday Saturday  Sunday
*/
class ArrayTest10{

	public static void main(String [] args){
	
		//声明数组 4个长度 字符串类型
		String [] strArr = new String[4];
		
		//从键盘输入  创建 键盘输入对象
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//向数组内存储姓名
		
		for(int i = 0;i<strArr.length;i++){
			//输入学生的姓名
			System.out.println("请您输入姓名");
			//接收键盘输入的姓名
			String name = in.next();
			//将姓名存到数组内
			strArr[i] = name;
			
		}
		
		//遍历输出
		for(String e:strArr){
		
			System.out.println(e);
		}
		
	
	
	}
	
}