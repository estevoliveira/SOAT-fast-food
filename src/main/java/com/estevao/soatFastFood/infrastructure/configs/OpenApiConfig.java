package com.estevao.soatFastFood.infrastructure.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI dsmovieAPI() {
        return new OpenAPI()
                .info(new Info()
                .title("SOAT FastFood API")
                .description("SOAT FastFood é uma API para realização de pedidos dentro de uma lanchonete")
                .version("v0.0.1")
                .license(new License()
                .url("https://github.com/estevoliveira/SOAT-fast-food")));
    }
}