package collections;

import java.util.ArrayList;

public class ArrayListExample12 {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("yellow");
		for(int i=0;i<al.size();i++)
		System.out.println(al.get(i));
	}
}
