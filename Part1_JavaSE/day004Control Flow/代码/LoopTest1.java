/*
һ����������ѡ��ѭ����
	1.��ѭ�������̶���ʱ�� for

	2.��ѭ���������̶���ʱ�� while

	3.����ʼ������������ѭ������ ҲҪִ��һ��ѭ���� do{}while(); 


*/

class LoopTest1{

	public static void main(String [] args){
	/*
	   û�г�ʼ�� ��ѭ�������� ������������
	   
		for(;;){
			System.out.println("Hello");
		}
	*/
	
	  int  i = 1;
	
	  while(i<10){
		  System.out.println(i+"  Hello");
		  i++;
	  
	  }
	  System.out.println("i��ֵ�ǣ�"+i);
	   System.out.println("------------------------------------------");
	   
		// �����ĳ�ʼ������ ֻ���� ѭ����ʹ��
	   for(int j = 1;j<=10;j++){
	   
		System.out.println(j+"  Hello");
	   
	   }
	  // System.out.println(j);//11
	
	}
}