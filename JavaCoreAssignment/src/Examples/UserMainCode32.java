package Examples;

import java.util.StringTokenizer;

public class UserMainCode32 {
	public static int ipValidator(String str)
	{
		int res=0;
		StringTokenizer t=new StringTokenizer(str,".");
		int a=Integer.parseInt(t.nextToken());
		int b=Integer.parseInt(t.nextToken());
		int c=Integer.parseInt(t.nextToken());
		int d=Integer.parseInt(t.nextToken());
		if((a>=0&&a<=255)&&(b>=0&&b<=255)&&(c>=0&&c<=255)&&(d>=0&&d<=255))
			res=1;
		return res;
	}
}
