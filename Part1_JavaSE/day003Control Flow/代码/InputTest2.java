
/*
��������һ����ַ
1.����

2.��������

3.���������


ע��: 
    1.next�����޷����� �ո�֮������� 
	
	2.input.nextLine() ���Խ����������� �����ո�
	
	3.input.nextLine() ���յ� �س� �ͻ���ֹ
	    ��ǰ�洴��һ������  ���ܻس� ��ֹ��������������Ӱ��
		input.nextLine();
*/
import java.util.*;
class InputTest2{


	public static void main(String [] args){
		//2.��������
		Scanner input = new Scanner(System.in);
		
			System.out.println("���������");
			
			double height = input.nextDouble();
			
			System.out.println("���������"+height);
			
			//��ǰ�洴��һ������  ���ܻس� ��ֹ��������������Ӱ��
		    input.nextLine();
		//3.���������
			System.out.println("���ĵ�ַ��");
		//��������һ����ַ:address
		String address = input.nextLine();
		
		System.out.println("���ĵ�ַ�ǣ�"+address );
	
	
	
	}
}