/**
 * 
 */
package ansen.lab.thymeleaf;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


/**
 * @author chenxp
 *
 */
public class StandardDialectTest extends AbstractThymeleafTest {
	
	@Test
	public void messagesTest() {
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("message", "Hello World!");
		variables.put("userName", "Ansen");
		variables.put("helloMsgKey", "hello");
		String content = super.evaluate("templates/messages.html", variables);
		System.out.println(content);
	}
	
	@Test
	public void variablesTest() {
		
	}

}
