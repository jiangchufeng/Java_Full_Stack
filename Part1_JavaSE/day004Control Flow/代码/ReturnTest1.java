/*
return: ����
        ��������
		return �� ���е����� ��������ִ��

	�ܽ᣺
	    1.break �������� ѭ����switch��
		
		2.continueֻ������ѭ����
		
		3.��������̿�������� ���ܴ�����������   ��Ϊ�޷�����.
*/


class ReturnTest1{
	public static void main(String [] args){
	
		for(int i = 1;i<=10;i++){
		
			if(i==6){
			
				return;
				//System.out.println("Game Over!!!");
			}
			System.out.println(i);
		
		}
		
		System.out.println("Game Over!!!");
	
	
	
	}
}