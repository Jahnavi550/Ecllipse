import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class JunitTestClass {
	@BeforeAll
	public static void beforeClassBegins()
	{
		System.out.println("This method will be execute before beggining of classes");
	}
	@AfterAll
	public static void afterClassBegins()
	{
		System.out.println("This method will be execute after beggining of classes");
	}
	@Test
	@RepeatedTest(3)
	public void test3()
	{
		System.out.println("This is test3");
	}
	@Test
	public void test1()
	{
		System.out.println("This is my test1");
	}
	@BeforeEach
	public void preMethod()
	{
		System.out.println("This will be executed before test case");
	}
	@Test
	public void test2()
	{
		System.out.println("This is my test2");
	}
	@AfterEach
	public void postMethod()
	{
		System.out.println("This will be executed after test case");
	}
	
}
