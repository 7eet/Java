package service.implTwo;
import service.api.MyServiceInterface;

public class Two implements MyServiceInterface {
	@Override
	public void runService() {
		System.out.println("In Two Implementation.");
	}
}
