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
public class PassStudentDetails 
{
	public static void main(String args[])
	{
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student("janu",90);
		Student s2=new Student("jahnavi",79);
		Student s3=new Student("mjanu",45);
		Student s4=new Student("janum",20);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("The Passed Students are:");
		Predicate<Student>p=s->s.marks>=40;
		Function<Student,String>f=s->
		{
			int m=s.marks;
			if(m>=80)
				return "Distinction";
			else if(m>=60 && m<=79)
				return "First Class";
			else if(m>=40 && m<=50)
				return "Second Class";
			else
				return "fail";
		};
		Consumer<Student>c=s->
		{
			System.out.print(s.name+"  ");
			System.out.println(f.apply(s));
		};
		for(Student s:al) 
		{
			if(p.test(s))
			{
				c.accept(s);
			}
			
		}
	}
}
