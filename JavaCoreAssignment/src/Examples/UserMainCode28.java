package Examples;

import java.util.StringTokenizer;

public class UserMainCode28 {
	public static int validateIDLocations(String str1,String str2)
	{
		int b=0;
		String str3=str2.substring(0,3);
		StringTokenizer st=new StringTokenizer(str1,"-");
		String str4=st.nextToken();
		String str5=st.nextToken();
		String str6=st.nextToken();
		if(str4.equals("CTS")&&str5.equals(str3)&&str6.matches("[0-9]{4}"))
			b=1;
		return b;
	}
}