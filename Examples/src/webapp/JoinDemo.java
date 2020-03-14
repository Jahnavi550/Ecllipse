package webapp;
class HelloThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Hello Thread");
		}
		try
		{
			sleep(0);
		}
		catch(Exception e) 
		{
			
		}
	}
}
public class JoinDemo {
	public static void main(String args[])throws Exception
	{
		HelloThread t=new HelloThread();
		t.start();
		t.join(); //t.yield();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
