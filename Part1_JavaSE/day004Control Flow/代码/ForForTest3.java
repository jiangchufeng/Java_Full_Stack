/*
			h		s
*			1		1
**			2		2
***			3		3
****		4		4
*****		5		5

			h		s
*****   	1		5
****		2		4
***			3		3
**			4		2
*			5		1

 �� = ����1 + ����2��
 �� = h + s;
 
 s = �� - h;


*/

class ForForTest3{

	public static void main(String [] args){
	
		//��Ϊ���������� �����ж� ���ѭ��ִ��5��
		for(int h = 1;h<=5;h++){
		
			//��ӡ����
			for(int s = 1;s<=h;s++){
			
				System.out.print("*");
			}
			
			//����
		      System.out.println();
		
		}
		
		
	
	
	
	}
}