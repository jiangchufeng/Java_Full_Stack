//数组统计：求总和、均值、统计偶数个数等


class ArrayTest12{

	public static void main(String [] args){
			//定义数组
			int arr[] = {10,20,30,2,5,6,8};
	
	
			//定义变量 记录总和
					
				int sum = 0;
			
			for(int ele:arr){
			
				sum+=ele;
			}
			
			
			System.out.println("总和是："+sum+"均值是："+sum/arr.length);
			
			System.out.println("-------------------------------------------------------");
			
			//定义变量 记录个数
			int count = 0;
			
			for(int i = 0;i<arr.length;i++){
				//获取数组内的每一个元素
				int num = arr[i];

				if(num %2==0){
				
					count++;
				
				}
			}
			System.out.println("偶数的个数是："+count);
			
			
	}
}