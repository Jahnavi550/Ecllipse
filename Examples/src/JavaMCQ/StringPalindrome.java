package JavaMCQ;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String args[])
	{
		String rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("The given string is palindrome");
		else
			System.out.println("The given string is not palindrome");
		String a=rev;
		int sum=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
			{
				sum=sum+1;
			}
		}
		if(sum>=2)
			System.out.println("valid");
		else
			System.out.println("not valid");
			
	}
}
