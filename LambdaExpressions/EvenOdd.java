/*
*	This program prints even and odd numbers.
*	Using Lambda Expressions.
*/

interface Check{
	boolean check(int i);
}

public class EvenOdd{
	public static void main(String[] args){
		Check check = (n) -> {
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
	protected static void print(int n,Check c) {
		if(c.check(n)) {	
			if( (n %2) == 0 ) {System.out.println(n+" is even number.");}
			else System.out.println(n+" is odd number");
		}
		else {
			System.out.println("try next time.");
		}	
	}
	} 

 
