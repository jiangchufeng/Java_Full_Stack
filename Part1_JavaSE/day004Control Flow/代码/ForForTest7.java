/*
在嵌套循环内 特殊的流程控制语句


   break:
       结束的是break所在层的循环
	   
	   一旦存在lable(标签) 那么结束的是  label所在层的循环
		
*/

class ForForTest7{

	public static void main(String [] args){
	
	l:	for(int i = 1;i<=10;i++){
		
		
			for(int j = 1;j<=15;j++){
			
				if(j == 10){
					break l;
				}
			
				System.out.print(j+" ");
			
			}
			System.out.println();
			
		
		}
		
		System.out.println("Game Over!!!");
	
	}
}