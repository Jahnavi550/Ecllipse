package webapp;

public class FibAndPrime {
	public int fib(int n)
	{
		if((n==0)||(n==1))
			return n;
		else
			return(fib(n-1)+fib(n-2));
	}
	public void prime(int n)
	{
		boolean temp=true;
		for(int i=2;i<n/2;i++)
		{
			if(n%2==0)
			{
				temp=false;
				break;
			}
		}
		if(temp)
			System.out.println("given number is prime");
		else
			System.out.println("given number is not prime");
	}
	public static void main(String args[])
	{
		FibAndPrime f=new FibAndPrime();
		f.fib(0);
		f.prime(3);
	}
}
