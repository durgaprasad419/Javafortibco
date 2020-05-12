package tutorial1;

class Man{
	String name;
	int age;
	void speak() {
		System.out.println("This is a method");
	}
	void retirement() {
		int retireage = 65-age;
		System.out.println(retireage);
		
	}
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
}
public class Methods {

	public static void main(String[] args) {
		Man person1 = new Man();
		person1.name = "S Durga Prasad";
		person1.age = 34;
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println("Your Service years are");
		person1.retirement();
		int age = person1.getAge();
		String name = person1.getName();
		System.out.println("Your name is:" + name);
		System.out.println("Your age is:" + age);
	}

}
