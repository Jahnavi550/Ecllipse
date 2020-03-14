package Examples;

import java.util.Scanner;

public class Main12 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int res=UserMainCode12.validatePassword(str);
		if(res==1)
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");
	}
}
