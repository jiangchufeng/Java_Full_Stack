/*
1~100 �ܱ�5�������� ����˭

�����ܺ�

1.�г�1~100�ڵ���

2.�ж��ܷ�5����

3.���ܺ�


*/



class ForTest2{

	public static void main(String [] args){
	
	
		//���������¼�ܺ�
		
		int sum = 0;
	//1.�г�1~100�ڵ���
		for(int i = 1;i<=100;i++){
		
		 //2.�ж��ܷ�5����
		 if(i%5==0){
			System.out.println(i);
			sum+=i;// sum = sum + i;
		 }
		}
		System.out.println("�ܺ��ǣ�"+sum);
	
	
	
	}
}