package Examples;

public class UserMainCode19 {
	public static int sumOfDigits(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			if(Character.isDigit(a))
			{
				int b=Integer.parseInt(String.valueOf(a));
				sum+=b;
			}
		}
		return sum;
	}
}
