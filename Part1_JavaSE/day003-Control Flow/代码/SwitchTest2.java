/*
  90 ~ 100  A
  80 ~ 89   B
  70 ~ 79   C
  60 ~ 69   D
  <60       E
*/
class SwitchTest2{

	public static void main(String [] args){
	
		//������������Ķ���
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//���ռ�������ķ���  98  88 78 68  
		
		System.out.println("���������ķ���");
		int score = in.nextInt();
		
		//��ȡ10λ�ϵ�����
		//int num = score/10;
		
		
		// �ж�������һ���ȼ�
		
		switch(score/10){
		
			case 10:
				//System.out.println("A");
			//	break;
			case 9:
				System.out.println("A");
				break;
			case 8:
			    System.out.println("B");
				break;
			case 7:
			    System.out.println("C");
				break;
			case 6:
			    System.out.println("D");
				break;
			default:
				System.out.println("E");
				break;
		}
		
		
		
		//������
		
		System.out.println("Game Over");
	
	
	
	}
	
}