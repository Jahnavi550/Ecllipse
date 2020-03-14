package Examples;

import java.util.Scanner;

public class Main9 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int res=UserMainCode9.validateDate(str);
		if(res==1)
			System.out.println("Valid date format");
		else
			System.out.println("Invalid date format");
	}
}