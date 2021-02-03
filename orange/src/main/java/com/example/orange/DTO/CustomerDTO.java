package com.example.orange.DTO;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
public class CustomerDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String custCode;
	private String firstName;
	private String lastName;
	private String gender;
	private String date_birth;
	private String place_birth;
	private String nationality;
	private String address;
	private String identity;
	private String numIdentity;
	private String contact;
	private String email;
	private String creationDate;


	public CustomerDTO(long id, String custCode, String firstName, String lastName, String gender, String date_birth,
			String place_birth, String nationality, String address, String identity, String numIdentity, String contact,
			String email, String creationDate) {

		super();
		this.id = id;
		this.custCode = custCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.date_birth = date_birth;
		this.place_birth = place_birth;
		this.nationality = nationality;
		this.address = address;
		this.identity = identity;
		this.numIdentity = numIdentity;
		this.contact = contact;
		this.email = email;
		this.creationDate = creationDate;
	}
	
}
