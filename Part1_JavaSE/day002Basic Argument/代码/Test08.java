/*
++ --

 ++a: ǰ++  ��+1   ������
    
 a++: ��++  ������ ��+1

-- ͬ��
  --a: ǰ--  ��-1   ������
    
  a--: ��--  ������ ��-1

ע�⣺ 
   ������ ǰ++ ���Ǻ�++ ��������ʱ ���������+1

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