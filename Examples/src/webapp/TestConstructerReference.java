package webapp;
interface TestMessage
{
	public void printMessage(String str);
}
class Message
{
	Message(String msg)
	{
		System.out.println("message :"+msg);
	}
}
public class TestConstructerReference {
	public static void main(String args[])
	{
		TestMessage tst=Message::new;
		tst.printMessage("Lambda Expression");
	}
}
