/*
+:  ����
 : �Ӻ�
 :�ַ������ӷ�
 
 
ע�⣺ 
    ����ʹ�� С�����������ĵȼ�
	



*/



class Test09{

	public static void main(String [] args){
		System.out.println(+3);
		System.out.println(-3);
		System.out.println(9+3);
		
		//�����ַ������� 
		String str = "hello";
		
		System.out.println(str+10+20);//hello1020
		
		System.out.println(10+20+str);//30hello
		
		System.out.println(str+(10+20));//hello30
		
		//��ȡһ����λ���ĸ�λ��ʮλ����λ��ǧλ ������˭ ���
		
		int num = 5678;
		
		
		//����1000�õ�ǧλ
		
		int qianWei = num / 1000;
		
		System.out.println("ǧλ��"+qianWei);//hello30
		// ����100 ȡģ10 
		int baiWei = num /100%10;
		//��ʽ2 
		   baiWei = num%1000/100;
		   
		   System.out.println("��λ��"+baiWei);
		   
		 int shiWei = num%100/10;
		  System.out.println("ʮλ��"+shiWei);
		 int geWei = num % 10;
		 
		 System.out.println("��λ��"+geWei);
	
		
		
	
	}
}