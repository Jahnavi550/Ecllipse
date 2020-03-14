package webapp;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int sum=0;
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements into array");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter a digit");
		int n1=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]>n1)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("The sum of the array is "+sum);
		int n2=sum,r;
		int rev=0;
		while(n2>0)
		{
			r=n2%10;
			rev=rev*10+r;
			n2=n2/10;
		}
		System.out.println("The reverse of the sum is "+rev);
	}
}
