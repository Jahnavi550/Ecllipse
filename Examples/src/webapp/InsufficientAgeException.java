package webapp;

public class InsufficientAgeException extends Exception{

	public InsufficientAgeException() {
		super("age is not sufficient");
	}

}
