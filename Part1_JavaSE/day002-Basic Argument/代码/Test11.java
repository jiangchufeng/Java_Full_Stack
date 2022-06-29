
/*
比较运算符：
	>
	<
	>=
	<=
	==: 比较俩数是否相等
	!=

	注意：
	 1.==: 比较俩数是否相等
	 2.比较运算符 结果都是布尔类型
	
*/

class Test11{

	public static void main(String [] args){
	
		//定义俩变量
		
		int i1 = 10;
		int i2 = 20;
		
		System.out.println(i2 > i1);//  true
		
		System.out.println(i2 < i1);// false
		System.out.println(i2 >= i1);// true
		System.out.println(i2 <= i1);// false
		System.out.println(i2 == i1);// false
		System.out.println(i2 != i1);// true
		System.out.println("-----------------------------------------");
		
		
		int i3 = 66;
		
		int i4 = 66;
		
		System.out.println(i3 >= i4);// true
	    System.out.println(i3 ==i4);//  true
	
	}
	
}