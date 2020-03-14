package collections;

import java.util.LinkedList;

class Student1
{
	String name;
	int htno;
	public Student1(String name, int htno) {
		super();
		this.name = name;
		this.htno = htno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", htno=" + htno + "]";
	}
	
}
class Employee1
{
	String ename;
	String eid;
	public Employee1(String ename, String eid) {
		super();
		this.ename = ename;
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + "]";
	}
	
}
public class LinkedListUserDefined {
	public static void main(String args[])
	{
		Student1 s1=new Student1("janu",123);
		Student1 s2=new Student1("mj",1234);
		Student1 s3=new Student1("janu",12345);
		LinkedList ar=new LinkedList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println(ar);
		Employee1 e1=new Employee1("janu","1234");
		Employee1 e2=new Employee1("mjanu","12345");
		ar.add(e1);
		ar.add(e2);
		System.out.println(ar);
	}
}
