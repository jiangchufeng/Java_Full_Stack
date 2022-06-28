/*	 	       行数 	星星    空格
				h		s	 	k
--------*		1		1		8
-------* *		2		2		7
------* * *		3		3		6
-----* * * *	4		4		5	
----* * * * *	5		5		4
	通过图得知：
			  s = h;
			  和 = 加数1 + 加数2；
			  9 =  h + k;
			  k = 9 - h;
			  
			    h		s		k	   
-----* * * *    1		4		5
------* * *		2		3		6
-------* *		3		2		7
--------*		4		1		8
	通图可知：
	    和 = 加数1 + 加数2；
		5 = h + s;
		s = 5-h;
		
		h + 4 = k
		


*/


class ForForTest6{

	public static void main(String [] args){
	
		//上半部分 h = 1 代表第一行 。。。。
		for(int h = 1;h<=5;h++){
			//打印空格
			for(int k =1;k<=9-h;k++){
				System.out.print(" ");
			}
			//打印星星
			for(int s = 1;s<=h;s++){
				System.out.print("* ");
			}
			
			//进行换行
			System.out.println();
		}
		//下半部分
		
		for(int h = 1;h<=4;h++){
			//打印空格
			for(int k = 1;k<=h+4;k++){
			  System.out.print(" ");
			}
			//打印星星
			for(int s = 1;s<=5-h;s++){
				System.out.print("* ");
			}
			//换行
			System.out.println();
		
		}
		
	
 	}
}