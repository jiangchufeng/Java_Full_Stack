/*
不兼容的类型: 从double转换到int可能会有损失
              相同类型数据的【有序】集合。
			  
注意：
	1.数组内元素的类型要保持一致
	2.new int[不能放数字]{3,4,5,6};
	3.数组元素的访问  
		数组通过下标访问元素  下标0 开始 0对应第一个元素
	    
		当访问的下标不存在时 报错  ArrayIndexOutOfBoundsException 数组下标越界异常
	4.数组的长度 length
	  arr.length  代表数组内元素的数量
	5.数组下标的范围： 0~ 数组长度-1
	
*/

class ArrayTest2{

	public static void main(String [] args){
	
		//数组的静态初始化
		
		
		int [] arr1 = new int[]{3,4,5,6,10,20,30};//声明 和赋值是可以分开的
		
		System.out.println("arr1: "+arr1[0]);
		System.out.println("arr1: "+arr1.length);//7
		System.out.println("arr1: "+arr1[arr1.length-1]);
		
		int [] arr2;
		
		arr2 = new int[]{5,6,7};
	 // 	arr2 = {5,6,7}; 出错
		//数组的动态初始化
		
		double [] arrDouble = new double[5];
		
		//数组元素的访问
					//0 1 2
		int [] arr = {1,2,3,56,90};//此种方式 声明和赋值必须放到一起
		
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		//java.lang.ArrayIndexOutOfBoundsException: 3
		//System.out.println(arr[3]);
		//length 长度
		System.out.println("arr length:"+arr.length);
		
		
		
		
	
	
	}
}