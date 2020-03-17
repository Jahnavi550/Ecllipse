import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit4TestClass {
	@Before
	public  void beforeClassBegins()
	{
		System.out.println("This method will be execute before beggining of class");
	}
	@Test
	public void test1()
	{
		System.out.println("This is my test1");
	}
	@Ignore
	@Test
	public void test2()
	{
		System.out.println("This is my test2");
	}
	@After
	public  void afterClassBegins()
	{
		System.out.println("This method will be execute after beggining of class");
	}
	@Test(timeout=3000)
	public void test3()
	{
		System.out.println("This is my test3");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void testException()
	{
		String str="Hello";
		System.out.println(str.charAt(9));
	}
}

