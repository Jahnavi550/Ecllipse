package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("yellow");
		Iterator itr=al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
