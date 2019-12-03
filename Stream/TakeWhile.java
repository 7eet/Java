import java.util.stream.*;

public class TakeWhile {

	public static void main(String[] args) {
		
		Stream<Integer> integer = Stream.of(6,9,3,4,1,9,7,2);

		Stream<Integer> take = integer.takeWhile(x -> x != 1);   
		// when this function return true it exit.
		// it won't take any elements once this predicate function
		// return true	
	
		take.forEach(System.out::println);
	}

}
