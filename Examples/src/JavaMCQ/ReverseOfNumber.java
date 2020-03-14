package JavaMCQ;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String args[])
	{
		int r,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a integer value");
		int n=s.nextInt();
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("reverse of a number is "+rev);
	}
}
