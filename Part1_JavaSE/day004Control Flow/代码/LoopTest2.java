class LoopTest2{

	public static void main(String [] args){
	
		java.util.Scanner in = new java.util.Scanner(System.in);
	
		while(true){
			System.out.println("1.���");
			System.out.println("2.ȡ��");
			System.out.println("3.��ʾ���");
			System.out.println("4.�˳�\n��ѡ��");
			
			int choose = in.nextInt();
			
			switch(choose){
			
			  case 1:
				System.out.println("������");
			  break;
			  
			  case 2:
			  System.out.println("����ȡ��");
			  break;
			  
			  case 3:
			  System.out.println("������ʾ���");
			  break;
			  case 4:
			     System.out.println("�˳�");
			  //break;
			    return;
			  default:
			  
			  System.out.println("�������벻����Ҫ��");
			 break;
			
			
			}
		
		
		
		
		
		}
	
	
	}
}