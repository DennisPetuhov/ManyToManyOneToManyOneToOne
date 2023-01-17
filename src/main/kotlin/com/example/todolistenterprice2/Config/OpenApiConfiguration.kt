package com.example.todolistenterprice2.Config


import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport


@Configuration
class OpenApiConfiguration {
    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI().info(apiInfo())
    }

    private fun apiInfo(): Info {
        return Info()
            .title("Human cloning API")
            .description("API for creating clone who will fight in the clones wars")
            .version("2.0")
            .contact(apiContact())
            .license(apiLicence())
    }

    private fun apiLicence(): License {
        return License()
            .name("MIT Licence")
            .url("https://opensource.org/licenses/mit-license.php")
    }

    private fun apiContact(): Contact {
        return Contact()
            .name("Erwan LE TUTOUR")
            .email("erwanletutour.elt@gmail.com")
            .url("https://github.com/ErwanLT")
    }



}