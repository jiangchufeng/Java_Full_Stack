class LoopTest2{

	public static void main(String [] args){
	
		java.util.Scanner in = new java.util.Scanner(System.in);
	
		while(true){
			System.out.println("1.存款");
			System.out.println("2.取款");
			System.out.println("3.显示余额");
			System.out.println("4.退出\n请选择：");
			
			int choose = in.nextInt();
			
			switch(choose){
			
			  case 1:
				System.out.println("进入存款");
			  break;
			  
			  case 2:
			  System.out.println("进入取款");
			  break;
			  
			  case 3:
			  System.out.println("进入显示余额");
			  break;
			  case 4:
			     System.out.println("退出");
			  //break;
			    return;
			  default:
			  
			  System.out.println("您的输入不满足要求");
			 break;
			
			
			}
		
		
		
		
		
		}
	
	
	}
}