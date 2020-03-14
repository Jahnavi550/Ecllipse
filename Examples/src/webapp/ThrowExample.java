package webapp;

import java.util.Scanner;

class Test
{
	public static float testMethod()
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
		a=sc.nextInt();
		System.out.println("Enter second value");
		b=sc.nextInt();
		if(b==0)
			throw new java.lang.StringIndexOutOfBoundsException();
		else 
			return b/a;
	}
}

public class ThrowExample {
	public static void main(String args[])
	{
		try 
		{
			float k=Test.testMethod();
			System.out.println(k);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
