/*
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

class ForForTest4{

	public static void main(String [] args){
	
		for(int h = 1;h<=5;h++){
		
			//��ӡ����
			for(int s = 1;s<=6-h;s++){
			
				System.out.print("*");
			
			}
			
			
			//����
			
			System.out.println();
		
		
		}
	
	}
}