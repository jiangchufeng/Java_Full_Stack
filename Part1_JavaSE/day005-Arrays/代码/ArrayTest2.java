/*
�����ݵ�����: ��doubleת����int���ܻ�����ʧ
              ��ͬ�������ݵġ����򡿼��ϡ�
			  
ע�⣺
	1.������Ԫ�ص�����Ҫ����һ��
	2.new int[���ܷ�����]{3,4,5,6};
	3.����Ԫ�صķ���  
		����ͨ���±����Ԫ��  �±�0 ��ʼ 0��Ӧ��һ��Ԫ��
	    
		�����ʵ��±겻����ʱ ����  ArrayIndexOutOfBoundsException �����±�Խ���쳣
	4.����ĳ��� length
	  arr.length  ����������Ԫ�ص�����
	5.�����±�ķ�Χ�� 0~ ���鳤��-1
	
*/

class ArrayTest2{

	public static void main(String [] args){
	
		//����ľ�̬��ʼ��
		
		
		int [] arr1 = new int[]{3,4,5,6,10,20,30};//���� �͸�ֵ�ǿ��Էֿ���
		
		System.out.println("arr1: "+arr1[0]);
		System.out.println("arr1: "+arr1.length);//7
		System.out.println("arr1: "+arr1[arr1.length-1]);
		
		int [] arr2;
		
		arr2 = new int[]{5,6,7};
	 // 	arr2 = {5,6,7}; ����
		//����Ķ�̬��ʼ��
		
		double [] arrDouble = new double[5];
		
		//����Ԫ�صķ���
					//0 1 2
		int [] arr = {1,2,3,56,90};//���ַ�ʽ �����͸�ֵ����ŵ�һ��
		
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		//java.lang.ArrayIndexOutOfBoundsException: 3
		//System.out.println(arr[3]);
		//length ����
		System.out.println("arr length:"+arr.length);
		
		
		
		
	
	
	}
}