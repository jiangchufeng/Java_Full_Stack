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
     char
�����ͣ�
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
*/


class Test03{

	public static void main(String []args){
		/*
		float ��double ���Ա�ʾС��
		ע�⣺ �����ݵ�����: ��doubleת����float���ܻ�����ʧ
		 �������� Ĭ������������ double 
		 
		*/

		float f = 3.14F;
		
		System.out.println(f);
		
		double height = 3.1415926;
		System.out.println(height);
		
		double d1 = 3.14E2;
		
		
		System.out.println(d1);
		
	
	}
}