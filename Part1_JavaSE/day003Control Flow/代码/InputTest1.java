/*
Scanner: ���ռ���¼�������

ʹ��Scanner ��Ҫ 3����
 0.����  ������˵���Դ
    ע��λ�� ���������
	import �������˼

 1.��������
 
 2.���������
 
 
 ע�⣺ 
     1.��������ݱ���ͽ��յ�����ƥ�� ���� ����
	 Exception in thread "main" java.util.InputMismatchException
	 
	 
	 2.Scannerû���ṩ����char�������ݵķ���
	 
	   ���Բ��� �ַ���.charAt(0) 0 �����ַ����ڵ�һ���ַ�  1�ڶ��� ��������
		char cc = 	"���".charAt(1);
	     System.out.println(cc);//��

*/
//import java.util.*; //����java.util ���µ���Դ
class InputTest1{


	public static void main(String [] args){
	
		 char cc = 	"���".charAt(1);
		 
		 System.out.println(cc);
	
	
	
	
	
		//�������� input �����Զ���    input ��������ظ�ʹ��
		// int age = 10;
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		System.out.println("��������������");
		
		
		String name = input.next();//����
		
	    System.out.println("�����ǣ�"+name);
		
		char c1 = name.charAt(0);//��
		 System.out.println("�ַ��ǣ�"+c1);
		
		
		
		
		//����û������
		System.out.println("��������������");
		//����  ������
		int age = input.nextInt();
		
		System.out.println("�����ǣ�"+age);
		
		System.out.println("�������������");
		
		double height = input.nextDouble();
		System.out.println("����ǣ�"+height);
		
		
	
	
	
	
	}


}