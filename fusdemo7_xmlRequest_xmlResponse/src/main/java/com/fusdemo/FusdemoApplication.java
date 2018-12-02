package com.fusdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication
public class FusdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FusdemoApplication.class, args);
	}

	@Configuration
	class MessageConverterConfig implements WebMvcConfigurer {

		public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
			Jackson2ObjectMapperBuilder builder = Jackson2ObjectMapperBuilder.xml();
			builder.indentOutput(true);
			converters.add(new MappingJackson2XmlHttpMessageConverter(builder.build()));
		}
	}
}
