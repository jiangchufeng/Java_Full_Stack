/*
��� 1~100��ż��

1.���1~100�ڵ���

2.��������У�� �������Ҫ��� ��ż����
      2  4  6  8 10 
	  
	  %2 ����Ϊ0 
	  
	  1 3 5 7 9
    


*/


class WhileTest1{

	public static void main(String [] args){
	
		//1.��ʼ�� ��ʼ������ ��
		int  i = 1;
		
		while(i <= 100){//ѭ��������
			
			//ѭ�����
			/*if(i%2==0){// 1 2 3 4 5  6 7...100
			   System.out.println(i);
			}*/
			
			if(i%2!=0){
			  System.out.println(i);
			
			}
			
		
			
			//����������
			i++;
		
		}
	
	   System.out.println("Game Over!!!");
	
	}

}