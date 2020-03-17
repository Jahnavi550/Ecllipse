import org.junit.Test;
import org.junit.experimental.categories.Category;
@Category(RegressionTest.class)
public class FunTest1 {
	
		@Category(RegressionTest.class)
		@Test
		public void test3()
		{
			System.out.println("Inside the RegressionTest of FunTest1");
		}
		@Category(PerformanceTest.class)
		@Test
		public void test4()
		{
			System.out.println("Inside the PerformanceTest of FunTest1");
		}
	

}