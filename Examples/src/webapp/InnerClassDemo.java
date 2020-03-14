package webapp;

public class InnerClassDemo {
	static class One
	{
		public int fact(int n)
		{
			int f;
			if((n==0)||(n==1))
				return 1;
			else 
				f=n*fact(n-1);
			return f;
		}
	}
	public void display()
	{
		One obj=new One();
		System.out.println(obj.fact(6));
	}
}
