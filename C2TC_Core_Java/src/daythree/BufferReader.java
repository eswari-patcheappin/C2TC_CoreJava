package daythree;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferReader {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int id=Integer.parseInt(br.readLine());
		System.out.println("ID: "+id+" name: "+name);
	}
}
