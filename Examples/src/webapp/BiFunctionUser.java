package webapp;

import java.util.function.BiFunction;

class Stud
{
	String name;
	String htno;
	public Stud(String name, String htno) {
		super();
		this.name = name;
		this.htno = htno;
	}
	@Override
	public String toString() {
		return "Stud [name=" + name + ", htno=" + htno + "]";
	}
	
}
public class BiFunctionUser {
	public static void main(String args[])
	{
		BiFunction<String,String,Stud> bi=(name,htno)->new Stud(name,htno);
		Stud s1=bi.apply("janu","101");
		System.out.println(s1);
	}
}
