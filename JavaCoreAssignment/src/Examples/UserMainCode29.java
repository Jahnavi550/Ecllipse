package Examples;

public class UserMainCode29 {
	public static int removeElements(String a[],int m)
	{
		int size=a.length;
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()==m)
			{
				size--;
			}
		}
		return size;
	}
}