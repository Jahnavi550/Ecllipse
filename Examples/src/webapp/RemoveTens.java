package webapp;

import java.util.Scanner;
class TestRemoveTens
{
	public void FindTens(int a[],int b[],int n)
	{
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=10)
			{
				b[j]=a[i];
				j++;
			}
		}
		for(int i=j;i<n;i++)
		{
			b[i]=0;
		}
		System.out.println("Elements after removing 10's and replacing with 0's are");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
		int size=b.length;
		System.out.println("after deleting 10's the array size is :"+size);
	}
}
public class RemoveTens {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter elements into array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int size=a.length;
		System.out.println("before deleting 10's the array size is :"+size);
		TestRemoveTens obj=new TestRemoveTens();
        obj.FindTens(a,b,n);
	}
}
