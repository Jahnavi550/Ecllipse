package webapp;
interface Car
{
	void acceleration();
	void speed();
	void colour();
}
class BMW implements Car
{
	public void acceleration()
	{
		System.out.println("bmw acceleration");
	}
	public void speed()
	{
		System.out.println("speed is high");
	}
	public void colour()
	{
		System.out.println("color is white");
	}
}
class Audi implements Car
{
	public void acceleration()
	{
		System.out.println("audi acceleration");
	}
	public void speed()
	{
		System.out.println("speed is medium");
	}
	public void colour()
	{
		System.out.println("color is black");
	}
}
public class TestCar {
	public static void main(String args[])
	{
		BMW bmw=new BMW();
		bmw.acceleration();
		bmw.speed();
		bmw.colour();
		Audi audi=new Audi();
		audi.acceleration();
		audi.speed();
		audi.colour();
	}
}
