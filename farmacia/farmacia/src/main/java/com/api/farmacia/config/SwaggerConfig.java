package com.api.farmacia.config;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

//Isso é para o spring saber que isso é uma classe de configuração
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.api.farmacia"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }
	
	//Método para informação de quem criou a API
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Farmácia API Rest",
				"API REST de cadastro de produtos de uma farmácia",
				"1.0",
				"Terms of service",
				new Contact("Kelvem Carlos And Alexandre Freire", "",
						"kelvemcif@gmail.com And alexandre.freire@aluno.ifsertao-pe.edu.br"),
				"Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
		);
		
		return apiInfo;
		
	}
}
