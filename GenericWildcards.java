package tutorial1;
import java.util.ArrayList;

class Machine{

	@Override
	public String toString() {
		return "Iam a Machine";
	}
	
	public void start() {
		System.out.println("Machine Starting");
	}
	
}

class Camera extends Machine {

	@Override
	public String toString() {
		return "Iam a camera";
	}
	
	public void snap() {
		System.out.println("Snapped photo");
		
	}
	
}
public class GenericWildcards {

	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		
		list1.add(new Machine());
		list1.add(new Machine());
		
        ArrayList<Camera> list2 = new ArrayList<Camera>();
		
		list1.add(new Camera());
		list1.add(new Camera());
		
		ShowList(list2);
		ShowList2(list1);
		
			
	}
	
	public static void ShowList(ArrayList<? extends Machine> list) {
		for(Machine value: list) {
			System.out.println(value);
			value.start();
		}
	}
	public static void ShowList2(ArrayList<? super Camera> list) {
		for(Object value: list) {
			System.out.println(value);
		}
	}
	
}
