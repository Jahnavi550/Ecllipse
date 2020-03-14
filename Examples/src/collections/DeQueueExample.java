package collections;

import java.util.PriorityQueue;
class Student3 implements Comparable<Student3>
{
	String htno;
	String name;
	public Student3(String htno, String name) {
		super();
		this.htno = htno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student3 s) {
		// TODO Auto-generated method stub
		if(name.compareTo(s.name)>0)
			return 1;
		else if(name.compareTo(s.name)<0)
			return -1;
		else
			return 0;
	}
	
}
public class DeQueueExample {
	public static void main(String args[])
	{
		PriorityQueue d=new PriorityQueue();
		d.add(10);
		d.add(20);
		d.add(4);
		d.add(16);
		System.out.println(d);
		d.remove();
		System.out.println(d);
		d.add(9);
		System.out.println(d);
		d.remove();
		System.out.println(d);
		
		PriorityQueue d1=new PriorityQueue();
		d1.add("japan");
		d1.add("india");
		d1.add("sweden");
		d1.add("america");
		
		System.out.println(d1);
		d1.remove();
		System.out.println("After removal:"+d1);
		d1.add("canada");
		System.out.println("After adding:"+d1);
		
		PriorityQueue<Student3> d2=new PriorityQueue<Student3>();
		Student3 s1=new Student3("1001","Anil");
		Student3 s2=new Student3("1002","Kishore");
		Student3 s3=new Student3("1003","Khan");
		d2.add(s1);
		d2.add(s2);
		d2.add(s3);
		System.out.println(d2);
		d2.remove();
		System.out.println(d2);
	}
}
