/*
if ���֧


	if(���ʽ1){
		��֧1
	
	}else if(���ʽ2){
		��֧2
	}else if(���ʽ3){
		��֧3
	}...[else]{
		�����еķ�֧��������ʱ ִ��else
	
	}

	��ѡһ:
ע�⣺ java ��ʾ ��������  -1 <=x < 3  �����


��1��x>=3��    y = 2x + 1;
��2��-1<=x<3�� y = 2x;
��3��x<-1��    y = 2x �C 1;

*/

class IfMoreTest1{


	public static void main(String [] args){
	
			//��������
			java.util.Scanner input = new java.util.Scanner(System.in);
		
			System.out.println("��������һ������");
	
		
			//������� ��¼X��ֵ
			int x = input.nextInt();
			
			//������� ��¼���
			int y = 0;
			
			if(x >=3){
			
				y = 2 * x + 1;
			
			}else if(x >= -1 && x < 3){
			
			   y = 2 * x;
			
			}else{ // x<-1
			
			   y = 2 * x - 1;
			}
			
	
			System.out.println("y��ֵ�ǣ�"+ y);
	
	
	}

}