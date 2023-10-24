package com.aicreator.AICreator.dto;

public class PromptDto {

    private String prompt;

    public void setPrompt(String prompt){
        this.prompt=prompt;
    }

    public String getPrompt(){
       return this.prompt;
    }

    public PromptDto(String prompt){
        this.prompt=prompt;
    }

    public PromptDto(){

    }


}
