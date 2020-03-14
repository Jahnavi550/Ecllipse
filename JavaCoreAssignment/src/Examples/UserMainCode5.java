package Examples;

public class UserMainCode5 {
	public static int checkCharacter(String str)
	{
		int res=-1;
		if(str.charAt(0)==str.charAt(str.length()-1))
			res=1;
		return res;
	}
}