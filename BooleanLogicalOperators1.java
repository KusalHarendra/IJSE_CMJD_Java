import java.util.Scanner;

public class BooleanLogicalOperators1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
		System.out.print("Input Average Marks : ");
		double marks = input.nextDouble();

		System.out.print("Input Attendance : ");
		int attendance = input.nextInt();

		// marks >= 50 or attendance >= 75 --> Eligible
		if(marks >= 50 | attendance >= 75){
			System.out.println("Eligible");     //  A OR B
		} else{
			System.out.println("Not Eligible");
		}

    }
}
