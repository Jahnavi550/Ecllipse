package collections;

import java.util.ArrayList;

public class ArrayListExample7 {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("yellow");
		if(al.contains("red"))
			System.out.println("element found");
		else
			System.out.println("element not found");
	}
}
