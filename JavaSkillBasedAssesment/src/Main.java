import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
	    System.out.println("Enter an Integer");
	    int n = Integer.parseInt(s.nextLine());	    
	    ArrayList<Integer> a1 = new ArrayList<Integer>();
	    ArrayList<Integer> a2 = new ArrayList<Integer>();
	    System.out.println("Enter ArrayList1 Values");
	    for(int i=0;i<n;i++)
	      a1.add(Integer.parseInt(s.nextLine()));
	    System.out.println("Enter ArrayList2 Values");
	    for(int i=0;i<n;i++)
	      a2.add(Integer.parseInt(s.nextLine()));
	    System.out.println("Enter Character");
	    char c = s.nextLine().charAt(0);
	    System.out.println(UserMainCode.performSetOperations(a1,a2,c));
	}
}
