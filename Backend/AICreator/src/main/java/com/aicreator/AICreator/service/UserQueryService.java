package com.aicreator.AICreator.service;

import com.aicreator.AICreator.dto.PromptDto;
import com.aicreator.AICreator.dto.RequestDto;
import com.aicreator.AICreator.dto.ResponseDto;

public interface UserQueryService {
	
	public ResponseDto IntegrateGPT(PromptDto promptDto);

}
