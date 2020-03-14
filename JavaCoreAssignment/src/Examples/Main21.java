package Examples;

import java.util.Scanner;

public class Main21 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int b=UserMainCode21.validateColorCode(str);
		if(b==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
