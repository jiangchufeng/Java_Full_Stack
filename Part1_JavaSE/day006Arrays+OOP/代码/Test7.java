/*
for(����Ԫ���������� ��ʶ����������){
	
	��ʶ�������������ڵ�Ԫ��
}




*/

class Test7{

	public static void main(String [] args){
	
	  String[][] strArr = {{"������","������"},{"����","��ԲԲ","�����˹*����"},{"����","������","����","������"}};
	  
	  /*
	  ��ά�����Ԫ����һά���� 
	  ��λ�����Ԫ������ ��һά��������
	  
	  
	  */
	  //e:�����ά�����ڵ�Ԫ�� һά����
	  for(String[]  e: strArr){
		
		//�ڱ��� ��ά������һά����
		for(String ele:e){
		
			System.out.print(ele+"\t");
		}
		System.out.println();
	  
	  
	  }
	  
	  
	  
	  /*
	  String s[] = {"����","��ԲԲ","�����˹","����"};
	  
	  for(String e:s){
	  
		System.out.println(e);
	  }
	  */
	  
	  
	  
	}
}