package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

	//Check if a specific element exists in an array
	
	public static void main(String[] args) {
	
		int arr[] = {12, 21, 34};
		
		//1.way:
		int expectedElements = 12;
		int counter = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(expectedElements == arr[i]) {
				counter++;
				break;
				
			}
		}
		
		if(counter == 1) {
			System.out.println(expectedElements + " exists in the array.");
		}else {
			System.out.println(expectedElements + "does not exist in the array.");
		}
		
		//2.Way:
		//a) binarySearch() returns the index of the expected element if the element exists
		//b) binarySearch() returns negative integers for non-existing elements. The value represents the order numbr
		//   if the element exists
		//c) Before using binarySearch() method you have to use sort () otherwise the output you got does not have
		//   any meaning
		//d) BinarSearch() does not give stable outputs for  repeated values
		Arrays.sort(arr);
		System.out.println("Binary Search Result: " + Arrays.binarySearch(arr, expectedElements));//-3
	}

}
