package Examples;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode16 {
	public static void getElementPosition(String str[],String str1)
	{
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<str.length;i++)
		{
			al.add(str[i]);
		}
		Collections.sort(al);
		Collections.reverse(al);
		for(int i=0;i<al.size();i++)
		{
			if(str1.equals(al.get(i)))
			{
				System.out.println(i+1);
			}
		}
	}
}
