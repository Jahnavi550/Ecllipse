package Examples;

public class UserMainCode13 {
	public static String removeEvenVowels(String str)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
				sb.append(str.charAt(i));
			else
				if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')
					if(str.charAt(i)!='A'&&str.charAt(i)!='E'&&str.charAt(i)!='I'&&str.charAt(i)!='O'&&str.charAt(i)!='U')
						sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
