class Casting2
{
	public static void main(String args[]){	
		short s;
		byte b;
		
		s = 127;
		b = (byte) s;		
		System.out.println(s +" " + b); // 127 127

		s = 128;
		b = (byte) s;	
		System.out.println(s +" " + b); // 128 -128

		s = 255;
		b = (byte) s;	
		System.out.println(s +" " + b); // 255 -1

		s = 256;
		b = (byte) s;	
		System.out.println(s +" " + b); // 255 0
	}

}