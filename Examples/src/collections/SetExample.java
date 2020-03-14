package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
class Emply
{
	String num;
	String name;
	public Emply(String num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emply [num=" + num + ", name=" + name + "]";
	}
	
}
public class SetExample {
	public static void main(String args[])
	{
		//HashSet hs=new HashSet();
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("india");
		hs.add("china");
		hs.add("japan");
		hs.add(null);
		hs.add("america");
		hs.add("india");
		hs.add("japan");
		hs.add(null);
		System.out.println(hs);
		HashSet hs1=new HashSet();
		hs1.add(new Emply("101","janu"));
		hs1.add(new Emply("102","mjanu"));
		hs1.add(new Emply("103","mj"));
		hs1.forEach(System.out::println);
	}
}
