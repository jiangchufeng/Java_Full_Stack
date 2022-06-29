/*
 1              0

 2 2  			1

 3 3 3			2

 4 4 4 4		3	

 5 5 5 5 5		4

*/
class Test11{

	public static void main(String [] args){
	
		//定义一个长度为5的二维数组
		
		int[][] arr = new int[5][];
		
		//
	/*	arr[0] = new int[1];
		
		arr[1] = new int[2];
		
		arr[2] = new int[3];
		
		arr[3] = new int[4];
		
		arr[4] = new int[5];
		*/
		
		//给每一个一维数组 开辟空间
		for(int i = 0;i<arr.length;i++){
			arr[i] = new int[i+1];
		}
		
		
		//给每一个0进行赋值
		
		for(int i = 0;i<arr.length;i++){
			 
			for(int j = 0;j<arr[i].length;j++){
			
			
				arr[i][j]=i+1;
			
			}
		
		
		
		}
		
		
		
		
		
		//展现数据
		for(int[] e:arr){
		
			for(int ele:e){
			
				System.out.print(ele+"\t");
			}
			
			System.out.println();
		
		}
		
	
	
	}
}