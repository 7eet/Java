package stream.practice;
import java.util.stream.*;
import java.util.*;

public class OptionalClassDemo{

	public static void main(String[] args){

		Optional<String> optionalString = Optional.of("This");    // create optional object

		Optional<Double> optionalDouble = Optional.ofNullable(null);  // empty optional object.
  		
		optionalString.ifPresent(System.out::println);
		optionalDouble.ifPresent(System.out::println);
		
		System.out.println(optionalDouble.orElse(0.0));


		// for string
	
		if(optionalString.isPresent()) System.out.println("Optional<String> :"+optionalString.get());
		else
			System.out.println("Optional<String> :"+"It's empty.");

		// for double 
		if(optionalDouble.isPresent()) System.out.println(optionalDouble.get());

		else System.out.println("Optional<Double> :"+"It null");	
	}
}
