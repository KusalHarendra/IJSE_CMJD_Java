class Casting3
{
	public static void main(String args[]){	
		double d = 97.35;
		char ch;
		//ch = d; // Illegal		
		
		ch = (char) d; //  Narrow cast ->  only 97	

		System.out.println("d: " + d); // prints 97.35
		System.out.println("ch:" + ch); // prints 'a'
	}

}