package Examples;

public class UserMainCode31 {
	public static int addEvenOdd(int a[])
	{
		int n1=0,n2=0;
		for(int i=0;i<a.length;i++)
			if(a[i]%2==0)
				n1+=a[i]*a[i];
			else
				n2+=a[i]*a[i]*a[i];
		return n1+n2;
	}
}