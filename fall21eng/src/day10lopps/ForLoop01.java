package day10lopps;

import java.util.Scanner;

public class ForLoop01 {

	/*
	   Get the number of rows and columns from user.
	   create a rectangle.
	   row = 3 and column = 5 ==> * * * * *
	                              * * * * *
	                              * * * * *             
	
	 */
	
	public static void main(String[] args) {
		

		
		System.out.println("Enter the number of rows....");
		Scanner scan = null;
		@SuppressWarnings({ "unused", "null" })
		int numOfColumns = scan.nextInt();
		
		System.out.println("Enter the number of columns....");
		int numOfColumns1 = scan.nextInt();
		
		
		int numOfRows = 0;
		for(int i=1; i<=numOfRows; i++) {
			
			for(int k=1; k<=numOfColumns1; k++) {
				
				System.out.println("* ");
				
			}
			
			System.out.println();
		}
		
		scan.close();
	}

}
