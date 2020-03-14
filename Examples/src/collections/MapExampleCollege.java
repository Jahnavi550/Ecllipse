package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
class CGroups
{
	String d1;
	String d2;
	String d3;
	public CGroups(String d1, String d2, String d3) {
		super();
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
}
public class MapExampleCollege {
	public static void main(String args[])
	{
		HashMap<String,CGroups> hm=new HashMap<String,CGroups>();
		CGroups c1=new CGroups("CSE","ECE","EEE");
		CGroups c2=new CGroups("CSE","CIVIL","MECH");
		CGroups c3=new CGroups("IT","ECE","CIVIl");
		hm.put("JNTU",c1);
		hm.put("SVU",c2);
		hm.put("OU",c3); 
		Scanner s=new Scanner(System.in);
		System.out.println("enter the department name");
		String s1=s.next();
		Set keys=hm.entrySet();
		Iterator itr1=keys.iterator();
		while(itr1.hasNext()) {
			Map.Entry me=(Map.Entry)itr1.next();
			CGroups c=(CGroups)me.getValue();
			if(c.d1.equals(s1)||c.d2.equals(s1)||c.d3.equals(s1))
				System.out.println(me.getKey());
		}
	}
}
