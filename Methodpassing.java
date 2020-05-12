package tutorial1;

class Robot{
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int height) {
		System.out.println("jumping " + height + " meters");
	}
	public void move(String direction , double distance) {
		System.out.println("Moving " + distance + " meters  Towards direction " + direction );
	}
}
public class Methodpassing {

	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi Iam sam");
        sam.jump(8);
        sam.move("east", 22.4);
        
	}

}
