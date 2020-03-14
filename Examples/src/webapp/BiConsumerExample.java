package webapp;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String args[])
	{
		BiConsumer<String,String> con=(a,b)->System.out.println(a+b);
		con.accept("hello","hi");
		
	}
}
