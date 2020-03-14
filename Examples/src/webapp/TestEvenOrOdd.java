package webapp;

import java.util.Scanner;

public class TestEvenOrOdd {
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		EvenOrOdd o=new EvenOrOdd();
		try
		{
			o.testNum(num);
		}
		catch(EvenNumberException e)
		{
			System.out.println(e);
		}
		catch(OddNumberException e)
		{
			System.out.println(e);
		}
	}
}
