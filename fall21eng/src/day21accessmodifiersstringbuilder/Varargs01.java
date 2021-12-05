package day21accessmodifiersstringbuilder;

public class Varargs01 {

	public static void main(String[] args) {
		
		System.out.println("The sum: " + add());//0
		System.out.println("The sum: " + add(7));//7
		System.out.println("The sum: " + add(7, 9));//16
		System.out.println("The sum: " + add(7, 9, 10, 11, 1, 2, 13, 14, 15));//0
		System.out.println(join('a', 'l', 'i', 'y', 'e'));
	}

	/*
	   1)In a method you cannot use multiple varargs
	   2)In a method after the varargs you cannat use any other parameter.
	   so must be the last parametet.
	   3)Befor the varargs you can put many parameters, no limitation
	 */
	public static int add(int... a) {
		int sum =0;
		for(int w : a) {
			sum = sum + w;
		}
		return sum;
	}

	public static String join(char... c) {
		String name = "";
		for(char w : c) {
			name = name + w;
			name = name.toUpperCase();
		}
		return name;
	}
}