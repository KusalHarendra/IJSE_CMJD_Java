class IntegerMax{
	public static void main(String [] args){		
		int x = Integer.MAX_VALUE;
		System.out.println(x);  	//prints 2147483647

		long l = 2147483647;
		System.out.println(l);		//prints 2147483647

		//l = 2147483648;		//illegal
		
		l = 2147483648l;		//legal 
		System.out.println(l);
	}
}