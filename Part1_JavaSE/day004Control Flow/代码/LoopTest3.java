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


class LoopTest3{

	public static void main(String [] args){
	
		for(int i = 1;i<=200;i++){
			
			System.out.print(i);
			if(i%3==0){//能被3整除
			 System.out.print("\tfoo");
			}
		
			if(i % 5==0){//能被5整除
			 System.out.print("\tfiz");
			}
			
			if(i % 7==0){//能被7整除
			 System.out.print("\tfaz");
			}
		
		
			System.out.println();
		}
	
	
	}
}