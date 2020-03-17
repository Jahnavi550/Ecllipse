import java.util.Scanner;
class UserMainCode4
{
	public static StringBuffer repeatFirstThreeCharacters(String str,int n)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++)
		{
			if(str.length()>=3)
			{
				sb.append(str.substring(0,3));
			}
			else
			{
				sb.append(str.substring(0,str.length()));
			}
		}
		return sb;
	}
}
public class Main4 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int n=s.nextInt();
		System.out.println(UserMainCode4.repeatFirstThreeCharacters(str,n));
	}
}
