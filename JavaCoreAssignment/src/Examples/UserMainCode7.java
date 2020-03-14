package Examples;

public class UserMainCode7 {
	public static int reverseNumber(int n)
	{
		int rev=0;
		while(n>0)
		{
			int dig=n%10;
			rev=rev*10+dig;
			n=n/10;
		}
		return rev;
	}
}