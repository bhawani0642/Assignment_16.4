//Importing the packages
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
//created a class FileDemo
public class FileDemo {

	public static void main(String[] args) {
		// Creating the object of file and passing the source file path
		File sourceFile = new File("D://heloo.txt");
		// passing the destination file path where it is to be copied
		File desFile = new File("D://vgt.txt");
		// Surrounding with try & catch
		try {
			// calling File.copy method
			Files.copy(sourceFile.toPath(), desFile.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Printing the message on successful
		System.out.println("File successfully copied!");
	}

}