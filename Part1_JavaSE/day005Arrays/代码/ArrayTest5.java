class ArrayTest5{

	public static void main(String [] args){
	
		 String [] strArr = new String[]{"蔡旭坤","特朗普","肖战","郭德纲"};
		 //[Ljava.lang.String;@15db9742
		 System.out.println(strArr);
		 
		 int[] arr = {1,2,3};
	/*
	[I@6d06d69c
	
	[:代表一维数组
	I:int类型
	@：
	6d06d69c：地址值 数组对象的hash码16进制的体现
	
	
	*/
	     System.out.println(arr);//[I@6d06d69c
		 
		 //[D@7852e922
		 double [] d = {1.2,3.4};
		 System.out.println(d);
		 System.out.println(d.hashCode());
		 
	
	}
}