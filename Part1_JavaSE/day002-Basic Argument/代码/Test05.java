/*
�����ͣ� 

      1 byte = 8 bit;   2^8 -1 û�з��ŵķ�Χ  -128 ~ 127 
      byte    1    ����
	  short   2    ˮ��
	    
	  int     4    ��
	  long    8    ��
�����ͣ�
     float   4     ��ˮ��
	 double  8     ˮ��

�ַ��ͣ� 
     char    2    ��
	 

������������ת���� 
	1.�Զ�����������
	    С���������� �����Զ�ת��Ϊ�����������
		
	
	2.ǿ������ת����

*/

class Test05{

	public static void main(String[] args){
		byte b = 20;
		
		int i = b;
		
		System.out.println(i);
		
		float f = 3.24F;
		
		System.out.println(f);
		
		
		double d = f;
		
		System.out.println(d);
		
		
		    /* int l = f;
		
			System.out.println(l);
			*/
			
			double i1 = 20*3.14;
		System.out.println(i1);
		
		
		char c1 = 'A';//2  65
		System.out.println("===>"+c1);
		int num = c1;//4
		System.out.println("===>"+num);
		
	
	}


}