package webapp;

import java.util.Scanner;

public class ExceptionAssignment2 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		int index=s.nextInt();
		try
		{
			System.out.println("The array element at index " + index + " = " + a[index]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
	}
}
