package com.turktrust.eticaret;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@SpringBootApplication
public class EticaretApplication {

	public static void main(String[] args) {
		SpringApplication.run(EticaretApplication.class, args);
	}
	@Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("com.turktrust.eticaret")       
                                 .description("Your API Description")
                                 .version("1.0"));
    }

}
