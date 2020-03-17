import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		Student m=(Student) context.getBean("a");
		m.display();
	}
}
