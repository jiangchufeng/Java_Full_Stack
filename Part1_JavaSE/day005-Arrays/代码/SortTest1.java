class SortTest1{

	public static void main(String [] args){
		
		int [] arr = {70,60,50,40,30,20,10};
		
		System.out.println("����ǰ��"+java.util.Arrays.toString(arr));
		
		//ȷ������Ĵ���
		for(int i = 0;i<arr.length;i++){
			// java.lang.ArrayIndexOutOfBoundsException: -1 ��Ŀ�� ��ֹ���ִ�����
			for(int j = 0;j<arr.length-1;j++){
			
				if(arr[j] >arr[j+1]){
					
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
				
				}			
			}

		}
		
		System.out.println("�����"+java.util.Arrays.toString(arr));
		
	}
}