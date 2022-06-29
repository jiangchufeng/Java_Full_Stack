/*
  90 ~ 100  A
  80 ~ 89   B
  70 ~ 79   C
  60 ~ 69   D
  <60       E
  
  键盘输入一个分数 判断此分数的等级
  
  将相同的内容 进行抽取 保留 个性(不同)的内容
  
  
  如果使用单段 校验 一定要注意数学特性 
  不能改变位置。
  
  
  if分支可以进行嵌套
  
*/

class IfMoreTest4{


	public static void main(String [] args){
	
	
		int score  = -89;
		
		String level = "";
		
		//如果是 在0~100的范围内 对 数据进行校验
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
		
		    System.out.println("您的分数是："+score+"，对应的等级是："+level);
		
		}else{
			System.out.println(score+" 您的分数有误 请重新输入");
		
		}
		
		
		
		
	
	
	
	}
	
}