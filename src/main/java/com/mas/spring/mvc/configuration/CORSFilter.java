package com.mas.spring.mvc.configuration;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * MAS - OAuth2
 * 
 */

public class CORSFilter implements Filter{

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filtering on...........................................................");
		HttpServletResponse responseOAuth2 = (HttpServletResponse) res;
		responseOAuth2.setHeader("Access-Control-Allow-Origin","*");
		responseOAuth2.setHeader("Access-Control-Allow-Credentials", "true");
		responseOAuth2.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		responseOAuth2.setHeader("Access-Control-Max-Age", "3600");
		responseOAuth2.setHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, Authorization, Origin, Accept, Access-Control-Request-Method, Access-Control-Request-Headers");

		chain.doFilter(req, res);
		
	}

	public void destroy() {
		
	}
	
	public void init(FilterConfig filterConfig) {
		
	}
}