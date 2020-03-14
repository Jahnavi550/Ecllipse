package Examples;

import java.util.StringTokenizer;

public class UserMainCode34 {
	public static String fileIdentifier(String str)
	{
		StringTokenizer t=new StringTokenizer(str,".");
		String s1=t.nextToken();
		String s2=t.nextToken();
		return s2;
	}
}
