package tutorial1;
class Machine1 {
	private String name;
	private int age;
	public Machine1() {
		System.out.println("First constructor running!");
		name = "prameela";
	}
	public Machine1(String name) {
		System.out.println("Second constructor running!");
		this.name = name;
	}
	public Machine1(String name, int code) {
		System.out.println("Third constructor running!");
		this.name = name;
		this.age = code;
	}
}
public class Constructor {

	public static void main(String[] args) {
	
         Machine1 machine1 = new Machine1();
         Machine1 machine2 = new Machine1("prasad");
         Machine1 machine3 = new Machine1("prameela" , 29);
	}

}
