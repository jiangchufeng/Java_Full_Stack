/*
for(数组元素类型 标识符：数组名){


}


*/

class Test9{

	public static void main(String [] args){
	
    	int [][] arr = {{10,20,30},{1,2000,3},{-100,200,300}};
		
		//假设最大值和最小值
		int maxNum = arr[0][0];
		
		int minNum = arr[0][0];
		
		//遍历
		for(int[] e:arr){
		
			for(int ele:e){
				
		       //比较
				if(ele > maxNum){
				
					maxNum = ele;
				}
				
				if(ele < minNum){
				
					minNum = ele;
				}

			}

		}

		//输出结果
		
		System.out.println("最大值是："+maxNum+"\n最小值是:"+minNum);
		
		
		
		
		
		
	}
}