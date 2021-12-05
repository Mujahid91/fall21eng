package day18multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;
public class ArrayList01 {


		/*
		   What is the cons of "Arrays"?
		   Arrays are not flexible in length.
		   If you declared an array with capacity "10", you cannot make it 11 or more.
		   Arrays fixed in length.
		   
		   1) ArrayList is flexible in length.
		   2) ArrayList accepts just non-primitive data types.
		 */
		
	    public static void main(String[] args) {

	    	//How to declare an ArrayList
	    	
	    	//1.Way:
	    	ArrayList<Integer> list1 = new ArrayList<Integer>();
	    	System.out.println(list1);

	    	//2.Way:
	    	ArrayList<Integer> list2 = new ArrayList<>();
	    	System.out.println(list2);
	    	
	    	//2.Way: Recommended
	    	List<Integer> list3 = new ArrayList<>();
	    	
	    	//How to add elements into a list
	    	//add() method adds the elements to the end everytime. add() method add the elements into a list in insertion order
	    	
	    	list3.add(12);
	    	list3.add(3);
	    	list3.add(7);
	    	
	    	//How to add an element into a specific index
	    	list3.add(1, 8);
	    	
	    	System.out.println(list3);//12
	    	
	    	//How to get the number of elements in a list
	    	System.out.println(list3.size());//5
	    	
	    	//How to check if a list is empty or not
	    	list1.isEmpty();//true
	    	list3.isEmpty();//false
	    	
	    	//How to check if a list has a specific element
	    	System.out.println(list3.contains(12));//ture
	    	System.out.println(list3.contains(21));//false
	    	/**
	         * Returns {@code true} if this list contains the specified element.
	         * More formally, returns {@code true} if and only if this list contains
	         * at least one element {@code e} such that
	         * {@code Objects.equals(o, e)}.
	         *
	         * @param o element whose presence in this list is to be tested
	         * @return {@code true} if this list contains the specified element
	         * @throws ClassCastException if the type of the specified element
	         *         is incompatible with this list
	         * (<a href="Collection.html#optional-restrictions">optional</a>)
	         * @throws NullPointerException if the specified element is null and this
	         *         list does not permit null elements
	         * (<a href="Collection.html#optional-restrictions">optional</a>)
	         */

	    	
	    	//How to remove aspecific element from a list
	    	//If you put an integer inside the remove() parenthesis, java will use it as index.
	    	//If you use remove() with index. it will return the removed element
	    	System.out.println(list3.remove(2));//7
	    	System.out.println(list3);
	    	
	    	List<String> list4 = new ArrayList<>();
	    	list4.add("Ali Can");
	    	list4.add("Veli Han");
	    	list4.add("Mary Star");
	    	list4.add("Angelina Julie");
	    	list4.add("Brad Pitt");
	    	
	    	System.out.println(list4);
	    	
	    	list4.remove(2);
	    	System.out.println(list4);
	    	
	    	//If the list is integer list we have to use index to remove an element but if the list is NOT integer list
	    	//You can use the element itself inside the remove() like in the following example
	  
	    	list4.remove("Brad Pitt");
	    	System.out.println(list4);
	    }
}
