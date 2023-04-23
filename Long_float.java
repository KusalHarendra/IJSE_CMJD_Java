class Long_float{
	public static void main(String [] args){		
		long l = Long.MAX_VALUE;
		System.out.println(l); 		//prints 9223372036854775807

		//l = 9223372036854775808;
		//System.out.println(l); 		//illegal

		float f = 9223372036854775807F;
		System.out.println(f); 		//legal
	}
}