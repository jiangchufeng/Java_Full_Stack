/*
��ʼ����
	��̬��ʼ��
		int [] arr = {1,2,3,4,5};
	  ��ʽһ�� ��������[][] ��ʶ�� = {{һά�����Ԫ��},{һά����ĵ�Ԫ��},{һά�����Ԫ��}};
	  
	  ��ʽ���� ��������[][] ��ʶ�� = new ��������[][]{{һά�����Ԫ��},{һά�����Ԫ��}};
	
	��̬��ʼ��
		
		1.��̬��ʼ����ʽһ��
           ��������[][] ��ʶ�� = new ��������[����1][����2];
		   
		   ����1������˶�ά������ �ж���һά����
		   
		   ����2������һά������  �ж��ٸ�Ԫ��
		   
		   ����һ���ȳ���һά����
		  
		2.��̬��ʼ����ʽ����
		 ��������[][] ��ʶ�� = new ��������[����1][];
		 
		 ʹ��ǰ ��Ҫ��ÿһ��һά��������ֶ�ָ����С 
		 

*/


class Test4{

	public static void main(String [] args){
		int [][] arr = new int[5][6];
		//���ҵ�һ��һά����ĳ���
		
		System.out.println(arr.length);
		
		System.out.println("--->"+arr[0].length);
		//��ȡ��һ��һά�����ڵڶ���Ԫ��
		
		System.out.println("--->"+arr[0][1]);//0
		
		System.out.println("--->"+arr[1].length);
		System.out.println("--->"+arr[2].length);
		System.out.println("--->"+arr[3].length);
		System.out.println("--->"+arr[4].length);
		
		System.out.println("--------------------------------------------------");//0
		
		
		
		double [][] doubleArr = new double[3][];
		
		System.out.println(doubleArr.length);
		//��̬��ʼ������һ��һά���鸳ֵ
		doubleArr[0] = new double[]{3.14,6.28};
		
		//Exception in thread "main" java.lang.NullPointerException
		System.out.println(doubleArr[0][0]);
		
		//��̬��ʼ�� ���ڶ���һά���鸳ֵ
		doubleArr[1] = new double[5];
		System.out.println(doubleArr[1][2]);
		
		
		
	}
}