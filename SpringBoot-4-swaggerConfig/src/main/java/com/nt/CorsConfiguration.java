package com.nt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//This is For Global Cors Origin 

//First Way By implementing WebMvcConfigurer:

//@Configuration
//public class CorsConfiguration implements WebMvcConfigurer{


// If we use @CrosOrigin annotation at class level, it will be an application for only that particular controller.
// But if we want to make it for all the controllers of an application then we have to configure CORS at global level.

//	    @Override
//	    public void addCorsMappings(CorsRegistry registry) {  
//	    	registry.addMapping("/**").allowedOrigins("*");
//	    } 


@Configuration
public class CorsConfiguration {

	// Second Way By using WebMvcConfigurer Bean

	@Bean
	public WebMvcConfigurer configurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}

}
