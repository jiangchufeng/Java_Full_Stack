/*
��ֵ�������
  =
  +=
  -=
  *=
  /=
  %=
  
ע�⣺ 
    1.���ᷢ������ת��
	
	
*/

class Test10{

	public static void main(String [] args){
	
		int age = 10;
		
		int result = 6+4;
		
		System.out.println(age);
		
		System.out.println(result);
		
		 byte b = 2; // 
		 
		 byte b1 = 1; 
		 
		 System.out.println( b+b1);//-128
		// ��intת����byte���ܻ�����ʧ
		  //b = b+b1;
		 
		  b+=b1;// b = b+ b1;
		 System.out.println( b);
		 
		 int a1 = 2;
		 int a2 = 3;
		 
		 a1*=a2;// a1 = a1 * a2;
		 
		 System.out.println( a1);
		 
		  System.out.println( "==========================================");
		  
		  
		  a1  =10;
		  
		  a2 = 5;
		  
		  a1/=a2;// a1 = a1 / a2; 10 /5 = 2
		  System.out.println( a1);
		  
		  int num1 = 10;//����
		  
		  int num2 = 20;//���ڸ��
		  
		   System.out.println( "����ǰ��num1 = "+num1+",num2 ="+ num2);
		  
		  //����������λ��
		  
		 //�½�һ������ ���ڽ���ŵ���������  ���ڵ��ֿ���
		 int temp = num1;
		 
		 // ���ڵ��ֿ��� ���� ������������  �������ֿ���
	 	 num1 = num2;
		//�������ֿ��� ����������
		 num2 = temp;
		  
		 System.out.println( "������num1 = "+num1+",num2 ="+ num2);
		  /*

		  �� = ����1 + ����2��
		  
		  ����1  = �� - ����2;
		    
		  ����2 = �� -  ����1;
		  */
		   System.out.println( "==========================================");
		  num1 = 10;
		  
		  num2 = 20;
		   System.out.println( "����ǰ��num1 = "+num1+",num2 ="+ num2);
		   
		   num1 = num1 + num2;// 30
		   
		   num2 = num1 - num2;// 10
		   
		   num1 = num1 - num2;// 20
		  
		   System.out.println( "������num1 = "+num1+",num2 ="+ num2);
	
	}
	
}