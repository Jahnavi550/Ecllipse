package Examples;

public class UserMainCode20 {
	public static String concatString(String str1,String str2)
	{
		StringBuffer sb=new StringBuffer();
		int n=str2.length();
		sb.append(str1.substring(str1.length()-n));
		sb.append(str2.substring(0));
		return sb.toString();
	}
}
