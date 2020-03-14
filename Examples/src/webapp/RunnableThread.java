package webapp;
class MyRunThread implements Runnable
{
	public void run()
	{
		for(int i=101;i<=200;i++)
		{
			System.out.println(i);
		}
	}
	public int getPriority()
	{
		return 1;
	}
}
public class RunnableThread {
	public static void main(String args[])
	{
		Runnable r=()->{
			for(int i=101;i<=200;i++)
				System.out.println(i);
		};
		MyRunThread t=new MyRunThread();
		Thread t1=new Thread(r);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
	}
}
