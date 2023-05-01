class Wider Conversion
{
	public static void main(String args[]){	
		byte b = 100;	 //8 bits
		short s;	//16 bits
		s = b;		 // Legal, Wider Conversion

		System.out.println(b + " " + s);
		System.out.println(s);
		System.out.println(b);

		b = 100;
		s = 200;

		System.out.println(b + s);	// Legal, Prints 300

	}
}
