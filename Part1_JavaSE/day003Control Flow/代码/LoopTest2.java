/*
	��ʼ������
	
	while(ѭ������){
		
		ѭ����;
		
		��������;
	}

ע�⣺  

    i++ �� ++i û������
	
	
	���1~100�����е��� 
	
*/

class LoopTest2{

	public static void main(String [] args){
	
		//��ʼ������
		int  i =1;
		//ѭ������
		while(i<=100){
		    //ѭ����
			if(i%2==0){//�ܱ�2�������� ��ż��
			   System.out.println(i);
			}
			
			
			//��������
			//i++;
			
			++i;
		
		}
		
		
	    System.out.println("Game Over");
	
	}
}