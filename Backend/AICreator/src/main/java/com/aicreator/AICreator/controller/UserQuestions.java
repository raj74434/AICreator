package com.aicreator.AICreator.controller;

import java.util.ArrayList;
import java.util.List;



import com.aicreator.AICreator.dto.ChoiceDto;
import com.aicreator.AICreator.dto.MessageDto;
import com.aicreator.AICreator.dto.PromptDto;
import com.aicreator.AICreator.dto.ResponseDto;
import com.aicreator.AICreator.service.UserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserQuestions {
	
	@Autowired
	private UserQueryService userQueryService;

	@PostMapping("/findit")
    public ResponseEntity<ResponseDto> integrateGPT(@RequestBody PromptDto promptDto) {
		
//		RequestDto res=new RequestDto("gpt-3.5-turbo", "delhi weather");

		System.out.println(promptDto.getPrompt());
		ResponseDto res=userQueryService.IntegrateGPT(promptDto);
		
    	return new ResponseEntity(res, HttpStatus.ACCEPTED);
//
	}
	
	@GetMapping("/")
	public String check() {
		return "Hello";
	}
	
	
}
