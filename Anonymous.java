package tutorial1;

import tutorial1.Factory.plant;

class Factory {
	public void start() {
		System.out.println("factory machine started");
	}
	interface plant {
		public void grow();
	}
		
	}
public class Anonymous {

	public static void main(String[] args) {
		Factory machine1 = new Factory() {
			@override public void start() {
				System.out.println("overide factory machine started");
			}
		};
		machine1.start();
		plant plant1 = new plant() {
			@override public void grow() {
				System.out.println("Plant grows");
			}
		};
		plant1.grow();
	}

}
