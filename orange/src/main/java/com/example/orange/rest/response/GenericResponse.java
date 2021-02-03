package com.example.orange.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponse<T extends GenericResponseBody> {

	protected GenericResponseHeader header;
	protected GenericResponseBody body;

}
