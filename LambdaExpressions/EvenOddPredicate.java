/*
*	This program prints even and odd numbers.
*	Using Lambda Expression and Predicate Function.
*
*	Predicate is an functional interface.
*	Means , It has only one abstract method.
*	boolean test(T t);
*/
import java.util.function.*;
public class EvenOddPredicate{
	public static void main(String[] args){
		Predicate<Integer> check = (n) -> {
							if(n<=0) {
									System.out.println("Invalid ");
									return false;	}
							else {
								System.out.println("Processing...");
								return true;
								}
							};
							
		print(4,check);
		print(13,check);
	}
	protected static void print(int n,Predicate<Integer> c) {
		if(c.test(n)) {	
			if( (n %2) == 0 ) {System.out.println(n+" is even number.");}
			else System.out.println(n+" is odd number");
		}
		else {
			System.out.println("try next time.");
		}	
	}
	} 

 
