class IfMoreTest2{


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
			
			}else if(x >= -1){
			
			   y = 2 * x;
			
			}else{ // x<-1
			
			   y = 2 * x - 1;
			}
			
	
			System.out.println("y��ֵ�ǣ�"+ y);
	
	
	}

}