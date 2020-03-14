package JavaMCQ;

import java.util.Scanner;

public class SumOfAllDigitsInString {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String with digits");
		String str=s.next();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			if(Character.isDigit(a))
			{
				int b=Integer.parseInt(String.valueOf(a));
				sum+=b;
			}
		}
		System.out.println("The sum of digits present in the string is "+sum);
	}
}
