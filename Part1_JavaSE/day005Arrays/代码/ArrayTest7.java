class ArrayTest7{

	public static void main(String [] args){
	
	
		int [] arr = {10,20,30};
		
		for(int ele : arr){
		
			System.out.println("ele==>"+ele);
		}
		System.out.println("----------------------------------");
		
		int [] arr1 = arr;
		
		for(int e : arr1){
		
			System.out.println("e==>"+e);
		}
	
	
	}
}