/*
求 数组中元素的最大值和最小值

 注意： 假设最大值时  要选择数组内的元素 防止 出逻辑错误

*/
class ArrayTest13{

	public static void main(String [] args){
	
		//创建数组 
		int [] arr = {10,20,30,-1,-2,-10,100,66};
		
		
		System.out.println(java.util.Arrays.toString(arr));
		
		//创建一个变量 记录最大值 
		int maxNum = arr[2];
		
		int minNum = arr[0];
		
		for(int e:arr){
		
			//System.out.println(e);
			//如果一个值比最大值还大 则说明他是最大值
			if(e>maxNum){
				maxNum = e;
			}
			
			
			//如果一个数比最小值还小 则说明他是最小值
			if(e<minNum){
				minNum = e;
			}
			
		}
		
		System.out.println("最大值是："+maxNum+",最小值是："+minNum);
		
	}
}