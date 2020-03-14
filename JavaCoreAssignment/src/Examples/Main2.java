package Examples;
import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int b=UserMainCode2.validateNumber(str);
		if(b==1)
		{
			System.out.println("Valid number format");
		}
		else
		{
			System.out.println("Invalid number format");
		}
	}
}
