package Examples;

import java.util.Scanner;

public class Main15 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(UserMainCode15.getBigDiff(a));
	}
}
