import java.util.Scanner;

public class IfElseif {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your salary :");
        double salary = input.nextDouble();

        if(salary > 100000){
            salary = salary + (salary * 0.05);
        }
        else if(salary > 50000 ){
            salary = salary + (salary * 0.1);
        }
        else{
            salary = salary * (salary * 0.2);
        }
        System.out.println("New salary is : " + salary);
    }
}
