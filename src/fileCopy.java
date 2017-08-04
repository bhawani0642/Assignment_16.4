import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileCopy {

	public static void main(String[] args) throws IOException {
		String strSourceFile= "E:\\MyFile.txt";
		String strCopyFile="E:\\MyFile1.txt";
		//create FileInputStream object for source file
        FileInputStream fin = new FileInputStream(strSourceFile);
        //create FileOutputStream object for destination file
        FileOutputStream fout = new FileOutputStream(strCopyFile);
       
        byte[] b = new byte[1024];
        int noOfBytes = 0;
       
        System.out.println("Copying file using streams");
       
        //read bytes from source file and write to destination file
        while( (noOfBytes = fin.read(b)) != -1 )
        {
                fout.write(b, 0, noOfBytes);
        }
       
        System.out.println("File copied!");
       
        //close the streams
        fin.close();
        fout.close();  

	}

}

