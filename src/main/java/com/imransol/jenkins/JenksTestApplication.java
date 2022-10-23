package com.imransol.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenksTestApplication {
	
	public static Logger log = LoggerFactory.getLogger(JenksTestApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("Application started..");
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(JenksTestApplication.class, args);
		log.info("Application executed..");
	}

}
