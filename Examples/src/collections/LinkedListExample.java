package collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String args[])
	{
		LinkedList ar=new LinkedList();
		int[] a= {10,20,30,40};
		ar.add("java");
		ar.add("Dotnet");
		ar.add("Selenium");
		ar.add("oracle");
		ar.add("10");
		ar.add("java");
		for(int x:a)
			System.out.println(x);
		System.out.println(ar);
		LinkedList ar1=new LinkedList();
		ar1.add("data science");
		ar1.add("python");
		ar1.add("big data");
		ar.addAll(ar1);//add
		System.out.println(ar);
		ar1.add("ruby");
		if(ar.containsAll(ar1))//contains("oracle")
			System.out.println("element found");
		else
			System.out.println("element not found");
		ar.remove("java");
		System.out.println("after removal"+ar);
		ar.retainAll(ar1);
		System.out.println(ar);
	}
}
