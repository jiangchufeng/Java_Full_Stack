/*
�����������ݣ��������

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
     char   0~65535  2���ַ�
	    ʹ�õ����� ��ʾ char���͵�����
		
		char c = '��';
		
		0  48
		
		A  65
		
		a  97
		
�����ͣ� 1 bit
     boolean


ע�⣺
����
    0.�������� Ĭ�ϵ�����������int 
    1. ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
	
	   �����Ǹ���ֵ�� byte ���� short�ķ�Χ��  �� �����б仯
	   
	   ���� �� ����ֵ���� byte ���� short�ķ�Χ�� ��Ὣ��ֵ��Ϊint���ʹ���

	2. ����: ���������: 2222222222
	   
	   ����long������ֵ��ʱ�� Ҫ����ֵ��ĩβ+l/L
	   
	   ����ʹ�ô�д��L
	
�����ͣ� 
    1.	�������� Ĭ�ϵ����������� double
	2.  �����ݵ�����: ��doubleת����float���ܻ�����ʧ
	    
		����float���͵����� Ҫ����ֵ��ĩβ + f/F
		
		������ʹ�� F
		
	3.�������͵ײ���õ��ǿ�ѧ��������ʾ 
	   double d1 = 3.14e2;
	          d1 = 3.14E2;
			  
    4.С���ײ�洢��ʽ�� ������ͬ  ����λ ָ��λ  β��λ
	
	5. С�����ܾ�ȷ�ı�ʾһ��ֵ �����Ҫ��ȷ�ı�ʾһ��ֵ
	    �����ѧ�� bigdecimal
		
char 
    1.ֻ�ܴ洢һ���ַ�
	
	2.ת���ַ� \n ����
	
	3. ת���ַ� \t һ��tab���ľ���
	
	4.ת���ַ� һ�㶼�����ַ�����
	
	
boolean
   ���ҽ�������ֵ true / false 

	
*/


class Test04{

	public static void main(String []args){
	
		char c = '��';
		
		System.out.println(c);
		
		c = 'a';
		System.out.println(c);
		c = '��';
		System.out.println(c);
		
		char c1 = 65;//A
		
		System.out.println(c1);
	
		char c2  ='\u4f60';
	
		System.out.println(c2);
		
		//int ���� = 18;
		//System.out.println(����);
		
		String str = "���";
		
		System.out.println(str);
		
		
		boolean flag = true;
		System.out.println(flag);
		
		flag = false;
	   System.out.println(flag);
	
	}
}