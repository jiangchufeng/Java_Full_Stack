/*
�����������

�﷨���� X?Y:Z;
  X����boolean���͵ı��ʽ
    �� XΪ true��ʱ�� 
    ִ��Y���ʽ
   	
	�� XΪ false��ʱ��
	ִ��Z���ʽ
 
 ע�⣺
    1.��Ҫע�� �������ʽ���﷨���� 
	
	2.Y �� Z���������ͱ��뱣��һ�� ���� ����
	        ����: �����ݵ�����: �������ʽ�е����ʹ���
                int rs = num1 > num2?num1:"num2��";
	
	  
*/




class Test12{

	public static void main(String [] args){
	
		int age = 8;
		
		//result ���
		String result =  age >= 18?"������":"δ����";
		
		
		System.out.println(result);
		
		// �Ƚ������Ĵ�С
		
		
		int num1 = 10;
		
		
		int num2 = 20;
		
		
		//int rs = num1 > num2?num1:"num2��";
	
//		System.out.println(rs);
		
		//�� �������е����ֵ
		
		
		
		int n1 = 10;
		
		int n2 = 200;
		
		int n3 = 30;
		
		//�ҵ�n1 ��n2�� �ϴ����
		//int n4 =  n1>n2?n1:n2;
		
		//�� �ϴ���� �� �����������жԱ� �ж� ������˭
		
		//int maxNum = n4 > n3?n4:n3;
		
		// �����⣺ 
		
		int maxNum = (n1>n2?n1:n2)>n3?(n1>n2?n1:n2):n3;
		
		System.out.println(maxNum);
		
		
	}
	
}