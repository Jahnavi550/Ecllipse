import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMessage {
	@Test
	public void test1()
	{
		Helloworld hw=new Helloworld();
		assertEquals("janu",hw.message1());
		assertEquals("jahnavi",hw.message2());
	}
}
