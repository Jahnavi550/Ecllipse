import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex1 {
	public static void main(String args[])
	{
		System.out.println(Pattern.matches("PRO[A-Z]{4}[0-9]{3}","PROJANU123"));
		System.out.println(Pattern.matches("FIN[A-Z]{4}[0-9]{3}","FINJANU123"));
		System.out.println(Pattern.matches("Test[A-Z]{4}[0-9]{3}","TestJANU123"));
		System.out.println(Pattern.matches("(#)[A-F0-9]{8}","#FF001234"));
		System.out.println(Pattern.matches("(?=.*\\d)(?=.*[@#$]).{6,20}", "jahnavi@550"));


	}
}
