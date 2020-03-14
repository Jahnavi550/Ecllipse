package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample9 {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("yellow");
		System.out.println("original list"+al);
		List<String> al1=al.subList(0,2);
		System.out.println("portion of list"+al1);
	}
}
