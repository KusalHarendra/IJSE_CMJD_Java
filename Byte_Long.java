class Byte_Long
{
	public static void main(String args[]){	
		byte b = 10;
		long x = 100;
		//b = b + x; // Illegal;

		b += x; // Legal --> Narrow Conversion
		System.out.println(b); // prints 110;

		b = 10;	
		x = 118;
		b += x; 
		System.out.println(b); // prints -128;

	
	}

}