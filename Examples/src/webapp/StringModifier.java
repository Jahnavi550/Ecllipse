package webapp;

import java.util.Scanner;

public class StringModifier {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter a string");
		str=s.nextLine();
		if((str.charAt(0)!='j')&&(str.charAt(1)!='b'))
		{
			System.out.println("the modified string is "+str.substring(2,str.length()));
		}
		else
		{
			System.out.println("the modified string is "+str);
		}
	}
}
