package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
	public static void main(String args[])
	{
		ArrayList ar=new ArrayList();
		ar.add("java");
		ar.add("Dotnet");
		ar.add("Selenium");
		System.out.println(ar);
		ListIterator itr=ar.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		while(itr.hasPrevious())
		System.out.println(itr.previous());
		/*Student s1=new Student("janu",123);
		Student s2=new Student("mj",1234);
		Student s3=new Student("janu",12345);
		ArrayList<Student> ar=new ArrayList<Student>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		Iterator itr=ar.iterator();
		/*while(itr.hasNext())
			System.out.println(itr.next());
		for(Student s:ar)
		{
			System.out.println(s.htno+" "+s.name);
		}*/
		//ar.forEach(System.out::println);
	}
}
