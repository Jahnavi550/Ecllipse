package Examples;

import java.util.Scanner;

public class Main28 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		int b=UserMainCode28.validateIDLocations(str1,str2);
		if(b==1)
			System.out.println("Valid id");
		else
			System.out.println("Invalid id");
	}
}