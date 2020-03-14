package Examples;

public class UserMainCode17 {
	public static int addSeries(int n)
	{
		int i=0,es=0,os=0,sum=1;
		if(n==1)
		{
			sum=n;	
		}
		for(i=3;i<=n;i+=4)
		{
			os=os+i;
		}
		for(i=5;i<=n;i+=4)
		{
			es=es+i;
		}
		sum+=os-es;
		return sum;
	}
}
