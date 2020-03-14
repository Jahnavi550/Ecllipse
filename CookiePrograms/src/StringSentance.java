import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSentance {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sentance");
		String str=s.nextLine();
		StringTokenizer st=new StringTokenizer(str," ");
		StringBuffer sb = new StringBuffer();
		while (st.hasMoreTokens())
		{
		String str1= st.nextToken();
		String str2 = str1.substring(str1.length() - 1);
		String str3 = str2.toUpperCase();
		sb.append(str3).append("$");
		}
		System.out.println(sb);
	}
}
