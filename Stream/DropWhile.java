import java.util.stream.*;

public class DropWhile {

	public static void main(String[] args) {
		
		Stream<Integer> integer = Stream.of(6,9,3,4,1,9,7,2);

		Stream<Integer> drop = integer.dropWhile(x -> x != 1);   
		// once this predicate function returns true	
		// it starts to take  elements
	
		drop.forEach(System.out::println);
	}

}
