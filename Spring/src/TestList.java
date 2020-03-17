import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("ListApplicationContext.xml");
		CIList m=(CIList) context.getBean("a");
		m.display();
	}
}
