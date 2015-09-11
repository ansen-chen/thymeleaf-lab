/**
 * 
 */
package ansen.lab.thymeleaf;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.thymeleaf.TemplateProcessingParameters;
import org.thymeleaf.resourceresolver.IResourceResolver;

/**
 * @author chenxp
 *
 */
public class StringResourceResolver implements IResourceResolver {
	
	public static final String NAME = "STRING";

	/* (non-Javadoc)
	 * @see org.thymeleaf.resourceresolver.IResourceResolver#getName()
	 */
	@Override
	public String getName() {
		return NAME;
	}

	/* (non-Javadoc)
	 * @see org.thymeleaf.resourceresolver.IResourceResolver#getResourceAsStream(org.thymeleaf.TemplateProcessingParameters, java.lang.String)
	 */
	@Override
	public InputStream getResourceAsStream(
			TemplateProcessingParameters templateProcessingParameters,
			String resourceName) {
		return new ByteArrayInputStream(resourceName.getBytes());
	}

}
