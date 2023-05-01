class Marks
{
	public static void main(String args[]){	
		int total = 855;
		int subject = 10;

		double average = total/subject;
		System.out.println("avarage is : " + average);		//85.0

		average = (double)total/subject;
		System.out.println("average is : " + average); 		// 85.5

		average = total/(double)subject;
		System.out.println("average is : " + average); 		// 85.5

		average = (double)total/(double)subject;
		System.out.println("average is : " + average); 		// 85.5

		average = (double) (total/subject);
		System.out.println("average is : " + average); 		// 85.0
	}

}