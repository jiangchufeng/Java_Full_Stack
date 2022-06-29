/*
  90 ~ 100  A
  80 ~ 89   B
  70 ~ 79   C
  60 ~ 69   D
  <60       E
  
  键盘输入一个分数 判断此分数的等级
  
  将相同的内容 进行抽取 保留 个性(不同)的内容
  
*/

class IfMoreTest3{


	public static void main(String [] args){
	
		//创建键盘录入的对象
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//接收一个 分数:score
		System.out.println("请您输入一个分数");
		
		int score = input.nextInt();
		
		String str = "";
		
		//对分数进行校验 
		
		if(score >=70 && score <=79){
		str = "C";
		//	System.out.println("A");
		}else if(score >=80 && score <=89){
		//	System.out.println("B");
		
		str = "B";
		}else if(score >=90 && score <=100){
		//	System.out.println("C");
		str = "A";
		}else if(score >=60 && score <=69){
			//System.out.println("D");
			str = "D";
		}else {// < 60
		    //System.out.println("E");
			str = "E";
		}
		
		//输出结果
		
			System.out.println("您的分数是："+score+"，对应的等级是："+str);
		
		 System.out.println("Game Over!!");
	
	
	}
	
}