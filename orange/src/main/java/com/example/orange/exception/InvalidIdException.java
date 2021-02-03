package com.example.orange.exception;

import com.example.orange.rest.response.GenericResponse;
import com.example.orange.rest.response.ResponseBuilder;

public class InvalidIdException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public GenericResponse buildErrorResponse() {

		return ResponseBuilder.buildErrorResponse(100, "Not result found for the given ID");
	}

}
