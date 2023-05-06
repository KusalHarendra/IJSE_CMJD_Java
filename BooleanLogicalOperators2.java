import java.util.Scanner;

public class BooleanLogicalOperators2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = scan.nextInt();

        if(!(marks >= 50)){                    // NOT operator
            System.out.println("Pass");
        }
        else{
             System.out.println("Fail");
        }
    }
}
