package webapp;

import java.util.function.Function;

public class PreFunctionExample {
	public static void main(String args[])
	{
		Function<String,Integer> f1=s->s.length();
		System.out.println(f1.apply("india"));
		Function<Integer,Integer> f2=n->n*n;
		System.out.println(f2.apply(5));
		Function<Integer,Integer> fact= x->
		{
				int f=1;
				for(int i=2;i<=x;i++)
					f=f*i;
				return f;
		};
		System.out.println(fact.apply(5));
		Function<String,Integer> vowels=str->
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				count=count+1;
			return count;
		};
		System.out.println(vowels.apply("janu"));
		Function<String,Integer> blank=str->
		{
			int count=0;
			for(int i=0;i<str.length();i++)
				if(str.charAt(i)!=' ')
					count++;
			return count;
		};
		System.out.println(blank.apply("My name is janu"));
		
	}
}
