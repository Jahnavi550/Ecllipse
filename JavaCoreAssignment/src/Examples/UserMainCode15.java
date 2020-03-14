package Examples;

import java.util.Arrays;

public class UserMainCode15 {
	public static int getBigDiff(int a[])
	{
		Arrays.sort(a);
		int n=a[a.length-1]-a[0];
		int b=a.length;
		if(b==1)
			n=a[0];
		return n;
	}
}
