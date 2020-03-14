package Examples;

import java.util.Scanner;

public class Main18 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		int n=s.nextInt();
		System.out.println(UserMainCode18.calculateElectricityBill(str1,str2,n));
	}
}
