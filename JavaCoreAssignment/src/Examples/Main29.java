package Examples;

import java.util.Scanner;

public class Main29 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		String[] a=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextLine();
		}
		int m=s.nextInt();
		System.out.println(UserMainCode29.removeElements(a,m));
	}

}