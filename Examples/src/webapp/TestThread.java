package webapp;
/*class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("Inside the thread");
	}
}*/
public class TestThread {
	public static void main(String args[])
	{
		/*MyThread t1=new MyThread();
		Thread t=new Thread(t1);
		t.start();*/
		
		Runnable runnable=()->System.out.println("Inside the thread");
		Thread t=new Thread(runnable);
		t.start();
	}
}
