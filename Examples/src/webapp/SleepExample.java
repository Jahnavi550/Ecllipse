package webapp;
class SleepThread extends Thread
{
	public void run()
	{
		try {
			for(int i=101;i<=200;i++)
			{
				System.out.println(i);
				this.sleep(400);
			}
			 System.out.println(this.getState());
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
public class SleepExample {
	public static void main(String args[])
	{
		 SleepThread t1=new  SleepThread();
		 t1.start();
		 System.out.println(t1.getState());
		 for(int i=1;i<=100;i++)
			 System.out.println(i);
		 System.out.println(t1.getState());
		 System.out.println(t1.getPriority());
		 System.out.println(t1.getName());
		 System.out.println(t1.getId());
		 System.out.println(t1.getThreadGroup());
		 System.out.println(t1.getDefaultUncaughtExceptionHandler());
	}
}
