package webapp;
public class InvalidAgeException extends Exception{
	public InvalidAgeException()
	{
		super("age is -ve or more than 100");
	}
}
