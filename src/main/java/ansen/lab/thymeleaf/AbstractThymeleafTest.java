/**
 * 
 */
package ansen.lab.thymeleaf;

import java.util.Locale;
import java.util.Map;

import org.junit.Before;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.IContext;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.util.Validate;

/**
 * @author chenxp
 *
 */
public abstract class AbstractThymeleafTest {
	
	protected TemplateEngine engine;
	
	@Before
	public void initialize() {
		engine = new TemplateEngine();
		
		// template resolver
		engine.setTemplateResolver(new ClassLoaderTemplateResolver());
	}
	
	protected String evaluate(String templateName, Map<String, Object> variables) {
		// context
		Validate.notNull(variables, "variables map cannot be null");
		IContext context = new Context(Locale.getDefault(), variables);

		return engine.process(templateName, context);
	}

}
