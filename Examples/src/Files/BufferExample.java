package Files;
import java.io.*;
public class BufferExample {
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new  BufferedReader(isr);
		System.out.println("Enter your name");
		String name=br.readLine();
		System.out.println("Enter your city");
		String city=br.readLine();
		System.out.println("The name is "+name);
		System.out.println("The city is "+city);
	}
}
