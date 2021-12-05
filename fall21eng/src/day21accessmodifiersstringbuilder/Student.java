package day21accessmodifiersstringbuilder;

public class Student {

	//If you use "private"as access modifier, it means you hid the data
	//If the access modifier is "private", it is impossible to see from
	//other classes
	@SuppressWarnings("unused")
	private String name = "Ali Can";
	
	//If you do note any access modifier, it means access modifier is
	//If access modifier is "difault", the data will be visible inside
	//the entire package
	int age = 13;
	
	//If you use "protected" access modifier, you can access to it,
	//from inside the entire package and from every childe classes even they
	//are in different packages
	protected int grade = 11;
	
	//if you use "public" access modifier, the cllas member will be
	//visible from entire the project.
	public String country = "USA";
	
	
	//
}
