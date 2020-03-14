package Examples;

import java.util.Scanner;

public class Main19 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int sum=UserMainCode19.sumOfDigits(str);
		if(sum==0)
			System.out.println(-1);
		else
			System.out.println(sum);
	}
}
