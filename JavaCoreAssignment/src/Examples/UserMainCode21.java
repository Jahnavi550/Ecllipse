package Examples;

public class UserMainCode21 {
	public static int validateColorCode(String str)
	{
		int b=-1;
		if(str.matches("(#)[A-F0-9]{6}"))
				b=1;
		return b;
	}
}
