package com.dauphine.blogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Blogger Box Backend",
				description = "Blogger Box API Endpoints",
				contact = @Contact(name = "Ilyess Batal", email = "ilyess.batal7@gmail.com"),
				version = "1.0.0"
		)
)
public class BloggerBoxBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggerBoxBackendApplication.class, args);
	}
}
