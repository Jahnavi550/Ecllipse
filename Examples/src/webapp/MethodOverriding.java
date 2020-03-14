package webapp;
class Base
{
	public void firstMethod()
	{
		System.out.println("Inside the first method");
	}
}
class Derived extends Base
{
	@Override
	public void firstMethod()
	{
		System.out.println("Inside the first method");
	}
	public void secondMethod()
	{
		System.out.println("Inside the second method");
	}
}
public class MethodOverriding {
	public static void main(String args[])
	{
		Derived d=new Derived();
		d.firstMethod();
	}
}
