package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
	public static void main(String args[])
	{
		ArrayList ar=new ArrayList();
		ar.add("java");
		ar.add("Dotnet");
		ar.add("Selenium");
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
		ArrayList ar1=new ArrayList();
		ar1.add("java");
		ar1.add("Dotnet");
		ar1.add("3");
		Collections.copy(ar1,ar);
		//System.out.println(ar1);
		//Collections.fill(ar,"language");
		System.out.println(ar);
		boolean flag=Collections.disjoint(ar1, ar);
		System.out.println(flag);
	}
}
