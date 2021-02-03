package com.example.orange.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
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
	
	public Customer() {
		super();
	}

	public Customer(long id, String custCode, String firstName, String lastName, String gender, String date_birth,
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

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "nationality", nullable = false)
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Column(name = "address", nullable = false)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "identity", nullable = false)
	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	@Column(name = "contact", nullable = false)
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "custCode", nullable = false, unique = true)
	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	@Column(name = "creationDate", nullable = false)
	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "gender", nullable = false)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "date_birth", nullable = false)
	public String getDate_birth() {
		return date_birth;
	}

	public void setDate_birth(String date_birth) {
		this.date_birth = date_birth;
	}

	@Column(name = "place_birth", nullable = false)
	public String getPlace_birth() {
		return place_birth;
	}

	public void setPlace_birth(String place_birth) {
		this.place_birth = place_birth;
	}

	@Column(name = "numIdentity", nullable = false, unique = true)
	public String getNumIdentity() {
		return numIdentity;
	}

	public void setNumIdentity(String numIdentity) {
		this.numIdentity = numIdentity;
	}

	@Column(name = "email", nullable = false, unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
