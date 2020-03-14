package Examples;

public class UserMainCode12 {
	public static int validatePassword(String str)
	{
		int res=-1;
		if(str.matches(".*[0-9]{1,}.*")&&str.matches(".*[@#$]{1,}.*")&&str.length()>=6&&str.length()<=20)
			return 1;
		else			
			return -1;
	}
}
