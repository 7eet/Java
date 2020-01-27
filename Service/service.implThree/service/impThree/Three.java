package service.implThree;
import service.api.MyServiceInterface;

public class Three implements MyServiceInterface {
	@Override
	public void runService() {
		System.out.println("In Three implementation.");
	}
}
