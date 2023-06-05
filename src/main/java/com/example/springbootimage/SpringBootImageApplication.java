package com.example.springbootimage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.nio.charset.Charset;

@SpringBootApplication
public class SpringBootImageApplication {

	private Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);

	@EventListener(ApplicationReadyEvent.class)
	public void checkDefaultCharset(ApplicationReadyEvent event){

		Charset defaultCharset = Charset.defaultCharset();
		logger.info("File encoding is: {}", defaultCharset);

		if (!defaultCharset.name().equals("UTF-16")){
			throw new IllegalStateException("Wrong system encoding: " + defaultCharset);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootImageApplication.class, args);
	}

}
