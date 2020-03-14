package webapp;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scanner.nextInt();
		System.out.println(UserMainCode3.isPrime(number));
	}

}
