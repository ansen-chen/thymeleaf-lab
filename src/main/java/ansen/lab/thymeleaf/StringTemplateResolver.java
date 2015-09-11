/**
 * 
 */
package ansen.lab.thymeleaf;

import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * @author chenxp
 *
 */
public class StringTemplateResolver extends TemplateResolver {

	public StringTemplateResolver() {
		super();
		super.setResourceResolver(new StringResourceResolver());
	}
}
