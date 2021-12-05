package day23inheritanceoverriding;


		/*
		 	1) Maltiple parents for a child is called "Multiple Inherithance"and it is not
		 	   supported by Java
		 	2) Child --> Parent --> Grand Parent ... is called "Multi Level"inheritance and
		 	   Java supports "Multi Leve" inherithance
		 	3) If a parent class has multiple child classes it is called "Hierarchical Inheritance"
		 	   it is supported bu Java
		*/

public class Vehicle {
	
	public void move() {
		System.out.println("All vehicles move...");
	}
	
	public int price() {
		return 2000;
	}
	
	public Vehicle name() {
		return new Vehicle();
	}
	
	public Integer age() {
		return 0;
	}
	
	public final String modelName() {
		return "Honda Civic";
	}
	
	

}