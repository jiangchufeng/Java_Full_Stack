/*
�߼��������
   &�� ��  ����  ��Ϊtrue �������true 
   |�� ��  ����  ��true ��true 
   !:  ȡ��  !true ==> false  !false ==> true
   ^: ���   ͬ����� ��������
   
   
   &&: ���ߵı��ʽ��Ϊtrue�������true 
       ��һ��Ϊfalse �������false
   
   ||:���ߵı��ʽ��Ϊfalse�������false
      ��һ��Ϊtrue  �������true
	  
	ע�⣺ �߼�������������boolean����

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