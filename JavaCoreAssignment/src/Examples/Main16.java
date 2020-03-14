package Examples;

import java.util.Scanner;

public class Main16 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=s.next();
		}
		String str1=s.next();
		UserMainCode16.getElementPosition(str,str1);
	}
}
