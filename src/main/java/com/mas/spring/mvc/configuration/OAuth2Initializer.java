package com.mas.spring.mvc.configuration;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * MAS - OAuth2
 * 
 */

public class OAuth2Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { OAuth2Configuration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String [] {"/"};
	}
	
	@Override
	protected Filter[] getServletFilters() {
		Filter [] singleton = { new CORSFilter() };
		return singleton;
	}

}
