package day10lopps;

import java.util.Scanner;

public class WhileLoop03 {

	  /*
	      Write a program that prompts the user to input an integer.
	      It should then find sum of the digits of that number.
	      123 ==> 1+2+3 = 6
	   */
     
      	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to find the sum of the digits...");
		int num = scan.nextInt();
		
		if(num<0) {
			num = -1*num;
		}
		
		int sum = 0;
		
		while(num!=0) {
			
			sum = sum + num%10;
			
			num = num/10;
		}
		
		System.out.println(sum);
		
	}
	

}
