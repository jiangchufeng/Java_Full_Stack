/*
switch(表达式){

case
}


注意：
    1.表达式： byte short int char  jdk1.7 String  jdk1.5 枚举enum
	
	2.case 后的数值 必须与 表达式的类型一致

*/

class SwitchTest3{

	public static void main(String [] args){
	
		char c = 'D';
		
		switch(c){
		
			case 'A':
			System.out.println("输入了A");
			break;
			
			case 68:
			System.out.println("输入了D");
			break;
			
			case "你好":
			
			System.out.println("输入了你好");
			break;
			
		
		
		}
	
	
	
	}
	
}