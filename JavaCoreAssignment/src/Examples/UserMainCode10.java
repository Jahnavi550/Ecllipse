package Examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode10 {
	public static int validateTime(String str)
	{
		int res=0;
		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm a");
		sdf.setLenient(false);
			try
			{
				Date d=sdf.parse(str);
				res=1;
			}
			catch(ParseException e)
			{
				res=-1;
			}
		return res;
	}
}