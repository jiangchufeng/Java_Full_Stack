/*
����¼��n������

ͳ�� һ���ж��ٸ����� 

    ���ٸ�����
*/

class BreakTest2{
	public static void main(String [] args){
	// ����¼��n������  ͳ�� һ���ж��ٸ�����  ���ٸ�����
		//����Scanner����
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//������� ��¼�����ĸ���
		
		int zhengShu = 0;
		//������� ��¼�����ĸ���
		
		int fuShu = 0;
		
		//��һ��ѭ��
		while(true){
			//���ϵؽ��ռ���¼�����
			
			System.out.println("��������һ����");
			int num = in.nextInt();
			
			//�������������У�� �ж������� ���Ǹ���
			if(num > 0){
			//������ ��������+1
				zhengShu++;
			}else if(num <0){
			//�Ǹ��� ��������+1
			    fuShu++;
			}else {
			//������0��ʱ�� ��ֹѭ��
			break;
			}
		}
		//������
		System.out.println("���������У�"+zhengShu+"\n���������У�"+fuShu);
	
	
	
	}
}