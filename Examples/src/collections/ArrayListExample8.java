package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample8 {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("yellow");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("after sorting "+al);
	}
}
