

/*
��ϰ1����һ������洢26��СдӢ����ĸ��
       ��������ʾ����ʾҪ���磺a->A

*/
class ArrayTest8{

	public static void main(String [] args){
		
		//��һ������ ����Ϊ26 char����
		
		char[] charArr = new char[26];
		
		/*
		 ��26��Ӣ����ĸ��䵽������ a  b  c  d  e f g ........ 
		 
		  a:97   b:98  0: 48  A:65 z:122
		  A:65   B:66
		  Сд��ĸ-32 �����õ���Ӧ�Ĵ�д��ĸ ��ASCIIֵ
		*/
		for(int i = 0;i<charArr.length;i++){ 
			//  ��intת����char���ܻ�����ʧ
			//С���������� ��ʶ�� = ��С���������ͣ�����������͵���ֵ
			charArr[i] = (char)(97+i);
		}
		
		for(char e:charArr){
		
		    //��ȡСд��ĸ��Ӧ�Ĵ�д��ĸ�ı���ֵ  
			int num = e-32;
			
			//�� ����תΪ ��д��ĸ
		    char daXieZiMu = (char)num;
		
			System.out.println(e+"->"+daXieZiMu);
		}
		
		
	
	
	}
}