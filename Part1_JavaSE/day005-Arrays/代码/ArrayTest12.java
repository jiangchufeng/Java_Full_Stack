//����ͳ�ƣ����ܺ͡���ֵ��ͳ��ż��������


class ArrayTest12{

	public static void main(String [] args){
			//��������
			int arr[] = {10,20,30,2,5,6,8};
	
	
			//������� ��¼�ܺ�
					
				int sum = 0;
			
			for(int ele:arr){
			
				sum+=ele;
			}
			
			
			System.out.println("�ܺ��ǣ�"+sum+"��ֵ�ǣ�"+sum/arr.length);
			
			System.out.println("-------------------------------------------------------");
			
			//������� ��¼����
			int count = 0;
			
			for(int i = 0;i<arr.length;i++){
				//��ȡ�����ڵ�ÿһ��Ԫ��
				int num = arr[i];

				if(num %2==0){
				
					count++;
				
				}
			}
			System.out.println("ż���ĸ����ǣ�"+count);
			
			
	}
}