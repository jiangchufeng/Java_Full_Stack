/*
 ����һ���·� �ж�����·�������һ�����ڡ�
 
 ������ 3 4 5
 
 �ļ��� 6 7 8
 
 �＾�� 9 10 11
 
 ������ 12 1 2

 
 ����һ�����ڣ�
 ��ʾ�ü��ڵ��ص㣺
 
  ��������ů����
  
  �ļ�����������
  
  �＾�������ˬ
  
  ��������ѩ����
*/



class SwitchTest4{

	public static void main(String [] args){
	
		//1.������������Ķ���
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//2.��ȡ��������� ����:season
		System.out.println("������һ������");
		String season = in.next();
		
		
		//������� ���ղ�ͬ������
		
		String mess = "";//message ��Ϣ
		
		//3.�жϴ˼���
		
		switch(season){
		
			case "����":
			  mess = "��ů����";
				//System.out.println("��ů����");
				break;
			case "�＾":
				
				 mess = "�����ˬ";
				//System.out.println("�����ˬ");
				break;
			
			case "�ļ�":
			
				mess = "��������";
				//System.out.println("��������");
				break;
			
			case "����":
			    mess = "��ѩ����";
				//System.out.println("��ѩ����");
				break;
		
		
			default:
			 mess = "���ļ�����������";
			//	System.out.println("���ļ�����������");
				break;
		
		}
		
		//4.������
	
		System.out.println("������ļ�����:"+season +"���ص��ǣ�"+mess);
	
	
	
	}
}