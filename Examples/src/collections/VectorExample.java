package collections;

import java.util.Vector;

public class VectorExample {
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.addElement("india");
		v.addElement("china");
		v.add("japan");
		v.addElement("nepal");
		System.out.println(v);
		v.insertElementAt("america", 1);
		System.out.println(v);
		v.remove(2);
		v.removeElementAt(3);
		System.out.println(v);
	}
}
