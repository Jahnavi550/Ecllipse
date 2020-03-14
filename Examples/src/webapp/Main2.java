package webapp;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a value");
		int a=scanner.nextInt();
		System.out.println("enter b value");
		int b=scanner.nextInt();
		System.out.println("enter c value");
		int c=scanner.nextInt();
		System.out.println(UserMainCode2.findRoots(a, b, c));
	}

}
