package com.example.orange.exception;

import com.example.orange.rest.response.GenericResponse;
import com.example.orange.rest.response.ResponseBuilder;

public class InvalidCredentialsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public GenericResponse buildErrorResponse() {

		return ResponseBuilder.buildErrorResponse(403, "Invalid Credentials");
	}

}
