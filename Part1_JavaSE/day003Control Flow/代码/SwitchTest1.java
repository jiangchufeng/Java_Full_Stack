/*
switch ����/���� ��֧

	switch(���ʽ){
	
		case ֵ:
		
			��֧����1;
			
			break;//���
		case ֵ��
		  ��֧����2;
		  break;
		
		........
		
		default:
			
			break;
	}

 ע�⣺ 
      1.default �����е�case ���������ʱ�� ִ��
	  
	  2.default �ǿ��п��޵�
	  
	  3.case ��ֵ�����ظ�
	  
	  4.break ��ֹ����֮��Ĵ�͸
	  
	  
	
*/

/*
���� 
   1   A
   2   B
   3   C
   4   D
   ������Ĳ��� 12 34 ʱ ���� �����������

   
  90 ~ 100  A
  80 ~ 89   B
  70 ~ 79   C
  60 ~ 69   D
  <60       E
*/

class SwitchTest1{

	public static void main(String [] args){
		
		//����Scanner ����
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("��������һ����");
		
		
		//���ռ��������ֵ
		int num = input.nextInt();
		
		//��ֵ����У��
		
		
		switch(num){
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
					
			default://Ĭ��
				System.out.println("����������������");
				break;
			
		}
		
		//������

	    System.out.println("Game Over");
	
	
	
	
	}


}