package tutorial1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader {

	public static void main(String[] args) {
		
		File filename = new File("test2.txt");
		BufferedReader br= null;
		try {
			FileReader fr = new FileReader(filename);
			 br = new BufferedReader(fr);
			 String line;
			 while((line=br.readLine()) != null) {
				 System.out.println(line);
			 }
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found :" + filename.toString());
		} catch (IOException e) {
			System.out.println("Unable to read the file :" + filename.toString());
		}
		finally {
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("unable to close the file: " + filename.toString());
		} catch (NullPointerException ex) {
			
		}
		 
		}
	}

}
