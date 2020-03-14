package Files;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.io.*;
public class PropExample {
	public static void main(String args[]) throws IOException
	{
		Properties prop=new Properties();
		FileReader fout=new FileReader("d://db.txt");
		prop.load(fout);
		System.out.println(prop.getProperty("uname"));
		System.out.println(prop.getProperty("pwd"));
		Set s=prop.stringPropertyNames();
		System.out.println(s);
		fout.close();
		
		Properties prop1=System.getProperties();
		Set s1=prop.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
