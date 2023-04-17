class EscapeCaractorsmix{
	public static void main(String [] args){
		System.out.println("AB\bCD");	//ACD
		System.out.println("AB\tCD");	//AB	CD
		System.out.println("AB\nCD");	/*AB
						CD*/
		System.out.println("AB" + '\b' + "CD"); //backspace
		System.out.println("AB" + '\t' + "CD"); //tab
		System.out.println("AB" + '\n' + "CD"); //newline

		System.out.println('A'); //Legal
		//System.out.println('''); // Illegal
		//System.out.println("""); // Illegal

		System.out.println('"'); // Legal
		System.out.println("'"); // Legal	

		System.out.println('\''); // Legal
		System.out.println("\""); // Legal
	}
}