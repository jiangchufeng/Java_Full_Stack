/*
逻辑运算符：
   &： 与  并且  都为true 结果才是true 
   |： 或  或者  能true 就true 
   !:  取反  !true ==> false  !false ==> true
   ^: 异或   同性相斥 异性相吸
   
   
   &&: 两边的表达式都为true结果才是true 
       有一个为false 结果就是false
   
   ||:两边的表达式都为false结果才是false
      有一个为true  结果就是true
	  
	注意： 逻辑运算符结果都是boolean类型

*/

class OperatorTest1{


	public static void main(String[] args){
	
		
	
		int i = 10;
		int i1 = 20;	
		
		
		
		System.out.println(i>i1 | i1 < i);// false  false
		System.out.println(i1>i | i1 < i);//true   false	
	    System.out.println(i1<i | i1 >i);//false   true
		 System.out.println("---------------------------------------");
		 
		 boolean t1 = true;
		 boolean t2 = true;
		 boolean f1 = false;
		 boolean f2 = false;
		 System.out.println("------------------||---------------------");
		 
		 System.out.println(t1 || t2 || f1);// true
		 System.out.println(f1 || f1 || t1);//true
		  System.out.println(f1 || f1 || f2);//false
		  System.out.println(t1|| f2);//true
		 
		 
		 
		 System.out.println("---------------------------------------");
		
		System.out.println(t1 & t2 & f1);//false
		System.out.println(t1 & t2);//true
		System.out.println(t1 & f2);//false
		
		System.out.println("---------------------------------------");
		
		System.out.println(!t1);//false
		
		System.out.println(!f1);//true
		
		System.out.println("---------------------------------------");
	    System.out.println(f1^f2);//false
	    System.out.println(t1^f2);//true
		System.out.println(t1^t2);//false
		
		System.out.println("------------------&&---------------------");
		
		System.out.println(t1 && t2 && f1);//false
		System.out.println(t1 && t2);//true
		System.out.println(t1 && f2);//false
	}

}