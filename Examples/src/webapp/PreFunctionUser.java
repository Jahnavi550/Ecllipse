package webapp;

import java.util.function.Function;

class User1
{
	String uid;
	String pwd;
	public User1(String uid, String pwd) {
		super();
		this.uid = uid;
		this.pwd = pwd;
	}
	
}
public class PreFunctionUser {

	public static void main(String[] args) {
		User1 u1=new User1("admin","1234");
		User1 u2=new User1("janu","5678");
		Function<User1,String> p=u->{
		if(u.uid.equals("admin")&&u.pwd.equals("1234"))
			return "Valid user";
		else
			return "Invalid user";
		};
		System.out.println(p.apply(u2));
	}

}
