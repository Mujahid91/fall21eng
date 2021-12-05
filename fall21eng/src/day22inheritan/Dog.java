package day22inheritan;

public class Dog extends Mammal{

	public char[] age;
	
	public Dog() {
		super();
		System.out.println("Dog Constructor");
		
	}

	public void bark() {
		System.out.println("Dogs bark...");
	}


}
