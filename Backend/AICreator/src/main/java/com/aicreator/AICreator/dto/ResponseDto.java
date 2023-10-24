package com.aicreator.AICreator.dto;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ResponseDto {

	private String id;
	private List<ChoiceDto> choices=new ArrayList<>();

	public List<ChoiceDto> getChoices() {
		return this.choices;
	}

	public void setChoices(List<ChoiceDto> choice) {
		this.choices = choice;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id ;
	}




	public ResponseDto(){

	}

	public ResponseDto(String id,List<ChoiceDto> choices) {
		super();
		this.choices = choices;
		this.id=id;
	}


	
}
