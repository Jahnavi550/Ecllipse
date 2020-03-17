import java.util.regex.*;

public class RegexExample {
	public static void main(String args[])
	{
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		System.out.println(b);
		System.out.println(Pattern.matches("[xyz]{3}","yxz"));
		System.out.println(Pattern.matches("[xyz]","x"));
		System.out.println(Pattern.matches("[xyz]","xxyyyyz"));
		System.out.println(Pattern.matches("\\d","abc"));
		System.out.println(Pattern.matches("\\d","1"));
		System.out.println(Pattern.matches("\\D","465"));
		System.out.println(Pattern.matches("\\D","m"));
		System.out.println(Pattern.matches("\\D*","abcdf"));
	}
}
