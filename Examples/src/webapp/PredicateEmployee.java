package webapp;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employe
{
	String name;
	String desg;
	float sal;
	String city;
	public Employe(String name, String desg, float sal, String city) {
		super();
		this.name = name;
		this.desg = desg;
		this.sal = sal;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", desg=" + desg + ", sal=" + sal + ", city=" + city + "]";
	}
	public boolean equals(Object obj)
	{
		Employe e=(Employe)obj;
		if(name.equals(e.name)&&desg.equals(e.desg)&& sal<=e.sal&&city.equals(e.city))
		{
			return true;
		}
		else
			return false;
	}
}
public class PredicateEmployee {
	public static void main(String args[])
	{
		Employe e1=new Employe("Durga","CEO",30000,"Hyderabad");
		Employe e2=new Employe("Sunil","Manager",20000,"Hyderabad");
		Employe e3=new Employe("Malli","Manager",10000,"Banglore");
		Employe e4=new Employe("Kishore","Lead",15000,"Hyderabad");
		Employe e5=new Employe("karan","Lead",5000,"Banglore");
		Employe e6=new Employe("Anil","Developer",10000,"Hyderabad");
		Employe e7=new Employe("Karuna","Developer",10000,"Hyderabad");
		Employe e8=new Employe("Sunil","Developer",10000,"Banglore");
		
		Predicate<Employe> p1=emp->emp.desg.equals("Manager");
		Predicate<Employe> p2=emp->emp.city.equals("Banglore");
		Predicate<Employe> p3 = emp->emp.sal<=5000;
		
		ArrayList<Employe> list=new ArrayList<Employe>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		display(p2.and(p3),list);
	}
	public static void display(Predicate<Employe> p,ArrayList<Employe> list)
	{
		for(Employe e:list)
		{
			if(p.test(e))
			{
				System.out.println(e);
			}
		}
	}
}
