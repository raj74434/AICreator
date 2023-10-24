package com.aicreator.AICreator.dto;

public class ChoiceDto {
	
//	we created this class because in response chat gpt return choice
	
	private Integer index;
	private MessageDto message;
	
	
	
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public MessageDto getMessage() {
		return message;
	}
	public void setMessage(MessageDto message) {
		this.message = message;
	}
	
	
	
	public ChoiceDto(Integer index, MessageDto message) {
		super();
		this.index = index;
		this.message = message;
	}

	public ChoiceDto(){

	}
	

}
