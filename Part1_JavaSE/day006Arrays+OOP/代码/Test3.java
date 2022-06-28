/*
初始化：
	静态初始化
		int [] arr = {1,2,3,4,5};
	  方式一： 数据类型[][] 标识符 = {{一维数组的元素},{一维数组的的元素},{一维数组的元素}};
	  
	  方式二： 数据类型[][] 标识符 = new 数据类型[][]{{一维数组的元素},{一维数组的元素}};
	
	动态初始化

	
	
注意： 
    1.二维数组的长度 指的是 数组内一维数组的个数
	2.三维数组的元素 就是二维数组 。。。。。
	  n维数组 存储的元素 是 n-1 维数组
	  
*/

class Test3{

	public static void main(String [] args){
	
		//静态初始化 方式一
		// 不兼容的类型: int无法转换为int[]
		// int [] a = {66,88};// a[0]
		int[][] arr = {{10,20},{30,40}};
		
		System.out.println(arr);//[[I@15db9742
		
		System.out.println(arr[0]);//[I@6d06d69c
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		System.out.println("===>"+arr.length);
	
		//静态初始化方式二
		
		double [][] doubleArr = new double[][]{{3.14,3.45},{6.78,9.78},{10.9}};
		
		// 获取doubleArr数组 第2个一维数组中第二个元素
		System.out.println(doubleArr[1][1]);
		System.out.println("====>"+doubleArr.length);
		
		
		
	
	
	
	}
}