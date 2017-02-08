package com.cs544;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
public class TimesheetApplication {

	private static final String PATH = "/errors";
	
	public static void main(String[] args) {
		SpringApplication.run(TimesheetApplication.class, args);
	}
	
	@Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
      return (container -> {
   	   //route all errors towards /error .
   	   final ErrorPage errorPage=new ErrorPage(PATH);
   	   container.addErrorPages(errorPage);
      });
   }
}
