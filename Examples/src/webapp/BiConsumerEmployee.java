package webapp;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class TempEmp
{
	String name;
	double salary;
	public TempEmp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
public class BiConsumerEmployee {
	public static void main(String args[])
	{
		ArrayList<TempEmp> l=new ArrayList<TempEmp>();
		l.add(new TempEmp("Durga",1000));
		l.add(new TempEmp("Sunny",2000));
		l.add(new TempEmp("Bunny",3000));
		l.add(new TempEmp("Chinny",4000));
		BiConsumer<TempEmp,Double> c=(e,d)->e.salary=e.salary+d;
		for(TempEmp e:l)
		{
			c.accept(e,500.0);
		}
		for(TempEmp e:l)
		{
			System.out.println(e.name);
			System.out.println(e.salary);
		}
	}
}
