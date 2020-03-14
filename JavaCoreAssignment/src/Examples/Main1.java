package Examples;
import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int b=UserMainCode1.checkSum(n);
		if(b==1)
			System.out.println("Sum of odd digits is even");
		else
			System.out.println("Sum of odd digits is odd");
	}
}
