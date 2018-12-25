/*
*		tricky in indentation
*/
public class NestedIfElse {
	public static void main(String[] args){
		int score = 110;
		if (score > 200)                                                // line 1 
			if (score <400)                                          // line2 
				if (score > 300)                                 // line 3
					System.out.println("1");
				else                                                     // line 4
					System.out.println("2");

		else                                                                         //line 5
			System.out.println("3");
	}
	
	// above code prints nothing.
	// Because else(line 5) is the part of if(at line 2).  
}
