import java.util.Scanner;

public class Ternary3 {
    public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input average Marks : ");
		double marks = input.nextDouble();

		// if(marks >= 75){
		// 	System.out.println("Grade A");
		// } else if(marks >= 65){
		// 	System.out.println("Grade B");
		// } else if(marks >= 50){
		// 	System.out.println("Grade C");
		// } else if(marks >= 35){
		// 	System.out.println("Grade S");
		// } else{
		// 	System.out.println("Grade F");
		// }

        System.out.println(marks>=75 ? "Grade A" : marks>=65 ? "Grade B" : marks >= 50 ? "Grade C" : marks >= 35 ? "Grade S" : "Grade F");
	}

}
