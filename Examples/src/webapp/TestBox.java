package webapp;

class Box2D
{
	int l;
	int b;
	int area;
	Box2D()
	{
		l=2;
		b=4;
	}
	public void calArea()
	{
		area=l*b;
		System.out.println("The area is "+area);
	}
}
class Box3D extends Box2D
{
	int h;
	Box3D()
	{
		h=3;
	}
	public void calVolume()
	{
		int vol=area*h;
		System.out.println("The volume is "+vol);
	}
}
public class TestBox {
	public static void main(String args[])
	{
		Box3D b=new Box3D();
		b.calArea();
		b.calVolume();
	}
}
