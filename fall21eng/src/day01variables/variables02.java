package day01variables;

public class variables02 {

	/*
	 	Data Types in Java
	 	Note: In Java, there are 2 main data types
	 	
	 	1)Primitive Data Types: 
	 	     a)boolean: It has 2 different values which are "true" and "false"
	 	     			Every boolean variable uses a single "bit" in memory
	 	     			booleans have "false" as default value
	 	     			
	 	     b)char 	Is is used for single characters
	 	     			Value must be put between single quotes like 'S'
	 	     			Every char used 16 bits in the memory 
	 	     c)byte 
	 	     d)short 
	 	     e)int 
	 	     f)float 
	 	     h)double
	 	
	 	Note: "=" is user to assign value to a variable
	 		  "==" is used to compare 2 values if they are equal to each other
	 		  "!=" means "not equal to"
	 	
	 	Note: If all values in an operation is integer the result will be integer in Java
	 		  If the result is decimal in Math, Java converts the decimal to integer just by removing decimal part.
	 		  Java do not do "rounding" operation
	 		  
	 	2)Non-Primitive Data Type
	 */
	
	public static void main (String[] args) {
		
		@SuppressWarnings("unused")
		boolean isExpensive = true;
		@SuppressWarnings("unused")
		boolean isOld = false;
		@SuppressWarnings("unused")
		boolean isRetired;
		
		char initioalOfFirstName = 'S';
		char initioalOfLastName = 'A';
		
		System.out.println(initioalOfFirstName);//S
		
		System.out.println(initioalOfFirstName + 5);//88
		
		System.out.println(initioalOfFirstName > 5);//true
		
		System.out.println(initioalOfFirstName < 5);//false
		
		System.out.println(initioalOfFirstName == 5);//false
		
		System.out.println(initioalOfFirstName != 5);//true
		
		System.out.println(initioalOfFirstName > initioalOfLastName);//true
		
		System.out.println(initioalOfFirstName + initioalOfLastName);// SA or 148
		
		System.out.println(initioalOfFirstName / initioalOfLastName);// 1
	
		System.out.println(29 / 10);//2.9 ==> 2
	}
}
