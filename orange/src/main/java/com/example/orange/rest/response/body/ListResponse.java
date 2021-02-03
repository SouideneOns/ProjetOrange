package com.example.orange.rest.response.body;

import java.util.List;

import com.example.orange.rest.response.GenericResponseBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListResponse<T extends Object> extends GenericResponseBody {

	private List<T> list;

}
