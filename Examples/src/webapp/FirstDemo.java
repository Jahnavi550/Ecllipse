package webapp;

public class FirstDemo extends FirstInterface.A implements InnerDemo.A{
	public void greater(int a,int b)
	{
		int c;
		c=(a>b)?a:b;
		System.out.println("the greater is "+c);
	}
	public static void main(String args[])
	{
		FirstDemo obj=new FirstDemo();
		obj.display();
		obj.greater(10, 3);
	}
}
