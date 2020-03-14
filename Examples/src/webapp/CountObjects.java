package webapp;

public class CountObjects {
	static int count=0;
	{
		count=count+1;
	}
	public void CountObjects()
	{
		System.out.println("The number of objects created is " +count);
	}
}
