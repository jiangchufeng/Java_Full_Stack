/*
continue: ¼ÌÐø


*/


class ForForTest8{

	public static void main(String [] args){
	
	c:	for(int i = 1;i<=5;i++){
		
			for(int j = 1;j<=10;j++){
			
				if(j == 6){
					continue c;
				}
			
				System.out.print(j+" ");
			}
			System.out.println();
		
		}
		
		System.out.println("Game Over");
	}
	
}