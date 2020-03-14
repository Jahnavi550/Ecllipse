package webapp;

public class MaxNumbers {
	
	class One
	{
		public int large()
		{
			int a[]= {10,20,30,40,50};
			int max=a[0];
			for(int i=1;i<a.length;i++)
			{
				if(max<a[i])
					max=a[i];
			}
			return max;
		}
	}
	public void show()
	{
	One obj=new One();
	System.out.println(obj.large());
	}
}
