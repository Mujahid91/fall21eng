package day31collections;

import java.util.HashSet;
import java.util.TreeSet;

	/*
	 	1) If you need to store unique elements in natural order use TreeSet
	*/
public class TreeSet01 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(12);
		ts1.add(35);
		ts1.add(10);
		ts1.add(46);
		ts1.add(9);
		System.out.println(ts1);//[9, 10, 12, 35, 46]
		
		/*
		 	1) How to store unique elements in natural order in a collection?
		 	   Ans: I use TreeSet
		 	   
		 	2) But as you know TreeSet is very slow, how can you make your code faster
		 	   i: I create a HashSet and add the elements into HashSet
		 	   ii: I create a TreeSet and i convert HashSet to TreeSet
		 */
		
		//1.Way:
		Long t1 = System.nanoTime();
		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add("k");
		ts2.add("z");
		ts2.add("a");
		ts2.add("c");
		ts2.add("t");
		System.out.println(ts2);
		Long t2 = System.nanoTime();
		
		//2.Way:
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("k");
		hs1.add("z");
		hs1.add("a");
		hs1.add("c");
		hs1.add("t");
		System.out.println(hs1);
		
		TreeSet<String> ts3 = new TreeSet<>();
		System.out.println(ts3);
		Long t3 = System.nanoTime();
		
		System.out.println(t2=t1);
		System.out.println(t3-t2);
	}

}
