/*
输出 1~200内的数
1
2
3 foo
4
5 fiz
6 foo
7 faz
8
9 foo
...
15 foo fiz
...
35 fiz faz
...
105 foo fiz faz
...
200





*/


class LoopTest4{

	public static void main(String [] args){
	
		
	
		for(int i = 1;i<=200;i++){ // i = 15
		
			//当记录的是单个变化 要将变量 定义到循环内
			String str = "";
			
			if(i%3==0){//能被3整除
			    str=  "\tfoo";
			}
		
			if(i % 5==0){//能被5整除
			   str = str + "\tfiz";
			}
			
			if(i % 7==0){//能被7整除
			  str += "\tfaz";
			}
		
		
			System.out.println(i+ str);
		}
	
	
	}
}