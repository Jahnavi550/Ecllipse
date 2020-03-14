package Examples;

public class UserMainCode25 {
	public static int calculateNcr(int n,int r)
	{
		int i,prod=1,prod1=1,prod2=1;
		for(i=1;i<=n;i++)
		{
			prod=prod*i;
		}
		for(i=1;i<=r;i++)
		{
			prod1=prod1*i;
		}
		int diff=n-r;
		for(i=1;i<=diff;i++)
		{
			prod2=prod2*i;
		}
		int dem=prod1*prod2;
		int res=prod/dem;
		return res;
	}
}
