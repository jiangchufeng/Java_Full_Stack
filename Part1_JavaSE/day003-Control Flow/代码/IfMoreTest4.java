/*
  90 ~ 100  A
  80 ~ 89   B
  70 ~ 79   C
  60 ~ 69   D
  <60       E
  
  ��������һ������ �жϴ˷����ĵȼ�
  
  ����ͬ������ ���г�ȡ ���� ����(��ͬ)������
  
  
  ���ʹ�õ��� У�� һ��Ҫע����ѧ���� 
  ���ܸı�λ�á�
  
  
  if��֧���Խ���Ƕ��
  
*/

class IfMoreTest4{


	public static void main(String [] args){
	
	
		int score  = -89;
		
		String level = "";
		
		//����� ��0~100�ķ�Χ�� �� ���ݽ���У��
		if(score >=0 && score<=100){
		
			if(score >=90){
		
			level = "A";
		
			}else if(score >=80){
			
				level = "B";
			}else if(score >= 70){
				level = "C";
			
			}else if(score >= 60){
				level = "D";
				
			}else{
				level = "E";
			}
		
		    System.out.println("���ķ����ǣ�"+score+"����Ӧ�ĵȼ��ǣ�"+level);
		
		}else{
			System.out.println(score+" ���ķ������� ����������");
		
		}
		
		
		
		
	
	
	
	}
	
}