package webapp;

import java.util.Scanner;

public class SumOfThreeElements {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		System.out.println("Enter b value");
		int b=s.nextInt();
		System.out.println("Enter c value");
		int c=s.nextInt();
		if((a==13) && (b==13) && (c==13))
		{
			System.out.println("Sum is "+0);
		}
		else if((a==13) && (b!=13) && (c!=13))
		{
			System.out.println("Sum is "+c);
		}
		if((a==13) && (b!=13) && (c==13))
		{
			System.out.println("Sum is "+a);
		}
		if((a==13) && (b==13) && (c!=13))
		{
			System.out.println("Sum is "+(a+b));
		}
	}
}
