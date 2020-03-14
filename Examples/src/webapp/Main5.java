package webapp;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter array size");
		int n= scanner.nextInt();
		System.out.println("Enter a array");
		int[] array=new int[10];
		 for(int i=0;i<n;i++)
		 {
			 array[i]=scanner.nextInt();
		 }
		 System.out.println("enter search element");
		 int element=scanner.nextInt();
		  System.out.println(UserMainCode5.binarySearch(array,element));

	}

}
