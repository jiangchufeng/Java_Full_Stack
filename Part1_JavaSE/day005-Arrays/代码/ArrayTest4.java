/*
����Ԫ�صı�����

�������������ڵ�Ԫ�� һ�������ó���


������ʽһ��
    �������±� ���� [0,length-1]
	
	for(int i = 0;i<length;i++){
		
		arr[i];
	}
������ʽ���� ��ǿforѭ��

	for(��������� ��ʶ��: ������){
	
			��ʶ���� �����ڵ�Ԫ��
	}

*/

class ArrayTest4{

	public static void main(String [] args){
	
		//����һ������
		int[] arr = {10,30,50,70,100,200,800,99,1,2,3};
		
		
		for(int i = 0;i<arr.length;i++){
		
		   System.out.println(arr[i]);
		}
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		*/
		 System.out.println("---------------------------------------------");
		 /*
		 for(��������� ��ʶ��: ������){
	
			��ʶ���� �����ڵ�Ԫ��
	    }
		 
		 */
		 for(int ele :arr ){
		 
			System.out.println(ele);
		 
		 }
		 System.out.println("---------------------------------------------");
		 
		 String [] strArr = new String[]{"������","������","Фս","���¸�"};
		 
		 for(int i = 0;i< strArr.length;i++){// 0 ~ 4

			System.out.println(strArr[i]);
		 
		 }
		 System.out.println("---------------------------------------------");
		 
		 for(String e: strArr){
		 
			System.out.println(e);
		 }
		
		
		
	
	}
}