package day01variables;

public class variables01 {

	//Statement in Java = Sentence in English
	//	  ; 	in Java =	  .    in English
	
	//How to create Variables?
	//1)Access Modifier 2)Type data type 3)Type a name for the variables 4) = 5) Type a value for the variable 6);
	
	//In "public int age = 12;", "public int age" ins called "Variable Declaration".
	//In "public int age = 12;", "=12" is called "Value Assignment"
	
	//While you type code on Eclipse, if you get "red underline" it means you made a mistake
	
	//If you get yellow underline, it is not big issue. 
	//most probably you created a variable but you did not use it yet.
	
	//If you create declare a variable without assigning any value in "main method",
	//When you try to use it it will give you "red underline"
	//So do not try to use a variable inside the main method without assigning any value
	
	public static void main(String[] args) {
		
		int age = 12;
		System.out.println(age);
		
		int height= 5;
		System.out.println(height);
		
		//Declare a char variable
		char initial;
		
		//Assing 's' to "initial" variable
		initial = 'H';
		
		System.out.println(initial);
		
	}
	
}
