/*

��ϰ3����һ������洢����4��ѧԱ���������Ӽ������룬��������ʾ

��ϰ4��������洢һ�����ڵ�7��Ӣ�ĵ��ʣ�Ȼ��Ӽ����������ڵ�ֵ[1-7]�������Ӧ��Ӣ�ĵ���

?        Monday  Tuesday  Wednesday Thursday Friday Saturday  Sunday
*/
class ArrayTest10{

	public static void main(String [] args){
	
		//�������� 4������ �ַ�������
		String [] strArr = new String[4];
		
		//�Ӽ�������  ���� �����������
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//�������ڴ洢����
		
		for(int i = 0;i<strArr.length;i++){
			//����ѧ��������
			System.out.println("������������");
			//���ռ������������
			String name = in.next();
			//�������浽������
			strArr[i] = name;
			
		}
		
		//�������
		for(String e:strArr){
		
			System.out.println(e);
		}
		
	
	
	}
	
}