/*
if˫��֧��

	if(boolean���ʽ){
		��֧����һ
	}else{
		��֧���ݷֶ�
	}
	
	��ѡһ��
	
   ע�⣺ ��Ŀ�����������������򵥵� if else
   

*/



class IfElseTest1{
	public static void main(String [] args){
	
		
		//��������
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		System.out.println("��������������");
		//��������
		int age = input.nextInt();
		//�ж�
		
		/*if(age >=18){
		
			System.out.println("������");
		
		}else{
		    System.out.println("û�г���");
		
		}*/
		
		String result = age>=18?"������":"û�г���";
		
		System.out.println("����ǣ�"+result);
		
		System.out.println("Game Over");
	
	
	}
}