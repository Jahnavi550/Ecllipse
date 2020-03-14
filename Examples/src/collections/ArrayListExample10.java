package collections;

import java.util.ArrayList;

public class ArrayListExample10 {
	public static void main(String args[])
	{
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("red");
		al1.add("blue");
		System.out.println(al1);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("green");
		al2.add("yellow");
		System.out.println(al2);
		al1.addAll(al2);
		System.out.println("after adding"+al1);
	}
}
