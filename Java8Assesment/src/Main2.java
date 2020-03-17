import java.util.Scanner;
class UserMainCode2
{
	public static int getLuckySum(int a,int b,int c)
	{
		int sum;
		if(a==13)
		{
			sum=c;
		}
		else if(b==13)
		{
			sum=a;
		}
		else if(c==13)
		{
			sum=a+b;
		}
		else
		{
			sum=a+b+c;
		}
		return sum;
	}
}
public class Main2 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println(UserMainCode2.getLuckySum(a,b,c));
	}
}
