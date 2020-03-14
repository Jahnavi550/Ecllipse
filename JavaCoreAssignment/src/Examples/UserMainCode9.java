package Examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode9 {
	public static int validateDate(String str)
	{
		int res=0;
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		sdf.setLenient(false);
		if(str.matches("[0-9]{2}(/)[0-9]{2}(/)[0-9]{4}"))
		{
			try
			{
				Date d=sdf.parse(str);
				res=1;
			}
			catch(ParseException e)
			{
				res=-1;
			}
		}
		return res;
	}
}