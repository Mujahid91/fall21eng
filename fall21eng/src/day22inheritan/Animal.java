package day22inheritan;

  /*
  	 1)"private" class members cannot be used by child classes
  	 2)"default" class members can be used by child classes if the
  	   child class is in the same package with the parent class
  	 3)"protected" class members can be used by child classes
  	 4)"public" class members can be used by child classes
  	 5)to use "static" class members no need to create object, use them
  	   by class name.
  	 6)"super" is for calling parent constructor.
  	   if you do not type "super()" inside the xonstructor
  	   Java will put it as defult but it will be invisible.
  	 7)"super()" must be in the firstline inside the
  	   constructor.
  	 8)"this()" and "super()" nust be in the first line
  	   inside a constructor so "this()" and "super()" cannot
  	   be used at the in a constructor. 
  	 9)Java dose not support "multiple  inherithance".
  	   A child class cannot have multiple parents     
  */

public class Animal {
	
	public Animal() {
	    super();
		System.out.println("No parameter animal Constructor...");
		
	}
	int age; 
	
	
	public void eat() {
		System.out.println("They eat...");
		
	}
	
	public void drink() {
		System.out.println("They drink...");
	}

}
