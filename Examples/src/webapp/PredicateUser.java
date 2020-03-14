package webapp;

import java.util.function.Predicate;

class User
{
	String uid;
	String pwd;
	public User(String uid, String pwd) {
		super();
		this.uid = uid;
		this.pwd = pwd;
	}
	
}
public class PredicateUser {
	public static void main(String args[])
	{
		User u1=new User("admin","1234");
		User u2=new User("janu","5678");
		Predicate<User> p=u->u.uid.equals("admin")&&u.pwd.equals("1234");
		if(p.test(u1))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
