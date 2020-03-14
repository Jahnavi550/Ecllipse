import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayListMarks {
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			al.add(s.next());
		}
		System.out.println(al);
		int max=0;
		String topper="";
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			String temp=(String)itr.next();
			StringTokenizer st=new StringTokenizer(temp,"-");
			String str=st.nextToken();
			int m1=Integer.parseInt(st.nextToken());
			int m2=Integer.parseInt(st.nextToken());
			int m3=Integer.parseInt(st.nextToken());
			int total=m1+m2+m3;
			if(total>=max)
			{
				max=total;
				topper=str;
			}
		}
		System.out.println("The total is :"+max);
		System.out.println("The topper is :"+topper);
	}
}
