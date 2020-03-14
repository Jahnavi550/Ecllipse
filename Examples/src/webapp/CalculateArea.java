package webapp;

public class CalculateArea {
	public void CalculateArea(int s)
	{
		System.out.println("Area of square is "+(s*s));
	}
	public void CalculateArea(int l,int b)
	{
		System.out.println("Area of rectangle is "+(l*b));
	}
	public void CalculateArea(int a,int b,int c)
	{
		System.out.println("Area of triangle is "+(a+b+c));
	}
}
