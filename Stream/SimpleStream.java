
/*
*
*	This program shows some basic operation of stream 
*
*	filter()  - this is an intermediate operation, this takes 
*		Function<T,R> functional interface. It performs operation *		on T and return result R.
* 
*	count()   - this is an terminal operation . It counts elements in a *		   stream and return value of type "long". 
*/


package stream.practice;
import java.util.stream.*;
import java.util.*;

public class SimpleStream{

	public static void main(String[] args){
		Integer[] i = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list = Arrays.asList(i);
	
		long l = list.stream()       // get stream from source
		  .filter(integer -> integer % 3 == 0) //intermediate operation. It filter only which are divisible by 3.
	            .count();          // terminal operation. 

		System.out.println(l);

	}

}
