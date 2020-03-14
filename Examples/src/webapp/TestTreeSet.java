package webapp;
import java.util.TreeSet;
/*public class TestTreeSet {
	public static void main(String args[])
	{
		TreeSet tr=new TreeSet();
		tr.add("Apple");
		tr.add("Mango");
		tr.add("Banana");
		tr.add("Grapes");
		System.out.println(tr);
	}
}*/
class Employ implements Comparable<Employ>
{
	String name;
	String id;
	String dept;
	public Employ(String name, String id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	public int compareTo(Employ e)
	{
		if(name.compareTo(e.name)<0)
			return -1;
		else if(name.compareTo(e.name)>0)
			return 1;
		else
			return 0;
	}
	public String toString()
	{
		return name;
	}
}
public class TestTreeSet {
	public static void main(String args[])
	{
		TreeSet tr=new TreeSet();
		Employ e1=new Employ("mj","1001","Quality");
		Employ e2=new Employ("janu","1002","Finance");
		tr.add(e1);
		tr.add(e2);
		System.out.println(tr);
	}
}
