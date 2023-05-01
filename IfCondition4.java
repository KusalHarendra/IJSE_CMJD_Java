import java.util.*;

class IfCondition4{
	public static void main(String args[]){	
		Scanner input = new Scanner(System.in);
		System.out.print("Input num 1 ");
		int num1 = input.nextInt();

		System.out.print("Input num 2 ");
		int num2 = input.nextInt();

		System.out.print("Input num 3 ");
		int num3 = input.nextInt();

		System.out.print("Input num 4 ");
		int num4 = input.nextInt();

		int max = num1;
			if (max < num2){
				max = num2;
			}

			if (max < num3){
				max = num3;
			}

			if (max < num4){
				max = num4;
			}
		
		System.out.println("Maximum : " + max);
	}
}
