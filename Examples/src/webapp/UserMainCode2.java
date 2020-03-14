package webapp;

public class UserMainCode2 {
	public static String findRoots(int a,int b,int c) {
		int x=(b*b)-(4*a*c);
		if(x>0)
	    return "Roots are Real and Distict";
		else if(x==0)
			return "roots are real and equal";
		else 
			return "roots are real and imaginary";
		
	}
}
