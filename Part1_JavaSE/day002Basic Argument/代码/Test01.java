/*
手动计算 10进制数对应的二进制数

  9: 对次数 除以2 取余数 当商为0 终止 余数反转
  
计算机的组成单位

	bit : 0 / 1
 
   8 bit  = byte	
   
   1024byte = 1KB
   
   1024KB  =1MB
   
   1024MB = 1GB
   
   1024GB = 1T
  
*/

class Test01{

	public static void main(String [] args){
	
		/*
		
		在java 中 可以使用不同的字母数字组合 来表示 不同进制的数  
		但是  都会以 10进制的值进行输出 
		
		*/
		
		//输出10进制的 数
		System.out.println(3);
		//输出二进制的数 binary 二进制  0b  0B
		System.out.println(0B111);//3
		
		//输出8进制的数 0 开头 Octal 是零 不是 o
		System.out.println(011);//3
		
		//输出16进制的数 0x/X 开头   hexString 
		
		System.out.println(0X111);//3
		
	
	
	
	
	}

}