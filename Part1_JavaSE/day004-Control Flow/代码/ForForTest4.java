/*
			h		s
*****   	1		5
****		2		4
***			3		3
**			4		2
*			5		1

 和 = 加数1 + 加数2；
 和 = h + s;
 
 s = 和 - h;


 
 
*/

class ForForTest4{

	public static void main(String [] args){
	
		for(int h = 1;h<=5;h++){
		
			//打印星星
			for(int s = 1;s<=6-h;s++){
			
				System.out.print("*");
			
			}
			
			
			//换行
			
			System.out.println();
		
		
		}
	
	}
}