package Examples;

import java.util.Scanner;

public class Main27 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int res=UserMainCode27.validatePassword(str);
		if(res==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
