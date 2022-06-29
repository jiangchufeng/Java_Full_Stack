/*
二维数组的遍历

  1.普通for循环 
  
  
  
  2.增强for循环



*/
class Test5{

	public static void main(String [] args){
							// 0                  1                                     2
		String[][] strArr = {{"蔡旭坤","特朗普"},{"杨幂","高圆圆","尼古拉斯*赵四"},{"胡歌","彭于晏","成龙","吴彦祖"}};
		
		
		for(int i = 0;i<strArr[0].length;i++){
		
			System.out.print(strArr[0][i]+"\t");
		}
		
		System.out.println();
		
		
		for(int i = 0;i<strArr[1].length;i++){//3
		
				System.out.print(strArr[1][i]+"\t");
		}
		System.out.println();
		
		for(int i = 0;i<strArr[2].length;i++){// 4
		
			System.out.print(strArr[2][i]+"\t");
		
		}
		System.out.println();
		
	
	
	}
}