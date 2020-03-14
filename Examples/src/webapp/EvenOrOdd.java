package webapp;

public class EvenOrOdd {
	public void testNum(int num)throws EvenNumberException,OddNumberException
	{
		if(num%2==0)
			throw new EvenNumberException();
		else
			throw new OddNumberException();
	}
}
