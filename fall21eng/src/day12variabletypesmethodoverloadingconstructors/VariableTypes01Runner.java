package day12variabletypesmethodoverloadingconstructors;

public class VariableTypes01Runner {

	public static void main(String[] args) {
		
		VariableTypes01 obj1 = new VariableTypes01();
		System.out.println(obj1.name);//Ali Can
		
		obj1.name = "Veli Han";
		System.out.println(obj1.name);//Veli Han
		
		System.out.println(VariableTypes01.id);//null Note: "id" has "yellow underline" because you created an object to access static variable
		                                   //    no need to do it, because class name is enough to access
		VariableTypes01.id = "New Id";
		System.out.println(VariableTypes01.id);//New Id
		
		VariableTypes01 obj2 = new VariableTypes01();
		System.out.println(obj2.name);//Ali Can
		
		System.out.println(VariableTypes01.id);//New Id
	}

}