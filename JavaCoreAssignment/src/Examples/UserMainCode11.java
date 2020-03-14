package Examples;

public class UserMainCode11 {
	public static String encrypt(String str)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(i%2==0)
			{
				if(c==122)
					c=(char)(c-25);
				else
				{
					c=(char)(c+1);
				}
				sb.append(c);
			}
			else
				sb.append(c);
		}
		return sb.toString();
	}
}
