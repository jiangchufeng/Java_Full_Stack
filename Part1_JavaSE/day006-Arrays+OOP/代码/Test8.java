class Test8{

	public static void main(String [] args){
	
    	int [][] arr = {{10,20,30},{1,2000,3},{-100,200,300}};
		
		
		//假设第一个一维数组的第一个元素是最大值
		int maxNum = arr[0][0];//10
		//假设第一个一维数组的第一个元素是最小值
		int minNum = arr[0][0];
		
		for(int i = 0;i<arr.length;i++){// 0 1 2
			//遍历每一个一维数组
			
			for(int j = 0;j<arr[i].length;j++){
				//如果比最大值还大  说明 此数是最大值
				if(arr[i][j] >maxNum){
				
					maxNum = arr[i][j];
				
				}
				
				//如果一个数比最小值还小 则 此数是最小值
				
				if(arr[i][j]<minNum){
				
				   minNum = arr[i][j];
				
				}

			}

		}
		
		
		System.out.println("最大值是："+maxNum+"最小值是："+minNum);
		
		
	
	}
}