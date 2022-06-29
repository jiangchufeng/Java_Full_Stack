/*
break: 打破 打断

     结束循环；
	 
	注意： 在特殊的流程控制语句下 不能存在其他内容 
	       java:18: 错误: 无法访问的语句
	 


*/

class BreakTest1{

	public static void main(String [] args){
	
		for(int i = 1;i<=10;i++){
		
			if(i==6){
				break;
				//System.out.println("你好世界");
			}
		
			System.out.println(i);
		
		}
		
		System.out.println("Game Over!!!");
	
	}
}