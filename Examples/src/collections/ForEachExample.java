package collections;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ForEachExample {
	public static void main(String args[])
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		Consumer<Integer> con=x->
		{
			if(x%2==0)
				System.out.println(x+" is even number");
			else
				System.out.println(x+" is odd number");
		};
		ar.add(10);
		ar.add(4);
		ar.add(3);
		ar.add(11);
		ar.add(6);
		ar.stream().forEach(con);
	}
}
