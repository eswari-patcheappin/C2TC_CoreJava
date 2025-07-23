package Day3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
public class BufferedReaderFile {
	public static void main(String args[])throws IOException{
		URL resource = BufferedReaderFile.class.getResource("mvit.txt");
		if(resource==null) {
			System.err.println("File not found or File is empty");
		}
		//converstion of URL into file object
		File f= new File(resource.getFile());
		//Object creation of the file reader
		FileReader fr = new FileReader(f);
		//object creation for buffer reader
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		System.out.println(line);
		br.close();
	}
}
