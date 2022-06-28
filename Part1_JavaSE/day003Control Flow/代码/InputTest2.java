
/*
键盘输入一个地址
1.导包

2.创建对象

3.对象调方法


注意: 
    1.next（）无法接受 空格之后的内容 
	
	2.input.nextLine() 可以接受整行内容 包含空格
	
	3.input.nextLine() 接收到 回车 就会终止
	    在前面创建一行输入  接受回车 防止对下面的内容造成影响
		input.nextLine();
*/
import java.util.*;
class InputTest2{


	public static void main(String [] args){
		//2.创建对象
		Scanner input = new Scanner(System.in);
		
			System.out.println("您的身高是");
			
			double height = input.nextDouble();
			
			System.out.println("您的身高是"+height);
			
			//在前面创建一行输入  接受回车 防止对下面的内容造成影响
		    input.nextLine();
		//3.对象调方法
			System.out.println("您的地址是");
		//请您输入一个地址:address
		String address = input.nextLine();
		
		System.out.println("您的地址是："+address );
	
	
	
	}
}