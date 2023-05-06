public class ShortCircuitOR {
    public static void main(String args[]){
		
        int x = 5, y = 3;
		System.out.println(x + " " + y); // 5 3 
		if(x++ == 5 || y++ == 5) {          //nly check the 1st part x+ == 5
			System.out.println("True");
		}
		System.out.println(x + " " + y); // 6 3
	}

}
