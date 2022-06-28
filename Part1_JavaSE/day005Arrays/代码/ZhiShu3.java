class ZhiShu3{

	public static void main(String [] args){
			
	l:	for(int i = 2;i<=200;i++){ //4
		
			for(int j = 2;j<=Math.sqrt(i);j++){
			
				if(i%j==0){
					continue l;
				}
			}
			System.out.println(i);
		
		}
		
	}
}