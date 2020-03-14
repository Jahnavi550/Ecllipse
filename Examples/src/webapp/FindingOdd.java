package webapp;

import java.util.Scanner;

public class FindingOdd {
	public static void main(String args[])
	{
		int i,n,sum=0;
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i+=2)
		{
			sum=sum+i;
		}
		System.out.println("The odd count is "+sum);
	}
}
