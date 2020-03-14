package collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	String name;
	String htno;
	public Student(String name, String htno) {
		super();
		this.name = name;
		this.htno = htno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", htno=" + htno + "]";
	}
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		if(htno.compareTo(student.htno)<0)
			return -1;
		else if(htno.compareTo(student.htno)>0)
			return 1;
		else
			return 0;
	}
	
}
class Employee
{
	String ename;
	String eid;
	public Employee(String ename, String eid) {
		super();
		this.ename = ename;
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + "]";
	}
	
}
public class ArrayListUserDefined {
	public static void main(String args[])
	{
		Student s1=new Student("Janu","123");
		Student s2=new Student("Mj","345");
		Student s3=new Student("anum","456");
		ArrayList ar=new ArrayList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println(ar);
		Collections.sort(ar);
		ar.forEach(System.out::println);
		Collections.reverse(ar);
		ar.forEach(System.out::println);
		Employee e1=new Employee("janu","1234");
		Employee e2=new Employee("mjanu","12345");
		ar.add(e1);
		ar.add(e2);
		System.out.println(ar);
	}
}
