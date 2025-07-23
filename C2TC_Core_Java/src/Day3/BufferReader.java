package Day3;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferReader {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int id=Integer.parseInt(br.readLine());
	}
}
