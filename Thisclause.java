package tutorial1;

class People{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Thisclause {

	public static void main(String[] args) {
		People man = new People();
		man.setName("prasad");
		man.setAge(34);
		System.out.println(man.getName());
		System.out.println(man.getAge());

	}

}
