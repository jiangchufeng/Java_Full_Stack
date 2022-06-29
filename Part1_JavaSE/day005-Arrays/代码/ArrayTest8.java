

/*
练习1：用一个数组存储26个小写英文字母，
       并遍历显示，显示要求如：a->A

*/
class ArrayTest8{

	public static void main(String [] args){
		
		//有一个数组 长度为26 char类型
		
		char[] charArr = new char[26];
		
		/*
		 将26个英文字母填充到数组内 a  b  c  d  e f g ........ 
		 
		  a:97   b:98  0: 48  A:65 z:122
		  A:65   B:66
		  小写字母-32 可以拿到对应的大写字母 的ASCII值
		*/
		for(int i = 0;i<charArr.length;i++){ 
			//  从int转换到char可能会有损失
			//小的数据类型 标识符 = （小的数据类型）大的数据类型的数值
			charArr[i] = (char)(97+i);
		}
		
		for(char e:charArr){
		
		    //获取小写字母对应的大写字母的编码值  
			int num = e-32;
			
			//并 将其转为 大写字母
		    char daXieZiMu = (char)num;
		
			System.out.println(e+"->"+daXieZiMu);
		}
		
		
	
	
	}
}