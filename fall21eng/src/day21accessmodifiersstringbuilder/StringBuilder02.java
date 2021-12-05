package day21accessmodifiersstringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
		System.out.println(sb1.charAt(2));//v
		
		
		//compareTo() copmares the StringBuilder lexicographically.
		//"0" means completely same
		//"-" numbers mean first StringBuilder is before the second one in alphabetical order
		//"+" numbers mean first StringBuilder is after the second one in alphabetical order
		System.out.println(sb1.compareTo(sb2));//-2
		
		sb1.delete(1, 3);
		System.out.println(sb2);//Ja
		
		sb2.deleteCharAt(3);
		System.out.println(sb2);//Jav
		
		System.out.println(sb2.equals(sb1));//false
		
		System.out.println(sb2.indexOf("v"));//2
		
		System.out.println(sb2.indexOf("a", 1));//1
		
		//insert(2, "s"); it will insert "s" at index 2 without removing any characteer
		sb2.insert(1, "S");
		System.out.println(sb2);
		
		//The greates first parameter can be the length.
		//If you use number more than length in the first parametr you will get Run time Error
		sb2.insert(4,  "W");
		System.out.println(sb2);
		
		sb2.insert(1,  "WYMUMKL", 2, 5);
		System.out.println(sb2);//WMUMasvW
		
		
		StringBuilder sb3 = new StringBuilder("hello world hello");
		System.out.println(sb3.lastIndexOf("o", 6));//4
		
		sb3.replace(5,  7, "-");
		System.out.println(sb3);//hollo-orld hello
		
		sb3.reverse();
		System.out.println(sb3);//olleh dlro-olloh
		
		sb3.setCharAt(10, '!');
		System.out.println(sb3);//olleh dlro!olloh
		
		System.out.println(sb3.subSequence(6, 10));//dlro ==> CharSequence object
		
		System.out.println(sb3.substring(6, 10));//dlro ==> String object
		
		//toString() method converts "StringBuilder" to "String"
		String s1 = sb3.toString().replace("o", "*");
		System.out.println(s1);//*lleh dlr*!*lleh
		
		sb3 = new StringBuilder(s1);
		System.out.println(sb3);//*lleh dlr*!*lleh
		
		sb3 = new StringBuilder(sb3.toString().replace("o", "*"));
		System.out.println(sb3);//*lleh dlr*!*lleh
		
		
		
		
		
		
	}

}
