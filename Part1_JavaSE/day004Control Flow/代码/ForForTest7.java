/*
��Ƕ��ѭ���� ��������̿������


   break:
       ��������break���ڲ��ѭ��
	   
	   һ������lable(��ǩ) ��ô��������  label���ڲ��ѭ��
		
*/

class ForForTest7{

	public static void main(String [] args){
	
	l:	for(int i = 1;i<=10;i++){
		
		
			for(int j = 1;j<=15;j++){
			
				if(j == 10){
					break l;
				}
			
				System.out.print(j+" ");
			
			}
			System.out.println();
			
		
		}
		
		System.out.println("Game Over!!!");
	
	}
}