
package stream.practice;
import java.util.stream.*;
import java.util.*;

public class FilterStream{

	public static void main(String[] args){
	
		IntStream s = IntStream.range(1,11);
		var l  = s.filter( i -> i%5 ==0).count();
			
		System.out.println(l);	
	}

}
