package com.aicreator.AICreator.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import com.aicreator.AICreator.dto.MessageDto;
import com.aicreator.AICreator.dto.PromptDto;
import org.springframework.web.client.RestTemplate;

import com.aicreator.AICreator.dto.RequestDto;
import com.aicreator.AICreator.dto.ResponseDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserQueryServiceImpl implements UserQueryService {
	
	
//	private static final String OPENAI_API_KEY = "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";
//	private static final String GPT3_API_ENDPOINT = "https://api.openai.com/v1/engines/davinci/completions";
//	
//	
	private static final String url="https://api.openai.com/v1/chat/completions";

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResponseDto IntegrateGPT(PromptDto promptDto) {

//		MessageDto messageDto=new MessageDto("user",promptDto.getPrompt());

		RequestDto requestDto=new RequestDto("gpt-3.5-turbo",promptDto.getPrompt());

		ResponseDto response = restTemplate.postForObject(url, requestDto, ResponseDto.class);


		System.out.print(response.getChoices());



		return response;
		
		
		
	
//        HttpHeaders headers = new HttpHeaders();
//        
//        headers.setBearerAuth(OPENAI_API_KEY);
//        headers.setContentType(MediaType.APPLICATION_JSON);
//
//        String requestBody = "{\"prompt\": \"" + input + "\", \"max_tokens\": 50}";
//        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
//
////        ResponseEntity<String> response = restTemplate.postForEntity(GPT3_API_ENDPOINT, entity, String.class);
//
//        if (response.getStatusCode() == HttpStatus.OK) {
//            return response.getBody();
//        } else {
//            // Handle error
//            return "Error contacting GPT-3: " + response.getStatusCode();
//        }
	}
	
}
