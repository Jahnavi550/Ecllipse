package webapp;
class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread Execution begins");
		for(int i=101;i<=200;i++)
			System.out.println(i);
		System.out.println("End of Thread Execution");
	}
}
public class ThreadExample {
	public static void main(String args[])
	{
		MyThread t=new MyThread();
		System.out.println("main method started execution");
		t.start();
		for(int j=1;j<=100;j++)
			System.out.println(j);
		System.out.println("main method completed execution");
		System.out.println("Thread prority is: "+t.getPriority());
	}
}
