/*
||： 短路 或 当 前面的表达式为 true时  不再计算后面的表达了
      
	  || 能true就true 前面为ture 后面有1万个false  不会改变 我是true的结果

&&：短路与  当前面的表达式为false时  不再计算后面的表达式了
      
	  && 所有的表达式都为true结果才是true 第一个已经是false了  后面有10000个true 也不会更改整个式子是false的结果
	  
	  
*/

class OperatorTest2{

	public static void main(String[] args){
	
		if(1>2){//false
		
			System.out.println("进入了if");
		}
	
	
	System.out.println("--------------------------------------");
	
		int a = 10;
		
		boolean b1 =  a > 5 | a++ <6;
		
		
		System.out.println("b1= "+b1+" ,a="+a);//true   a 11
		
		a = 10;
	    b1 =  a > 5 || a++ <6;
	
	   System.out.println("b1= "+b1+" ,a="+a);// true 
	   
	   
	   System.out.println("-----------------------------------------------------");
	   
	   a = 10;
	   
	   b1 = a < 5 & a++ > 6; // false & true
	   
	   
	   System.out.println("b1= "+b1+" ,a="+a);//b1= false ,a=11
	   
	   a = 10;
	   b1 = a < 5 && a++ > 6;
	   System.out.println("b1= "+b1+" ,a="+a);//false ,a = 10  b1= false ,a=10
	
	}
}