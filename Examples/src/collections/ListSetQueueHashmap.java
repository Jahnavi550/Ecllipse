package collections;
import java.util.*;
public class ListSetQueueHashmap {

	public static void main(String[] args) {
		HashMap<String,Collection> hm=new HashMap<String,Collection>();
		ArrayList<String> al=new ArrayList<String>();
		al.add("janu");
		al.add("mj");
		al.add("mjanu");
		HashSet<String> hs=new HashSet<String>();
		hs.add("india");
		hs.add("china");
		hs.add("japan");
		PriorityQueue<Integer> d=new PriorityQueue<Integer>();
		d.add(10);
		d.add(20);
		d.add(30);
		hm.put("List",al);
		hm.put("Set",hs);
		hm.put("Queue",d);
		Set entries=hm.entrySet();
		Iterator itr1=entries.iterator();
		while(itr1.hasNext()) {
			Map.Entry me=(Map.Entry)itr1.next();
			System.out.println(me.getKey()+" "+me.getValue());
			 
		}
	}
}
