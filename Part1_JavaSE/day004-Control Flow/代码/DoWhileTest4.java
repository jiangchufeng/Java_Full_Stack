/*
�������һ��100���ڵ�������������Ϸ

�Ӽ�����������
���������ʾ�����ˣ�
���С�ˣ���ʾС�ˣ�
������ˣ��Ͳ��ٲ���[����ѭ��]
��ͳ��һ�����˶��ٴΡ�

��66��  25  88  70 79 100 45

*/

class DoWhileTest4{

	public static void main(String [] args){
	
		//1.��ȥ���������������
		//(int)(Math.random()*(n-m+1)+m); 1~100
		int num = (int)(Math.random()*(100-1+1)+1);
		
		//2.������������Ķ���
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//3.����������� һ�����˶��ٴ�
		int count = 0;
		//֮ǰ��{}������ (mineNum!=num) �޷�ʹ��   ����������
		int mineNum=0;
		
		//4.���ռ���������� �� ����� ���жԱ� �˹���Ӧ����ѭ����
		do{
			System.out.println("��������Ҫ�µ���");
			//���ռ���������� mine:�ҵ�
			mineNum = in.nextInt();
			//4.1 ���ֶԱ�
			
			if(mineNum> num){
				System.out.println(mineNum+" �´���");
			}else if(mineNum < num){
				System.out.println(mineNum+" ��С��");
			
			}
			
			//ÿ����һ��ѭ�� ��ζ�Ų���һ��
			count++;
		
		}while(mineNum!=num);
		
		//5.������
		System.out.println("����������"+num+"����һ������"+count+"��");
		
	
	
	
	
	
	}

}