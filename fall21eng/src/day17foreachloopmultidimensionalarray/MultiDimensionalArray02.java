package day17foreachloopmultidimensionalarray;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		
		//Print the elements which have "a" from a 2 dimensional String array
		
		String arr1 [] [] = { {"Learn", "java", "is"}, {"is", "easy"} };
		for(String[] w : arr1) {
			for(String x : w) {
				if(x.contains("a")) {
					System.out.println(x + " ");
					
				}
			}
		}
	}
}
