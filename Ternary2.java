import java.util.Scanner;

public class Ternary2 {
    public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input Marks : ");
		double marks = input.nextInt();

		// if(marks>= 50){
		// 	System.out.println("Pass");
		// } else {
		// 	System.out.println("Fail");
		// }

        System.out.println(marks >= 50 ? "Pass" : "Fail");

        //OR

        String result = marks>= 50 ? "Pass" : "Fail";
		System.out.println(result)
	}

}
