package webapp;
interface RBI
{
	void savings();
	void loans();
	void deposits();
	default void newReq()
	{
		System.out.println("inside the default newreq of RBI");
	}
	static void socialService()
	{
		System.out.println("social service defined by RBI");
	}
}
class HDFC implements RBI
{
	static void socialService()
	{
		System.out.println("social service defined by SBI");
	}
	public void savings()
	{
		System.out.println("HDFC rule for savings");
	}
	public void loans()
	{
		System.out.println("HDFC give loans for agri,education,home");
	}
	public void deposits()
	{
		System.out.println("HDFC rule for fd minimum amount is 5000");
	}
}
class SBI implements RBI
{
	public void savings()
	{
		System.out.println("SBI rule for savings");
	}
	public void loans()
	{
		System.out.println("SBI give loans for agri,education,home");
	}
	public void deposits()
	{
		System.out.println("SBI rule for fd minimum amount is 500");
	}
	public void newReq()
	{
		System.out.println("SBI has their oun newreq");
	}
}
public class TestRBI {
	public static void main(String args[])
	{
		RBI.socialService();
		HDFC hdfc=new HDFC();
		hdfc.deposits();
		hdfc.savings();
		hdfc.loans();
		hdfc.newReq();
		hdfc.socialService();
		SBI sbi=new SBI();
		sbi.deposits();
		sbi.savings();
		sbi.loans();
		sbi.newReq();
	}
}
