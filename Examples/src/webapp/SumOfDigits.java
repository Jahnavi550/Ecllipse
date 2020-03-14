package webapp;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=s.nextInt();
		int sum=digitSum(n);
		System.out.println("Sum of digits is "+sum);
	}
	public static int digitSum(int n)
	{
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		if(sum>=9)
			return digitSum(n);
		else
			return sum;
	}
}
