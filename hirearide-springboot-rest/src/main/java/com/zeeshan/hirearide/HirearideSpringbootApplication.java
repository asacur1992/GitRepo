package com.zeeshan.hirearide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


/**
 * @author Muhammad Zeeshan
 * @category Main Class
 *
 */
@SpringBootApplication
public class HirearideSpringbootApplication extends SpringBootServletInitializer{
	
	 
	@Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(HirearideSpringbootApplication.class);
	    }

	public static void main(String[] args) {
		SpringApplication.run(HirearideSpringbootApplication.class, args);
	
	}
}
