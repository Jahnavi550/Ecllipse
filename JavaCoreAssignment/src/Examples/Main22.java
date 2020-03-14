package Examples;

import java.util.Scanner;

public class Main22 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int b=UserMainCode22.validateStrings(str);
		if(b==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
