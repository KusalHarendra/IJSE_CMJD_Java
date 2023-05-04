class UnaryOperators2{
	public static void main(String [] args){
		int x = 100;					
		System.out.println(x);		//prints 100	
	
		System.out.println(+x);		//prints 100		
		
		System.out.println(-x);		//prints -100

		System.out.println(x);		//prints 100

		x = -x;
		System.out.println(x);		//prints -100

		x = -x;				//-(-100)
		System.out.println(x);		//prints 100

	}
}