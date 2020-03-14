package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		Function<Integer,Integer> f=x->x*2;
		ar.add(0);
		ar.add(5);
		ar.add(10);
		ar.add(12);
		ar.add(18);
		ar.add(20);
		ar.stream().map(f).forEach(System.out::println);
		List list=ar.stream().map(x->x*3).collect(Collectors.toList());
		System.out.println(list);
	}

}
