/*
在数组不是极端情况下 不需要n-1次那么多排序

当没有前一个数大于后一个数的情况 则 可以认为数组已经有序

则 可以终止排序

*/


class SortTest3{

	public static void main(String [] args){
	     int [] arr = {10,20,30,70,60,50,40};
		
		System.out.println("排序前："+java.util.Arrays.toString(arr));
		
		for(int i = 0;i<arr.length-1;i++){
		 //假设此次排序已经有序
			boolean flag = true;
		
		// -i  可以专注于 无序的部分 不需要再拍有序的部分
			for(int j = 0;j<arr.length-1-i;j++){//70
				//当前一个数大于后一个数 俩数交换位置
				if(arr[j]>arr[j+1]){
					//位置交换
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					//一旦进入此分支 则断定 此数组无序 
					flag = false;
				}
			}
			
			if(flag==true){
				break;
			}
			System.out.println("排序中："+java.util.Arrays.toString(arr));

		}
		
		System.out.println("排序后："+java.util.Arrays.toString(arr));
	
	
	}
}