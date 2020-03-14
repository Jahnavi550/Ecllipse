package Examples;

public class UserMainCode27 {
	public static int validatePassword(String str)
	{
		int res=0;
		if(str.length()>=8 && str.matches("[^0-9|@|_|#].*[@|_|#].*[^@|_|#]"))
			res=1;
		return res;
	}
}
