package com.example.orange.rest.response.body;

import com.example.orange.rest.response.GenericResponseBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BooleanResponse extends GenericResponseBody {

	private boolean response;

}
