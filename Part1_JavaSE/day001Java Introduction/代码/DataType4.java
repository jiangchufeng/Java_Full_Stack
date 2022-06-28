/*
一。变量：在java运行过程中值可以改变的量 变量

二。变量的三要素：
   变量类型
   
   变量名
   
   变量值
三。如何声明变量

    数据类型 变量名。
	35: 错误: 可能尚未初始化变量b
              System.out.println(b);
			  
	3.1在方法内的变量 先赋值才能使用
	
	   先声明  再赋值
	
	     byte b ;
		//完成变量的初始化
		b = 20;
    3.2 声明和赋值放到一起
	
	
	
	
	3.3变量的实质 就是申请内存
	
	
	3.4 对变量重写赋值时  前面一定不要加 数据类型
	
	    否则 相当于 重新声明一个新的变量 会 报错
	
	
	
*/


class DataType4{

	public static void main(String [] args){
		/*
		
		声明一个变量类型是int 名字是 age 
		
		= 20；
		
		将20这个值 赋给 变量 age;
		
		
		*/
		int age = 20;
		/*
		DataType4.java:49: 错误: 需要')'
                System.out.println("年龄是"age);
                                        ^
        DataType4.java:49: 错误: 非法的表达式开始
                System.out.println("年龄是"age);
		
		
		*/
		
		age = 18;
		
		System.out.println("年龄是"+age); // + 代表拼接
		
		
		boolean isJiGe = true;
		
		boolean isJiGe = false;
		
		System.out.println("是否及格"+isJiGe);
		
		
		double height = 1.71;
		
		System.out.println(height);
		
		
		
		
	
	
	}
}