/*
�����Ĭ�ϳ�ʼ����
	��������֮�� �������Ͳ�ͬ �����оͻ��в�ͬ����Ĭ��ֵ��
	byte 0
	short 0
	int 0
	long 0
	double 0.0
	float 0.0
	
	char '\u0000' ��
	
	boolean false
	
	
	������������ Ĭ��ֵ����null  String

*/

class ArrayTest3{

	public static void main(String [] args){
		int[] arr = new int[4];
		
		arr[0] = 10;
		
		arr[2]=66;
		
		System.out.println(arr[0]);
		
		System.out.println(arr[2]);
		
		
		
		System.out.println(arr[arr.length-1]);
		
		double [] d1 = new double[5];
		
		System.out.println(d1[2]);
	
		String [] str = new String[3];
		
		System.out.println(str[str.length-1]);
	}
}