/*
continue: 继续

        结束本次循环 继续下一次循环。

	总结：
	    1.break 可以用在 循环和switch中
		
		2.continue只能用在循环中
		
		3.特殊的流程控制语句下 不能存在其他内容   因为无法访问
*/




class ContinueTest1{
	public static void main(String [] args){
		
		for(int i = 1;i<=10;i++){
		
			if(i==6){
			
				continue;
				//System.out.println("Game Over!!!");
			}
			System.out.println(i);
		
		}
	
		System.out.println("Game Over!!!");
	
	}
}