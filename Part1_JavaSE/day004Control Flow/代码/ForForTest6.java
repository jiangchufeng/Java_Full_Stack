/*	 	       ���� 	����    �ո�
				h		s	 	k
--------*		1		1		8
-------* *		2		2		7
------* * *		3		3		6
-----* * * *	4		4		5	
----* * * * *	5		5		4
	ͨ��ͼ��֪��
			  s = h;
			  �� = ����1 + ����2��
			  9 =  h + k;
			  k = 9 - h;
			  
			    h		s		k	   
-----* * * *    1		4		5
------* * *		2		3		6
-------* *		3		2		7
--------*		4		1		8
	ͨͼ��֪��
	    �� = ����1 + ����2��
		5 = h + s;
		s = 5-h;
		
		h + 4 = k
		


*/


class ForForTest6{

	public static void main(String [] args){
	
		//�ϰ벿�� h = 1 �����һ�� ��������
		for(int h = 1;h<=5;h++){
			//��ӡ�ո�
			for(int k =1;k<=9-h;k++){
				System.out.print(" ");
			}
			//��ӡ����
			for(int s = 1;s<=h;s++){
				System.out.print("* ");
			}
			
			//���л���
			System.out.println();
		}
		//�°벿��
		
		for(int h = 1;h<=4;h++){
			//��ӡ�ո�
			for(int k = 1;k<=h+4;k++){
			  System.out.print(" ");
			}
			//��ӡ����
			for(int s = 1;s<=5-h;s++){
				System.out.print("* ");
			}
			//����
			System.out.println();
		
		}
		
	
 	}
}