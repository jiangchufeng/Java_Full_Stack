/*
++ --

 ++a: 前++  先+1   再运算
    
 a++: 后++  先运算 再+1

-- 同理：
  --a: 前--  先-1   再运算
    
  a--: 后--  先运算 再-1

注意： 
   无论是 前++ 还是后++ 独立成行时 都会给本身+1

*/
class Test08{

	public static void main(String [] args){
	
		int a = 10;
		
		int b = 20;
		
		System.out.println(a++ + b);//10
		
		System.out.println("a ="+a);//11
		
		
	    System.out.println(++b);//11
		
		a = 10;
		
		b = 20;
		//           a= 11  b = 21
		int result = a++ +  b++ + ++b + ++a;//   10 + 20 +22 + 12 = 30 + 34 = 64
	
	    System.out.println(result);//11
		 System.out.println("---------------------------------------");//11
		a = 10;
		
		b = 20;
		
		//a++;
		++a;
		System.out.println(a);//10 11
		
	}
}