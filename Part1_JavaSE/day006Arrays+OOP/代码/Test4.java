/*
初始化：
	静态初始化
		int [] arr = {1,2,3,4,5};
	  方式一： 数据类型[][] 标识符 = {{一维数组的元素},{一维数组的的元素},{一维数组的元素}};
	  
	  方式二： 数据类型[][] 标识符 = new 数据类型[][]{{一维数组的元素},{一维数组的元素}};
	
	动态初始化
		
		1.动态初始化方式一：
           数据类型[][] 标识符 = new 数据类型[容量1][容量2];
		   
		   容量1：代表此二维数组内 有多少一维数组
		   
		   容量2：带表一维数组内  有多少个元素
		   
		   生成一个等长的一维数组
		  
		2.动态初始化方式二：
		 数据类型[][] 标识符 = new 数据类型[容量1][];
		 
		 使用前 需要给每一个一维数组进行手动指定大小 
		 

*/


class Test4{

	public static void main(String [] args){
		int [][] arr = new int[5][6];
		//查找第一个一维数组的长度
		
		System.out.println(arr.length);
		
		System.out.println("--->"+arr[0].length);
		//获取第一个一维数组内第二个元素
		
		System.out.println("--->"+arr[0][1]);//0
		
		System.out.println("--->"+arr[1].length);
		System.out.println("--->"+arr[2].length);
		System.out.println("--->"+arr[3].length);
		System.out.println("--->"+arr[4].length);
		
		System.out.println("--------------------------------------------------");//0
		
		
		
		double [][] doubleArr = new double[3][];
		
		System.out.println(doubleArr.length);
		//静态初始化给第一个一维数组赋值
		doubleArr[0] = new double[]{3.14,6.28};
		
		//Exception in thread "main" java.lang.NullPointerException
		System.out.println(doubleArr[0][0]);
		
		//动态初始化 给第二个一维数组赋值
		doubleArr[1] = new double[5];
		System.out.println(doubleArr[1][2]);
		
		
		
	}
}