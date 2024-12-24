package id.ten.springswaggerkotlin2

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/v3/api-docs/**")
            .allowedOrigins("*") // Or specify allowed origins
            .allowedMethods("GET")
    }
}