/*
||�� ��· �� �� ǰ��ı��ʽΪ trueʱ  ���ټ������ı����
      
	  || ��true��true ǰ��Ϊture ������1���false  ����ı� ����true�Ľ��

&&����·��  ��ǰ��ı��ʽΪfalseʱ  ���ټ������ı��ʽ��
      
	  && ���еı��ʽ��Ϊtrue�������true ��һ���Ѿ���false��  ������10000��true Ҳ�����������ʽ����false�Ľ��
	  
	  
*/

class OperatorTest2{

	public static void main(String[] args){
	
		if(1>2){//false
		
			System.out.println("������if");
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