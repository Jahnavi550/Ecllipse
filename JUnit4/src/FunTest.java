import org.junit.Test;
import org.junit.experimental.categories.Category;
@Category(RegressionTest.class)
public class FunTest {
	@Category(RegressionTest.class)
	@Test
	public void test1()
	{
		System.out.println("Inside the RegressionTest of FunTest");
	}
	@Category(PerformanceTest.class)
	@Test
	public void test2()
	{
		System.out.println("Inside the PerformanceTest of FunTest");
	}
}