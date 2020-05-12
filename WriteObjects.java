package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		
		System.out.println("Writing Objects");
		
		Person[] person  = {new Person(419,"Prasad") ,new Person(555,"Pramela"), new Person(212,"Aashritha"), new Person(123,"Lathik") };
		
		//Person prameela1 = new Person(555,"Prameela");
		
		System.out.println(person);
		//System.out.println(prameela1);
		
		try(FileOutputStream fs = new FileOutputStream("People.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			//os.writeObject(prasad1);
			os.writeObject(person);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
