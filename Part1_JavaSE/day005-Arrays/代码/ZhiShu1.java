/*
  质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
  
  2  3  5  7  11 13  17 19 23 ...
  
  4 
  
  2 ~ 200内的质数都有谁
  
  9 
  2 3 4 5 6 7 8
  
  6
  2 3 4 5
  
  36
  2~35
*/

class ZhiShu1{

	public static void main(String [] args){
			//i 是要判断的数 j代表可能出现的约数
		for(int i = 2;i<=200;i++){ //7
		
			//定义变量 假设每一个数都是质数
			boolean flag = true;
			
			//i/2 一个数的约数 除了1和本身之外 最大到 自身的一半  10 
			for(int j = 2;j<=i/2;j++){// j = 2; j<10 2~9
				
				if(i%j==0){
				// i 不是质数  6
				flag = false;
				}
				
			}
			
			//当循环完毕之后  可以断定 i 是还是不是质数
			
			if(flag ==true){
				System.out.println(i);
			}
			
		
		
		}
	
	
	
	
	}


}