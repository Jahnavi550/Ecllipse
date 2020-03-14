package collections;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamSortedExample {
	public static void main(String args[])
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(4);
		ar.add(10);
		ar.add(3);
		ar.add(11);
		ar.add(6);
		ar.add(3);
		//ar.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		long cnt=ar.stream().distinct().count();
		System.out.println(cnt);
	}
}
