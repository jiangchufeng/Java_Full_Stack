/*
写第一个程序：
   0.显示文件的扩展名
   
   1.修改后缀名为.java
   
   3.java文件的内容
   
   
   3.1 class  类
   
       HelloWorld  类名
	   
    3.2 HelloWorld的后面有一对大括号{}
	    
		此对大括号 限定了 类的范围
		
    3.3 在类的内部 有一个方法
        公共的  静态的  空的  主要的 方法
		
		这个整体 主方法
		public static   void  main(String[] args){
		
		}
    3.4 (String[] args) 方法的形参
	
	3.5 小括号后的大括号 {
	    限定了方法的范围
	 }
	
	
	3.6 System.out.println("Hello World");
	
		System： 系统
		out: 外面
		print:打印
		ln：line 行
		(打印的内容)
		Hello World
		
		
运行第一个程序：
  1.写源代码HelloWorld.java
  
  2.编译 javac HelloWorld.java  
       
	    编译完成产生.class文件
  
  3.运行 的是字节码.class文件 
        java 文件名 
        没有后缀
    
问题1： 中文乱码  当前编辑器采用的是utf-8编码   dos窗口采用的GBK编码 
           HelloWorld.java:60: 错误: 编码GBK的不可映射字符
            //鎵撳嵃杈撳嚭涓?琛岃鍙? 鍙獺ello World
	
	    解决：将编辑器的编码方式 改为系统编码  
                          ^

*/


//类名是HelloWorld
class HelloWorld{

    //主方法  程序的入口  jvm调用
	public static void main(String[] args){
	
	    //打印输出一行语句 叫Hello World
		System.out.println("Hello World");

	
	}
	
}