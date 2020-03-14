package webapp;

import java.util.function.BiFunction;

public class BiFunctionExample {
	public static void main(String args[])
	{
		BiFunction<Integer,Integer,Integer> add=(a,b)->(a+b);
		BiFunction<Integer,Integer,Integer> sub=(a,b)->(a-b);
		BiFunction<Integer,Integer,Integer> prod=(a,b)->(a*b);
		System.out.println(add.apply(10, 20));
		System.out.println(sub.apply(20, 20));
		System.out.println(prod.apply(10, 20));
	}
}
