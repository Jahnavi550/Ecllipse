import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AverageOfOdd {
	public static void main(String args[])
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter key");
			int k=s.nextInt();
			System.out.println("Enter value");
			int v=s.nextInt();
			hm.put(k,v);
		}
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		int count=0;
		int sum=0;
		int value=0;
		int avg=0;
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			int k=(Integer)me.getKey();
			if(k%2!=0)
			{
				count++;
				value=(Integer)me.getValue();
				sum=sum+value;
			}
			avg=sum/count;
		}
		System.out.println(avg);
	}
}
