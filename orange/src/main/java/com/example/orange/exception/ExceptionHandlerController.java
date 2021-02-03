package com.example.orange.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.orange.rest.response.GenericResponse;

@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(InvalidIdException.class)
	@ResponseBody
	public GenericResponse invalidIdExceptionHandler(InvalidIdException exception) {
		return exception.buildErrorResponse();
	}

	@ExceptionHandler(InvalidCredentialsException.class)
	@ResponseBody
	public GenericResponse invalidCredentialsException(InvalidCredentialsException exception) {
		return exception.buildErrorResponse();
	}

	@ExceptionHandler(InvalidCodeException.class)
	@ResponseBody
	public GenericResponse invalidCodeException(InvalidCodeException exception) {
		return exception.buildErrorResponse();
	}

}
