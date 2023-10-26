package com.aicreator.AICreator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AiCreatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiCreatorApplication.class, args);
	}
	
	@Bean
	public RestTemplate createRestTemplate() {
		 RestTemplate restTemplate = new RestTemplate();
		 restTemplate.getInterceptors().add((request, body, execution) -> {
	            request.getHeaders().add("Authorization", "Bearer " + "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");
	            return execution.execute(request, body);
	        });
	        return restTemplate;

	}
	

}
