package collections;

import java.util.ArrayList;

public class StreamMaxExample {
	public static void main(String args[])
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(2);
		ar.add(14);
		ar.add(6);
		Integer x=ar.stream().max((a,b)->a<b?-1:1).get();//min
				System.out.println(x);
	}
}
