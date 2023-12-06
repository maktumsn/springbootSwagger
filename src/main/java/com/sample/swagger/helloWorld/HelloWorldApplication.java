package com.sample.swagger.helloWorld;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Hello world",
				version = "1.0",
				description = "Sample Hello world Swagger",
				termsOfService = "practice",
				contact =@Contact(
						name = "Maktum",
						email = "m@gmail.com"
						),
				license = @License(
						name = "licence",
						url="runcodenow"
				)
		)
)
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
