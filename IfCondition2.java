import java.util.*;

class IfCondition2{
	public static void main(String [] args){
		int salary;
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		salary = scan.nextInt();

		if (salary < 100000) {
			salary = salary + 5000;
		}
		System.out.println("Your total salary is: " + salary);
	}
}