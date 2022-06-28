class SortTest1{

	public static void main(String [] args){
		
		int [] arr = {70,60,50,40,30,20,10};
		
		System.out.println("排序前："+java.util.Arrays.toString(arr));
		
		//确定排序的次数
		for(int i = 0;i<arr.length;i++){
			// java.lang.ArrayIndexOutOfBoundsException: -1 的目的 防止出现此问题
			for(int j = 0;j<arr.length-1;j++){
			
				if(arr[j] >arr[j+1]){
					
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
				
				}			
			}

		}
		
		System.out.println("排序后："+java.util.Arrays.toString(arr));
		
	}
}