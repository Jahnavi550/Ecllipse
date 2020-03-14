package Files;

import java.io.IOException;
import java.io.*;
class Employee implements Serializable
{
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public void printEmployee()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
	}
}
public class SerialExample {
	public static void main(String args[]) throws IOException
	{
		String datafile="D://employeedata";
		ObjectOutputStream out=null;
		try
		{
			Employee empobj1=new Employee(1,"janu",2000.00);
			Employee empobj2=new Employee(2,"mjanu",5000.00);
			out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(datafile)));
			out.writeObject(empobj1);
			out.writeObject(empobj2);
		}
		finally
		{
			if(out!=null)
			{
				out.close();
			}
		}
		System.out.println("object state is saved");
	}
}
