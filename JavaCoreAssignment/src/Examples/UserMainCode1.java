package Examples;
public class UserMainCode1 {
	public static int checkSum(int n)
	{
		int sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			if(rem%2!=0)
				sum=sum+rem;
			n=n/10;
		}
		if(sum%2==0)
			return 1;
		else
			return -1;
	}
}
