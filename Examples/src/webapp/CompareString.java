package webapp;

import java.util.Scanner;

public class CompareString {
	public boolean compare(String str1,String str2,int n)
	{
		StringBuffer sbf = new StringBuffer(str2);
		sbf.reverse().toString();
		if((str1.charAt(n))==sbf.charAt(n))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String str1=sc.nextLine();
		System.out.println("Enter 2nd String");
		String str2=sc.nextLine();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		CompareString c=new CompareString();
		boolean r=c.compare(str1,str2,n);
		System.out.println(r);
	}
}
