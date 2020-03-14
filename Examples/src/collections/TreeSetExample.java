package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
class Emply1 implements Comparable<Emply1>
{
	String num;
	String name;
	public Emply1(String num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emply [num=" + num + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Emply1 emp) {
		// TODO Auto-generated method stub
		if(name.compareTo(emp.name)<0)
			return 1;
		else if(name.compareTo(emp.name)>0)
			return -1;
		else
			return 0;
	}
	
}
public class TreeSetExample {
	public static void main(String args[])
	{
		Set hs=new TreeSet();
		hs.add("india");
		hs.add("china");
		hs.add("japan");
		hs.add("america");
		hs.add("india");
		hs.add("japan");
		System.out.println(hs);
		TreeSet hs1=new TreeSet();
		hs1.add(new Emply1("201","janu"));
		hs1.add(new Emply1("302","mjanu"));
		hs1.add(new Emply1("103","Anu"));
		System.out.println(hs1);
		
	}
	
}
