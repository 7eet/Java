/*
*	This program gives an compilation error because, else part is started without
*	 if part.
*/
public class IfElse {
	public static void main(String[] args){
		boolean allow = false;
		if (allow = true)                    // (=)assignment operator not equals operator.
			System.out.println("value is true");
			System.out.println("OPPSS");               // execute after if block.
		else
			System.out.println("value is false");
	}
}
