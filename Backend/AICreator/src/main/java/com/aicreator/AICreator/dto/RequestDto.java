package com.aicreator.AICreator.dto;

import java.util.ArrayList;
import java.util.List;

public class RequestDto {

	private String model;
	private List<MessageDto> messages;
	
	
	public RequestDto(String model,String prompt) {
		
		this.model=model;
		this.messages=new ArrayList<>();
		this.messages.add(new MessageDto("user",prompt));
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public List<MessageDto> getMessages() {
		return messages;
	}
	public void setMessages(List<MessageDto> messages) {
		this.messages = messages;
	}
	
	
}
