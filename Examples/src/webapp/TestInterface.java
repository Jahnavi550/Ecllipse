package webapp;
/*interface Drawing
{
	public void draw();
}
public class TestInterface {
	public static void main(String args[])
	{
		Drawing circle=()->System.out.println("Circle is drawn");
		circle.draw();
	}
}*/

/*interface Drawing
{
	public int add(int a,int b);
}
public class TestInterface {
	public static void main(String args[])
	{
		Drawing maths=(a,b)->a+b;
		System.out.println("the addition is "+maths.add(10,20));
	}
}*/

interface Drawing
{
	public void draw(int a,int b,int c);
}
public class TestInterface {
	public static void main(String args[])
	{
		Drawing add=(a,b,c)->System.out.println(a+b+c);
		add.draw(10, 20, 30);
	}
}