/*
  90 ~ 100  A
  80 ~ 89   B
  70 ~ 79   C
  60 ~ 69   D
  <60       E
  
  ��������һ������ �жϴ˷����ĵȼ�
  
  ����ͬ������ ���г�ȡ ���� ����(��ͬ)������
  
*/

class IfMoreTest3{


	public static void main(String [] args){
	
		//��������¼��Ķ���
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//����һ�� ����:score
		System.out.println("��������һ������");
		
		int score = input.nextInt();
		
		String str = "";
		
		//�Է�������У�� 
		
		if(score >=70 && score <=79){
		str = "C";
		//	System.out.println("A");
		}else if(score >=80 && score <=89){
		//	System.out.println("B");
		
		str = "B";
		}else if(score >=90 && score <=100){
		//	System.out.println("C");
		str = "A";
		}else if(score >=60 && score <=69){
			//System.out.println("D");
			str = "D";
		}else {// < 60
		    //System.out.println("E");
			str = "E";
		}
		
		//������
		
			System.out.println("���ķ����ǣ�"+score+"����Ӧ�ĵȼ��ǣ�"+str);
		
		 System.out.println("Game Over!!");
	
	
	}
	
}