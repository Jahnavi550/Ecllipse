package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class Student4
{
	String name;
	int m1;
	int m2;
	public Student4(String name, int m1, int m2) {
		super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
	}
	@Override
	public String toString() {
		return "Student4 [name=" + name + "]";
	}
}
public class MapExampleUser {
	public static void main(String args[])
	{
		HashMap<Integer,Student4> hm=new HashMap<Integer,Student4>();
		Student4 s1=new Student4("janu",80,30);
		Student4 s2=new Student4("mj",60,70);
		Student4 s3=new Student4("janum",40,35);
		Student4 s4=new Student4("anil",80,50);
		hm.put(1001,s1);
		hm.put(1002,s2);
		hm.put(1003,s3);
		hm.put(1004,s4);
		//System.out.println(hm);
		Set entries=hm.entrySet();
		Iterator itr1=entries.iterator();
		while(itr1.hasNext()) {
			Map.Entry me=(Map.Entry)itr1.next();
			Student4 s = (Student4)me.getValue();
			if(s.m2<=40) {
				System.out.println(me.getKey()+" "+s.name);
			}
		}
	}
}
