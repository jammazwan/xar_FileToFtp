package jammazwan.xar;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XarTest extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}

	@Test
	public void testXar() throws Exception {
		String reply = template.requestBodyAndHeader("direct:xar", "Hello World", "CamelFileName", "hello.txt",
				String.class);
		assertEquals("Hello World", reply);
	}

}
