package Examples;

public class UserMainCode18 {
	public static int calculateElectricityBill(String str1,String str2,int n)
	{
		int a=Integer.parseInt(str1.substring(5));
		int b=Integer.parseInt(str2.substring(5));
		int c=(b-a)*n;
		return c;
	}
}
