package webapp;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String args[])
	{
		Consumer<String> c=s->System.out.println(s);
		c.accept("Hello");
		c.accept("janu");
		
		Consumer<Integer> p=x->
		{
			if(x>=20)
				System.out.println("greater than 20");
			else
				System.out.println("less than 20");
		};
		p.accept(10);
	}
}
