
/*
��һ������洢����6��ѧԱ�����䣬
�Ӽ������룬��������ʾ
*/

class ArrayTest9{

	public static void main(String [] args){
	
		//�������� �洢���� 
		int[] arr = new int[6];
		
		//������������Ķ���
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//��������и�ֵ
		
		for(int i = 0;i<arr.length;i++){
		
			System.out.println("��������ڸ�"+(i+1)+"ѧ��������");
		
			arr[i] = input.nextInt();
		}
		
		
		//������ʾ����
	
		for(int e:arr){
		
			System.out.println(e);
		}
	}
}