public class BooleanOperators {
    public static void main(String args[]){
		System.out.println("--------AND---------");
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false

		System.out.println("--------OR---------");
		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false

		System.out.println("--------XOR---------");
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false); // false

		System.out.println("--------NOT---------");
		System.out.println(!true); // false
		System.out.println(!false); // true
	}

    
}
