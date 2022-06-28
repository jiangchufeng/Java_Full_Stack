/*

				h	k	s
----*******		1	4	7
---*******		2	3	7
--*******		3	2	7
-*******		4	1	7
*******			5	0	7

已知条件是行数h 
 h + s = 5
     s = 5 - h;
	 
		*
	   * *
	  * * *
	 * * * *
	* * * * *
	
	 * * * * 
	  * * *
	   * *
	    *

*/

class ForForTest5{

	public static void main(String [] args){
	
		//一共有五行 外层循环执行五次
		for(int h = 1;h<=5;h++){
		
			//打印空格
			for(int k = 1;k<=5-h;k++){
			
				System.out.print(" ");
			}
			
			//打印星星
			for(int s = 1;s<=7;s++){
				System.out.print("*");
			
			}
			
			//换行
			System.out.println();
		
		
		}
	
	
	
	
	}
}