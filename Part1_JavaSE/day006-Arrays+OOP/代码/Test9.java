/*
for(����Ԫ������ ��ʶ����������){


}


*/

class Test9{

	public static void main(String [] args){
	
    	int [][] arr = {{10,20,30},{1,2000,3},{-100,200,300}};
		
		//�������ֵ����Сֵ
		int maxNum = arr[0][0];
		
		int minNum = arr[0][0];
		
		//����
		for(int[] e:arr){
		
			for(int ele:e){
				
		       //�Ƚ�
				if(ele > maxNum){
				
					maxNum = ele;
				}
				
				if(ele < minNum){
				
					minNum = ele;
				}

			}

		}

		//������
		
		System.out.println("���ֵ�ǣ�"+maxNum+"\n��Сֵ��:"+minNum);
		
		
		
		
		
		
	}
}