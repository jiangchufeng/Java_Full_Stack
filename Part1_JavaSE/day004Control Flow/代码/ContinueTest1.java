/*
continue: ����

        ��������ѭ�� ������һ��ѭ����

	�ܽ᣺
	    1.break �������� ѭ����switch��
		
		2.continueֻ������ѭ����
		
		3.��������̿�������� ���ܴ�����������   ��Ϊ�޷�����
*/




class ContinueTest1{
	public static void main(String [] args){
		
		for(int i = 1;i<=10;i++){
		
			if(i==6){
			
				continue;
				//System.out.println("Game Over!!!");
			}
			System.out.println(i);
		
		}
	
		System.out.println("Game Over!!!");
	
	}
}