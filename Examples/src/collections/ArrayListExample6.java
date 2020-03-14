package collections;

import java.util.ArrayList;

public class ArrayListExample6 {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("yellow");
		System.out.println("before removing "+al);
		al.remove(3);
		System.out.println("after removing "+al);
	}
}
