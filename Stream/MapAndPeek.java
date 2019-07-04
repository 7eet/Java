/*
 *   map(Function<T,R> f) - this an intermediate operation. Perform operation on the input
 *   								 and return the value. 
 *
 *   peek(Consumer<T> c) - this is an intermediate operation. Manily, It is used for
 *   				debugging purpose. 
 */
import java.util.*;
import java.util.stream.*;
public class MapAndPeek{

	public static void main(String[] arg){
	
		DoubleStream ds = DoubleStream.of(1.2,2.1,3.2,4.4,5.6,6.4,7.3,8.2,9.0,10.5);
		
	      ds.limit(10)
		  .peek(System.out::println)       // prints each element
		  .map(i -> i*5.0)              // subtract 5.0 from each element
		  .peek(System.out::println)       
		  .count();                         // counts element.	  
	
		  System.out.println();
		//  System.out.println(count);
	
	}


}
