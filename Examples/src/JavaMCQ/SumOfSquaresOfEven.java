package JavaMCQ;

import java.util.Scanner;

public class SumOfSquaresOfEven {
	public static void main(String args[])
	{
		int r,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a integer value");
		int n=s.nextInt();
		while(n>0)
		{
			r=n%10;
			if(r%2==0)
				sum=sum+r*r;
			n=n/10;
		}
		System.out.println("sum of squares of even digits is "+sum);
	}
}
