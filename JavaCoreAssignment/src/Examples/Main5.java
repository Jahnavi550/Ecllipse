package Examples;

import java.util.Scanner;

public class Main5 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int res=UserMainCode5.checkCharacter(str);
		if(res==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}