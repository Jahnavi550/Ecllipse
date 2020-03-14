package webapp;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter array a size");
		int n= scanner.nextInt();
		System.out.println("Enter a array");
		int[] a=new int[10];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=scanner.nextInt();
		 }
			System.out.println("enter array b size");
			int m= scanner.nextInt();
			System.out.println("Enter b array");
			int[] b=new int[10];
			 for(int j=0;j<m;j++)
			 {
				 b[j]=scanner.nextInt();
			 }
		  System.out.println(UserMainCode6.compareArray(a,b));

	}

}
