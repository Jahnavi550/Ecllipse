package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSmallCapital {
	public static void main(String args[])
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		ArrayList<String> ar=new ArrayList<String>();
		hm.put(1001,"Janu");
		hm.put(1002,"januM");
		hm.put(1003,"JanU");
		hm.put(1004,"mjanU");
		Set set=hm.entrySet();
		Iterator itr1=set.iterator();
		while(itr1.hasNext()) {
			Map.Entry me=(Map.Entry)itr1.next();
			String str=(String)me.getValue();
			if(str.charAt(0)>=97 && str.charAt(0)<=123 && str.charAt(str.length()-1)>=65 && str.charAt(str.length()-1)<=90 )
				ar.add(str);
		}
		System.out.println("the names are");
		for(String c:ar)
			System.out.println(c);
	}
}
