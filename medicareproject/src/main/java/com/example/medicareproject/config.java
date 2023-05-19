package com.example.medicareproject;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class config implements WebMvcConfigurer {

@Override

public void addCorsMappings(CorsRegistry myCorsRegistry){

myCorsRegistry.addMapping("/**")

.allowedOrigins("http://localhost:4200") //frontend's link

.allowedHeaders("*")

.allowCredentials(true)

.maxAge(4800);

}
}