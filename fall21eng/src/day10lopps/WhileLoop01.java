package day10lopps;

public class WhileLoop01 {
	

	public static void main(String[] args) {
		
		//Type code to print "Hi!" 5 times on the console by using for-loop
		
		for(int i=1; i<6; i++) {
			System.out.println("Hi!");
			
		}
		
		System.out.println("======");
	 
		//Type code to print "Hi!" 5 times on the console by using for-loop
		
		int i=1;
		
		while(i<6) {
			
			System.out.println("Hi!");
			
			i++;//If you forget increment or decrement inside the while_loop body you will infinite loop.
			
			
		}

	}

}
