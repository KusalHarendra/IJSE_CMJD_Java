public class ShortCircuitAND {
    public static void main(String args[]){
		int x = 5, y = 3;
		System.out.println(x + " " + y); // 5 3
		if(x++ == 7 && y++ == 3) {              //did not check the second part
			System.out.println("True");
		}
		System.out.println(x + " " + y); // 6 3
	}

}
