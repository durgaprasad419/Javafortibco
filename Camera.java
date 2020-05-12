package abstractclass;

public class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Camera started.");
		
	}

	@Override
	public void action() {
		System.out.println("Captured Photos.");
		
	}

	@Override
	public void stop() {
		System.out.println("Camera Stopped.");
		
	}
	

}
