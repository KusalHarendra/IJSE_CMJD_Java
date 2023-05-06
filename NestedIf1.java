import java.util.Scanner;

public class NestedIf1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
		System.out.print("Input Number : ");

		int num = input.nextInt();

		if(num == 1 | num == 2){
			if(num == 1){
				System.out.println("A");
			}
			System.out.println("B");
		}
        else {
			System.out.println("Wrong Number");
		}
    }
} 

//num == 1 --> prints A B
//num == 2 --> prints B
//num == other number --> prints wrong number