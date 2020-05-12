package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		
		System.out.println("Reading Objects");
		
		try(FileInputStream fi = new FileInputStream("People.bin")){
			
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Person[] person1 = (Person[])oi.readObject();
			
			for(Person person : person1) {
				System.out.println(person);
				
			}
			//Person person2 = (Person)oi.readObject();
			
			//System.out.println(person2);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
