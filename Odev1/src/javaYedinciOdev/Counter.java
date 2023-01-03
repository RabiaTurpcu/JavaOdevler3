package javaYedinciOdev;

public class Counter {
	
	int count = 0;
	
	Counter(){
		
		count++;
		System.out.println(count);
		
		//Consructor
	}
	
	public static void main(String args[]) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		//1 1 1

	}

}
