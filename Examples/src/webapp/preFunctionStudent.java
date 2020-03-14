package webapp;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}	
}
public class preFunctionStudent {
	public static void main(String args[])
	{
		Student s1=new Student("janu",80);
		Student s2=new Student("mj",70);
		Student s3=new Student("jahnavi",60);
		Student s4=new Student("mjanu",50);
		Student s5=new Student("nani",40);
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Predicate<Student> p=s->s.marks>=60;
		System.out.println(p.test(s1));
		Function<Student,String> f=s->
		{
		if(s.marks>=80)
			return "A[Distinction]";
		else if(s.marks>=60)
			return "B[First class]";
		else if(s.marks>=50)
			return "C[Second class]";
		else if(s.marks>=40)
			return "D[Third Class]";
		else 
			return "E[fail]";
		};
		Consumer<Student> c=s->
		{
			System.out.println(s.name);
			System.out.println(s.marks);
			System.out.println(f.apply(s));
		};
		/*if(p.test(s3))
			c.accept(s3);
		else
			System.out.println("failed");*/
		
		for(Student s:list)
		{
			if(p.test(s))
			{
				c.accept(s);
			}
		}
	}
}
