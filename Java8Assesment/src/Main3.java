import java.util.Scanner;
class UserMainCode3
{
	public static boolean checkTripplets(int a[])
	{
		boolean b = false;
		for (int i = 0; i < a.length - 1; i++)
		{
			if ((a[i] == a[i + 1]) && (a[i + 1] == a[i + 2])) 
			{
				b = true;
			}
		}
		return b;
	}
}
public class Main3 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		boolean res=UserMainCode3.checkTripplets(a);
		if(res)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
