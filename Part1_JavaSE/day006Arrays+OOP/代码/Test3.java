/*
��ʼ����
	��̬��ʼ��
		int [] arr = {1,2,3,4,5};
	  ��ʽһ�� ��������[][] ��ʶ�� = {{һά�����Ԫ��},{һά����ĵ�Ԫ��},{һά�����Ԫ��}};
	  
	  ��ʽ���� ��������[][] ��ʶ�� = new ��������[][]{{һά�����Ԫ��},{һά�����Ԫ��}};
	
	��̬��ʼ��

	
	
ע�⣺ 
    1.��ά����ĳ��� ָ���� ������һά����ĸ���
	2.��ά�����Ԫ�� ���Ƕ�ά���� ����������
	  nά���� �洢��Ԫ�� �� n-1 ά����
	  
*/

class Test3{

	public static void main(String [] args){
	
		//��̬��ʼ�� ��ʽһ
		// �����ݵ�����: int�޷�ת��Ϊint[]
		// int [] a = {66,88};// a[0]
		int[][] arr = {{10,20},{30,40}};
		
		System.out.println(arr);//[[I@15db9742
		
		System.out.println(arr[0]);//[I@6d06d69c
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		System.out.println("===>"+arr.length);
	
		//��̬��ʼ����ʽ��
		
		double [][] doubleArr = new double[][]{{3.14,3.45},{6.78,9.78},{10.9}};
		
		// ��ȡdoubleArr���� ��2��һά�����еڶ���Ԫ��
		System.out.println(doubleArr[1][1]);
		System.out.println("====>"+doubleArr.length);
		
		
		
	
	
	
	}
}