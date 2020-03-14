package Examples;

public class UserMainCode26 {
	public static int getSumOfIntersection(int a[],int b[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					sum=sum+a[i];
				}
			}
		}
		if(sum==0)
			return -1;
		else
			return sum;
	}
}
