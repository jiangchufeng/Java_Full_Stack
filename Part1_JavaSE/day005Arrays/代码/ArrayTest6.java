/*
����¼��5��ѧ���ĳɼ�

�ŵ�������

���ܺ��Լ�ƽ����

��� ����ʾÿһ��ѧ���ĳɼ�


ע�⣺ ������Ҫʹ�� ����ָ���䳤��
*/



class ArrayTest6{

	public static void main(String [] args){
		//������������Ķ���
		java.util.Scanner in = new java.util.Scanner(System.in);
	
	
		//��������
		int[] arr = new int[5];
		
	
		
		for(int i = 0;i<arr.length;i++){
			//����������ӷ���
			System.out.println("�������"+(i+1)+"��ѧ���ķ���");
			//��ȡ����ķ���
			int score = in.nextInt();
			//�ѷ�����ӵ�������
			arr[i] = score;
		}
		
		
		
		//��Ϊֻ��Ҫ��ȡ��������Ԫ�� ʹ����ǿfor
		
		//���������¼�ܺ�
		int sum = 0;
		
		for(int ele:arr){
		//���ܺ�
		  sum = sum +ele;// sum+=ele;
		
		//����Ԫ��
		System.out.println("===>"+ele);
		
		}
		//������
		
		System.out.println("�ܺ��ǣ�"+sum+",ƽ�����ǣ�"+sum/arr.length);
		
		
		
		
	
	
	}
}