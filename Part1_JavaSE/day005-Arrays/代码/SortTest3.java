/*
�����鲻�Ǽ�������� ����Ҫn-1����ô������

��û��ǰһ�������ں�һ��������� �� ������Ϊ�����Ѿ�����

�� ������ֹ����

*/


class SortTest3{

	public static void main(String [] args){
	     int [] arr = {10,20,30,70,60,50,40};
		
		System.out.println("����ǰ��"+java.util.Arrays.toString(arr));
		
		for(int i = 0;i<arr.length-1;i++){
		 //����˴������Ѿ�����
			boolean flag = true;
		
		// -i  ����רע�� ����Ĳ��� ����Ҫ��������Ĳ���
			for(int j = 0;j<arr.length-1-i;j++){//70
				//��ǰһ�������ں�һ���� ��������λ��
				if(arr[j]>arr[j+1]){
					//λ�ý���
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					//һ������˷�֧ ��϶� ���������� 
					flag = false;
				}
			}
			
			if(flag==true){
				break;
			}
			System.out.println("�����У�"+java.util.Arrays.toString(arr));

		}
		
		System.out.println("�����"+java.util.Arrays.toString(arr));
	
	
	}
}