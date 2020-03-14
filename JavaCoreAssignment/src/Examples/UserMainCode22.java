package Examples;

public class UserMainCode22 {
	public static int validateStrings(String str)
	{
		int b=-1;
		if(str.matches("(CTS)[-]{1}[0-9]{3}"))
				b=1;
		return b;
	}
}
