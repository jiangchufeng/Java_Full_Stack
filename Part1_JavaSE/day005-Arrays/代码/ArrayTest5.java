class ArrayTest5{

	public static void main(String [] args){
	
		 String [] strArr = new String[]{"������","������","Фս","���¸�"};
		 //[Ljava.lang.String;@15db9742
		 System.out.println(strArr);
		 
		 int[] arr = {1,2,3};
	/*
	[I@6d06d69c
	
	[:����һά����
	I:int����
	@��
	6d06d69c����ֵַ ��������hash��16���Ƶ�����
	
	
	*/
	     System.out.println(arr);//[I@6d06d69c
		 
		 //[D@7852e922
		 double [] d = {1.2,3.4};
		 System.out.println(d);
		 System.out.println(d.hashCode());
		 
	
	}
}