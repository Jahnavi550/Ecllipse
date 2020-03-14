package Examples;

import java.util.Scanner;

public class Main26 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int j=0;j<m;j++)
		{
			b[j]=s.nextInt();
		}
		int res=UserMainCode26.getSumOfIntersection(a,b);
		if(res==-1)
			System.out.println("No common elements");
		else
			System.out.println(res);
	}
}
