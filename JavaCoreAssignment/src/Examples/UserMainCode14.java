package Examples;

public class UserMainCode14 {
	public static int getSumOfPower(int n,int a[])
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=(int)(sum+Math.pow(a[i], i));
		}
		return sum;
	}
}
