package webapp;
interface Sayable
{
	void say();
}
class Example
{
	public /*static*/ void saySomething()
	{
		System.out.println("i am saying something on references");
	}
}
public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example example=new Example();
		Sayable sayable=()->System.out.println("lambda expressions");
		sayable.say();
		//Sayable say1=Example::saySomething;
		Sayable say1=example::saySomething;
		say1.say();
	}

}
