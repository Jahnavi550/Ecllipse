package Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderMarks {
	public static void main(String args[]) throws IOException
	{
		try(InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new  BufferedReader(isr))
		{
			System.out.println("Enter the subject1 marks");
			String m1=br.readLine();
			System.out.println("Enter the subject2 marks");
			String m2=br.readLine();
			System.out.println("Enter the subject3 marks");
			String m3=br.readLine();
			int m4=(Integer.parseInt(m1));
			int m5=(Integer.parseInt(m2));
			int m6=(Integer.parseInt(m3));
			int avg=(m4+m5+m6)/3;
			System.out.println("The average is "+avg);
		}
	}
}
