package webapp;

import java.util.function.Predicate;

/* interface TestNumber
{
	public boolean teststr(int x);
}
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNumber tn=i->
		{
			if(i>10)
				return true;
			else
				return false;
		};
		System.out.println(tn.teststr(100));
	}

}*/

public class PredicateExample {


	public static void main(String[] args) {
		Predicate<Integer> p=I->(I>10);
		Predicate<Integer> p1=I->(I%2==0);
		Predicate<String> p2=str->(str.length()>=3);
		Predicate<Integer> p3= n->{ boolean flag=true;
				for(int i=2;i<n;i++)
				{
					if(n%i==0)
					{
						flag=false;
						break;
					}
				}
				return flag;
		};
		Predicate<String> p4=str->(str.charAt(0)=='J');
		System.out.println(p.test(11));
		System.out.println(p.test(2));
		System.out.println(p1.test(11));
		System.out.println(p1.test(2));
		System.out.println(p2.test("janu"));
		System.out.println(p2.test("mj"));
		System.out.println(p3.test(5));
		System.out.println(p3.test(6));
		System.out.println(p4.test("Janu"));
		String[] names= {"sunny","Kiran","Malli","Kishore","Khan"};
		Predicate<String> ktest=s->s.charAt(0)=='K';
		for(String n:names)
		{
			if(ktest.test(n))
			{
				System.out.println(n);
			}
		}
	}
}
