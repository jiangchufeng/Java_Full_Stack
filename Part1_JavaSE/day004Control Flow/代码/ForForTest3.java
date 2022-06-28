/*
			h		s
*			1		1
**			2		2
***			3		3
****		4		4
*****		5		5

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

class ForForTest3{

	public static void main(String [] args){
	
		//因为有五行星星 所以判断 外层循环执行5次
		for(int h = 1;h<=5;h++){
		
			//打印星星
			for(int s = 1;s<=h;s++){
			
				System.out.print("*");
			}
			
			//换行
		      System.out.println();
		
		}
		
		
	
	
	
	}
}