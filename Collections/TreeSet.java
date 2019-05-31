//package practice.collection;
import java.util.*;
	
public class Sample{
	public static void main(String[] args){
		NavigableSet<Integer> set = new TreeSet<>();	
		set.add(30);  // return TRUE
		set.add(50);  // return TRUE
		set.add(30);  // reuturn FALSE , because it's already 
			      // IN THE SET.	
		set.add(20);  // reuturn true
		set.add(10);  // reuturn true
		set.add(90);  // reuturn true

		System.out.println(set);  // [10,20,30,50,90]
		System.out.println(set.lower(30)+ " is less than 30 ");		// lower(e) finds element which is "LESS" than e.
		// floor(e) finds element which is "LESS THAN OR	
		// EQUALS" to e.
		
		System.out.println(set.ceiling(50) ); // ceiling(e) finds element which is "GREATER THAN OR EQUALS" to e.
		// higher(e) finds element which is "GREATER" than e
		System.out.println(set.headSet(30,true));
		System.out.println(set.pollFirst());  // return first element and remove it.
		System.out.println(set.pollLast());   // return last element and remove it.
	
		
		System.out.println(set);	 
	}
}
