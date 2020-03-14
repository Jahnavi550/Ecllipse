package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapExampleYearSeats {
	public static void main(String args[])
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		System.out.println("enter no of entries");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=s.nextInt();
			int b=s.nextInt();
			hm.put(a,b);
		}
		Set set=hm.entrySet();
		Iterator itr1=set.iterator();
		int max=0;
		int tyear=0;
		int i=0;
		while(itr1.hasNext()) {
			Map.Entry me=(Map.Entry)itr1.next();
			i=(Integer)me.getValue();
			if(i>max)
			{
				max=i;
				tyear=(Integer)me.getKey();
			}
		}
		System.out.println("year: "+ tyear +" number of admissions "+max);
	}
}
