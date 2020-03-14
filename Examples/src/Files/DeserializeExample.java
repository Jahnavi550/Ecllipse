package Files;

import java.io.*;
public class DeserializeExample {
	public static void main(String args[]) throws FileNotFoundException,IOException, ClassNotFoundException
	{
		ObjectInputStream in=null;
		String datafile="d://employeedata";
		try
		{
			in=new ObjectInputStream(new BufferedInputStream(new FileInputStream(datafile)));
			while(true)
			{
				Employee empobj=(Employee) in.readObject();
				empobj.printEmployee();
			}
		}
		catch(EOFException e)
		{
			
		}
	}
}
