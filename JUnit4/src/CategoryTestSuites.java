import org.junit.experimental.categories.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Categories.class)
@Categories.IncludeCategory(RegressionTest.class)
@Categories.ExcludeCategory(PerformanceTest.class)
@Suite.SuiteClasses({FunTest.class,FunTest1.class})
public class CategoryTestSuites {

}