import java.util.*;

class IfCondition3{
	public static void main(String args[]){	
		Scanner input = new Scanner(System.in);
		System.out.println("Input num 1 ");
		int num1 = input.nextInt();

		System.out.println("Input num 2 ");
		int num2 = input.nextInt();

		int max;
			max = num1;
		if(max < num2){ 
			max = num2;
		}
		
		System.out.println("Maximum : " +max);
	}
}
