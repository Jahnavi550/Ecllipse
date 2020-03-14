package Examples;

public class UserMainCode24 {
	public static int checkLargestAmongCorner(int a[])
	{
		int max=0;
		int first=a[0];
		int last=a[a.length-1];
		int middle=a[a.length/2];
		if(first>last&&first>middle)
			max=first;
		else if(middle>first&&middle>last)
			max=middle;
		else
			max=last;
		return max;
	}
}
