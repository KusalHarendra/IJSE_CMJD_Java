class StringConcat3{
	public static void main(String [] args){
		int x = 10, y = 20, z = 30;		

		System.out.println("x + y + z");		//prints x + y + z
		System.out.println("x + y" + "z");		//prints x + yz
		System.out.println("x" + "y + z");		//prints xy + z	
		System.out.println("x + y" + z);		//prints x + y30
		System.out.println("x" + "y" + "z");		//prints xyz
		System.out.println(x + "y + z");		//prints 10y + z
		System.out.println(x + "y" + "z");		//prints 10yz
		System.out.println("x" + y + "z");		//prints x20z
		System.out.println("x" + "y" + z);		//prints xy30
		System.out.println(x + y + "z");		//prints 30z
		System.out.println(x + y + z);			//prints 60
		System.out.println("x"+y+z); 			// prints 'x2030' Important

	}
}