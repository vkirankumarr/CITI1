package com.citi.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//http://localhost:9090/swagger-ui.html
public class SwaggerConfig {

	@Bean
	public Docket documentation()
	{
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any()).build().apiInfo(metadata());
	}
	private ApiInfo metadata()
	{
		return new ApiInfoBuilder().title("CIT-CIT-PJ-SANDBOX-L101")
				.description("Microservice to manage CIT-CIT-PJ-SANDBOX-L101").version("1.0").version("1.0")
				.contact("vkirankumarr@gmail.com").build();
	}
	@Bean
	UiConfiguration uiConig()
	{
		return new UiConfiguration("validatorUrl");
	}
}
