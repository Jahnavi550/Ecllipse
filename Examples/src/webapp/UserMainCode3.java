package webapp;

public class UserMainCode3 {
	public static boolean isPrime(int number)
	{
		boolean flag=true;
		for(int x=2;x<=number/2;x++) {
			if(number%x==0)
			{
				flag=false;
			}
		}
		return flag;
	}

}
