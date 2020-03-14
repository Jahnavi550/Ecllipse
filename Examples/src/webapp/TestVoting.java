package webapp;

import java.util.Scanner;

public class TestVoting {
	public static void main(String args[])
	{
		int age;
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		Voting v=new Voting();
		try
		{
			v.testAge(age);
		}
		catch(InsufficientAgeException e)
		{
			System.out.println(e);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}
}
