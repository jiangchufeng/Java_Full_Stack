/*

				h	k	s
----*******		1	4	7
---*******		2	3	7
--*******		3	2	7
-*******		4	1	7
*******			5	0	7

��֪����������h 
 h + s = 5
     s = 5 - h;
	 
		*
	   * *
	  * * *
	 * * * *
	* * * * *
	
	 * * * * 
	  * * *
	   * *
	    *

*/

class ForForTest5{

	public static void main(String [] args){
	
		//һ�������� ���ѭ��ִ�����
		for(int h = 1;h<=5;h++){
		
			//��ӡ�ո�
			for(int k = 1;k<=5-h;k++){
			
				System.out.print(" ");
			}
			
			//��ӡ����
			for(int s = 1;s<=7;s++){
				System.out.print("*");
			
			}
			
			//����
			System.out.println();
		
		
		}
	
	
	
	
	}
}