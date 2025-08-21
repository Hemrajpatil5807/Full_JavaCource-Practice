package com.nt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.service.EmployeeService;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration      // JAVA Configuration
public class SwaggerConfig {
 
	@Bean          // Using JAVA Configuration created Bean / Object
	public EmployeeService getEmployeeService() {
		return new EmployeeService();
	}
	
	//URL for swagger :- http://localhost:8181/swagger-ui/index.html
		@Bean
	    public OpenAPI customOpenAPI() {
	        return new OpenAPI()
	            .info(new Info()
	                .title("My Project API")
	                .version("1.0")
	                .description("API documentation for My Project"));
	    } 
	
}
