/*
�� ������Ԫ�ص����ֵ����Сֵ

 ע�⣺ �������ֵʱ  Ҫѡ�������ڵ�Ԫ�� ��ֹ ���߼�����

*/
class ArrayTest13{

	public static void main(String [] args){
	
		//�������� 
		int [] arr = {10,20,30,-1,-2,-10,100,66};
		
		
		System.out.println(java.util.Arrays.toString(arr));
		
		//����һ������ ��¼���ֵ 
		int maxNum = arr[2];
		
		int minNum = arr[0];
		
		for(int e:arr){
		
			//System.out.println(e);
			//���һ��ֵ�����ֵ���� ��˵���������ֵ
			if(e>maxNum){
				maxNum = e;
			}
			
			
			//���һ��������Сֵ��С ��˵��������Сֵ
			if(e<minNum){
				minNum = e;
			}
			
		}
		
		System.out.println("���ֵ�ǣ�"+maxNum+",��Сֵ�ǣ�"+minNum);
		
	}
}