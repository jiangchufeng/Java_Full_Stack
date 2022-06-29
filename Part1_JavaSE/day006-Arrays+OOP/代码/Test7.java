/*
for(数组元素数据类型 标识符：数组名){
	
	标识符：代表数组内的元素
}




*/

class Test7{

	public static void main(String [] args){
	
	  String[][] strArr = {{"蔡旭坤","特朗普"},{"杨幂","高圆圆","尼古拉斯*赵四"},{"胡歌","彭于晏","成龙","吴彦祖"}};
	  
	  /*
	  二维数组的元素是一维数组 
	  二位数组的元素类型 是一维数组类型
	  
	  
	  */
	  //e:代表二维数组内的元素 一维数组
	  for(String[]  e: strArr){
		
		//在遍历 二维数组内一维数组
		for(String ele:e){
		
			System.out.print(ele+"\t");
		}
		System.out.println();
	  
	  
	  }
	  
	  
	  
	  /*
	  String s[] = {"杨幂","高圆圆","尼古拉斯","赵四"};
	  
	  for(String e:s){
	  
		System.out.println(e);
	  }
	  */
	  
	  
	  
	}
}