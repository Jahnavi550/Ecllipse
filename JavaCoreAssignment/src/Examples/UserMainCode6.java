package Examples;

public class UserMainCode6 {
	public static String formNewWord(String str,int n)
	{
		StringBuffer sb=new StringBuffer();
		sb.append(str.substring(0, n));
		sb.append(str.substring(str.length()-n));
		return sb.toString();
	}
}