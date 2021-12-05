package day29exceptions;

public class Exception02 {

	public static void main(String[] args) {
		divide(5, 2);
		divide(5, 1);
	}
	public static void divide(int a, int b) {
		try {
			if(b==1) {
				throw new DivibeByOneException("No need to divide a number by 1");
			}else {
				System.out.println("Result is" + a/b);
			}
		}catch(DivibeByOneException e) {
			System.err.println(e.getMessage());	
		}	
	}
}
//Create Custom Runtime Exception
/*
    1) To create a RuntimeException follow the same steps in Compile Time Exception creation.
 	   Just change the extended class name from “Exception” to “RuntimeException”
 	  
 	2) When you call a method which throws Compile Time Exception, you will get red underline but 
 	   When you call a method which throws Runtime Exception, you will not.
 */
class DivibeByOneException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public DivibeByOneException(String message) {
		super(message);
	}
}
