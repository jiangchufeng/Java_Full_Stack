/*
数组元素的遍历：

遍历：把数组内的元素 一个个的拿出来


遍历方式一：
    借助于下标 访问 [0,length-1]
	
	for(int i = 0;i<length;i++){
		
		arr[i];
	}
遍历方式二： 增强for循环

	for(数组的类型 标识符: 数组名){
	
			标识符： 数组内的元素
	}

*/

class ArrayTest4{

	public static void main(String [] args){
	
		//定义一个数组
		int[] arr = {10,30,50,70,100,200,800,99,1,2,3};
		
		
		for(int i = 0;i<arr.length;i++){
		
		   System.out.println(arr[i]);
		}
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		*/
		 System.out.println("---------------------------------------------");
		 /*
		 for(数组的类型 标识符: 数组名){
	
			标识符： 数组内的元素
	    }
		 
		 */
		 for(int ele :arr ){
		 
			System.out.println(ele);
		 
		 }
		 System.out.println("---------------------------------------------");
		 
		 String [] strArr = new String[]{"蔡旭坤","特朗普","肖战","郭德纲"};
		 
		 for(int i = 0;i< strArr.length;i++){// 0 ~ 4

			System.out.println(strArr[i]);
		 
		 }
		 System.out.println("---------------------------------------------");
		 
		 for(String e: strArr){
		 
			System.out.println(e);
		 }
		
		
		
	
	}
}