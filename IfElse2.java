import java.util.Scanner;

public class IfElse2 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your salary :");
        double salary = input.nextDouble();

        if(salary >= 100000){
            salary = salary + salary * 1/100;
        }
        else{
            salary = salary + salary * 2/100;
        }
        System.out.println("New salary is : " + salary);
    
    }
}
