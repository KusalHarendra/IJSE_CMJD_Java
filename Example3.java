class Example3{
	public static void main(String args[]){	
		int i=100;
		short s=10;
		long l=10;
		float f=10;
		double d=10;

		//s=i; 		//int cannot put into short
		//i=l;		//long cannot put into int
		//l=f;		//float cannot put into long
		//f=d;		//double value cannot put into float

		d=s;		
		d=i;
		d=l;
		d=f;		//any data can put into double
		
		f=s;
		f=i;
		f=l;		//any data can put into float except double
		
		l=s;
		l=i;		//any data can put into long except double & float
		
		i=s;
		
		System.out.println();
	}
}
