/*

���꣺ ����һ�� 
    
	2000 
	
	2004
	
	1996
	
��������ı�׼����������һ������
  1.�ܱ�4�������ܱ�100����
  
  2.�ܱ�400����
		
����Ϊ0�������� 

*/
class IfTest2{
	public static void main(String [] args){
		//ֱ�Ӵ�������
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("������һ�����");
		
		int year  = input.nextInt();
		
		//1.�ܱ�4�������ܱ�100����      �ܱ�400����
		if(year %4==0 && year %100!=0 || year % 400 ==0){
		
			System.out.println(year+"������");
		}
	
		System.out.println("GameOver!!!!");p
	}
}