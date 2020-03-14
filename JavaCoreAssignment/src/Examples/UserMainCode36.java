package Examples;

import java.util.StringTokenizer;

public class UserMainCode36 {
	public static String nameFormatter(String str)
	{
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(str,",");
		String str1=st.nextToken();
		String str2=st.nextToken();
		sb.append(str2);
		//sb.append(",");
		sb.append(str1.substring(0,1).toUpperCase());
		return sb.toString();
	}
}
