class Test8{

	public static void main(String [] args){
	
    	int [][] arr = {{10,20,30},{1,2000,3},{-100,200,300}};
		
		
		//�����һ��һά����ĵ�һ��Ԫ�������ֵ
		int maxNum = arr[0][0];//10
		//�����һ��һά����ĵ�һ��Ԫ������Сֵ
		int minNum = arr[0][0];
		
		for(int i = 0;i<arr.length;i++){// 0 1 2
			//����ÿһ��һά����
			
			for(int j = 0;j<arr[i].length;j++){
				//��������ֵ����  ˵�� ���������ֵ
				if(arr[i][j] >maxNum){
				
					maxNum = arr[i][j];
				
				}
				
				//���һ��������Сֵ��С �� ��������Сֵ
				
				if(arr[i][j]<minNum){
				
				   minNum = arr[i][j];
				
				}

			}

		}
		
		
		System.out.println("���ֵ�ǣ�"+maxNum+"��Сֵ�ǣ�"+minNum);
		
		
	
	}
}