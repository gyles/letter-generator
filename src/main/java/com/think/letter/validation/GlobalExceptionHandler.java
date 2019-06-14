package com.think.letter.validation;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.think.letter.exception.LetterException;
import com.think.letter.resource.ExceptionResource;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({ LetterException.class })
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ExceptionResource handleBadRequestException(HttpServletResponse response, Exception ex) throws IOException {
		ExceptionResource resource = new ExceptionResource();
		resource.setMessage(ex.getMessage());
		
		return resource;
	}

}
