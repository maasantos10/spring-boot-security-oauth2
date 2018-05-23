package com.mas.spring.mvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * MAS - OAuth2
 * 
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mas.spring.mvc")
public class OAuth2Configuration {

}
