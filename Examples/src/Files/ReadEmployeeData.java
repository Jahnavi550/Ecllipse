package Files;

import java.io.*;
import java.io.IOException;

public class ReadEmployeeData {
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis=new FileInputStream("D://emp.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream in=new DataInputStream(bis);
		double total=0.0;
		try
		{
			while(true)
			{
				int eno=in.readInt();
				String ename=in.readUTF();
				double sal=in.readDouble();
				total=total+sal;
				
				System.out.println("Emp no= "+eno);
				System.out.println("Emp name= "+ename);
				System.out.println("Emp sal= "+sal);
			}
		}
		catch(EOFException e)
		{
			System.out.println(total);
		}
		in.close();
		bis.close();
		fis.close();
	}
}
