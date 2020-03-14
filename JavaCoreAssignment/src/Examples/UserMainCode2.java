package Examples;
public class UserMainCode2 {
	public static int validateNumber(String str)
	{
		if(str.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
