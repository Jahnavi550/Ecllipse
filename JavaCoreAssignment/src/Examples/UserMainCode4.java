package Examples;

public class UserMainCode4 {
	public static String getMiddleChars(String str)
	{
		int b=0;
		StringBuffer sb=new StringBuffer();
		if(str.length()%2==0)
		{
			sb.append(str.substring(str.length()/2-1,str.length()/2+1 ));
		}
		return sb.toString();
	}
}