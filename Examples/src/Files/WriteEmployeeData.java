package Files;

import java.io.IOException;
import java.io.*;

public class WriteEmployeeData {
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("D://emp.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream out=new DataOutputStream(bos);
		
		out.writeInt(1);
		out.writeUTF("janu");
		out.writeDouble(5000.00);
		
		out.writeInt(2);
		out.writeUTF("mjanu");
		out.writeDouble(10000.00);
		
		out.writeInt(3);
		out.writeUTF("janum");
		out.writeDouble(15000.00);
		
		out.writeInt(4);
		out.writeUTF("mj");
		out.writeDouble(25000.00);
		System.out.println("objects written to file");
	}
}
