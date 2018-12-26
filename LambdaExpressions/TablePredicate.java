/*
*	This program prints Table.
*	Using Lambda Expression and Predicate Function.
*
*	Predicate is an functional interface.
*	Means , It has only one abstract method.
*	boolean test(T t);
*/
import java.util.function.*;
public class TablePredicate{
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
							
		print(2,check);
		print(30,check);
	}
	protected static void print(int n,Predicate<Integer> c) {
		if(c.test(n)) {	
			System.out.println("Table of "+n);
			for(int i =0;i<=10;i++)	{ 
					System.out.println(n+"*"+i+"="+(n*i));}
				}
		else {
			System.out.println("try next time.");
		}	
	}
	} 

 
