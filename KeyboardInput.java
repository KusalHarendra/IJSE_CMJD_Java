import java.util.*;

class KeyboardInput{
	public static void main(String [] args){
		int x, y, z;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your first number : ");		 
		x = scan.nextInt();
		
		System.out.println("Enter your first number : ");		 
		y = scan.nextInt();
		
		z = x + y;
		System.out.println("Sum of your two numbers = " + z);

	}
}