package webapp;

import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates {
	public static int duplicates(int a[],int n)
	{
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}
		}
		a[j++]=a[n-1];
		System.out.println("Array elements After deleting duplicates");
		for(int i=0;i<j;i++)
		{
			System.out.println(a[i]);
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
				return sum;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter elements into array");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("after sorting the elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		RemoveDuplicates s=new RemoveDuplicates();
		int r=s.duplicates(a,n);
		System.out.println("sum is "+r);
	}
}
