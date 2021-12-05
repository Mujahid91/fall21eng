package day29exceptions;

public class Exception01 {

	public static void main(String[] args) {
		try {
			checkGrade(200);
		} catch (IllegarlGradeException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void checkGrade(int grade) throws IllegarlGradeException {
		if(grade<0 || grade>100) {
			throw new IllegarlGradeException("Do not make the grade less than 0 or greater than 100");
		}else {
			System.out.println("Your grade is " + grade);
		}
	}
}
//Create Custom Compile Time Exception
	/*
	  1)You have to extend to “Exception” class like “extends Exception”
 	  2)To be able to put “exception message” on the console, you should create constructor with 
 	    String parameter like “public IllegalGradeException(String message)”
 	  3)Inside the constructor call parent constructor with message argument like “super(message);”
 	  4)After creating your own exception class you can use it in any method body whenever you need by 
 	    typing like “throw new IllegalGradeException(“Do not make the grade less than 0 or greater than 100");”
	 */
class IllegarlGradeException extends Exception{
	private static final long serialVersionUID = 1L;
	public IllegarlGradeException(String message) {
		super(message);
	}
}
