/*
 ����һ���·� �жϴ�����ʲô����


*/

class SeasonTest{

	public static void main(String [] args){
	
		//1.������������Ķ���
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//2.���������¼�·�
		System.out.println("������һ���·�");
		
		int month = in.nextInt();
		
		//3.�жϴ������ĸ�����
		
		switch(month){// 12 1 2 ����    345  ����
		 case 12:
		 case 1:
		 case 2:
		    System.out.println("����");
			break;
		case 3:
		case 4:
		case 5:
			 System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			 System.out.println("����");
			 break;
			
		case 9:
		case 10:
		case 11:
			 System.out.println("����");
			 break;
		
		default:
		    System.out.println("�����·���������");
			 break;
		
		}
		
		
		//4.������
	
	
	}


}