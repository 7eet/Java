package consumer.main;
import service.api.MyServiceInterface;
import java.util.*;
public class Main {
	public static void main(String... args) {
		Iterable<MyServiceInterface> it = ServiceLoader.load(MyServiceInterface.class);
		for(MyServiceInterface service : it) {
			System.out.println("Provider: " +service.getClass());
			service.runService();
			System.out.println();
		}
	}
}
