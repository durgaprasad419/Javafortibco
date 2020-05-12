package tutorial1;
class Person {
	String name;
	int age;	
	void speak() {
		System.out.println("My name is " + name + "  And Iam " + age + " Years old");
	}
}
public class ClassDecleration {

	public static void main(String[] args) {
		
       Person person1 = new Person();
       person1.name = "S Durga Prasad";
       person1.age = 34;
       person1.speak();
       Person person2 = new Person();
       person2.name = "S prameela";
       person2.age = 29;
       person2.speak();
       Person person3 = new Person();
       person3.name = "S Aashritha";
       person3.age = 9;
       person3.speak();
       Person person4 = new Person();
       person4.name = "S Lathik Veera Prasanth";
       person4.age = 5;
       person4.speak();
       System.out.println(person1.name);
       System.out.println(person1.age);
       System.out.println(person2.name);
       System.out.println(person2.age);
       System.out.println(person3.name);
       System.out.println(person3.age);
       System.out.println(person4.name);
       System.out.println(person4.age);
	}

}
