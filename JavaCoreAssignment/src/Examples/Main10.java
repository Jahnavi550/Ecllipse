package Examples;

import java.util.Scanner;

public class Main10 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int res=UserMainCode10.validateTime(str);
		if(res==1)
			System.out.println("Valid time");
		else
			System.out.println("Invalid time");
	}
}