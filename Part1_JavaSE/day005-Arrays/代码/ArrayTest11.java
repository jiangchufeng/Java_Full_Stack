/*
��ϰ4��������洢һ�����ڵ�7��Ӣ�ĵ��ʣ�Ȼ��Ӽ����������ڵ�ֵ[1-7]�������Ӧ��Ӣ�ĵ���

Monday  Tuesday  Wednesday Thursday Friday Saturday  Sunday


*/


class ArrayTest11{

	public static void main(String [] args){
	
		//����һ������ �洢7��Ӣ�ĵ���
		String [] strArr ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		//������������Ķ���
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("���� ������ܼ�");
		//�������ڵ�ֵ[1-7]
		int num = input.nextInt();
		
		//չ�ֽ��
		
	    String result = strArr[num-1];
	
		System.out.println(num+"====>"+result);
		
		
	
	
	
	}
}