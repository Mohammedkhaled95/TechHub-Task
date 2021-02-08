package com.example.TechHub_Task.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {

    @NotBlank(message = "Please provide a first name")
	private String firstName;

    @NotBlank(message = "Please provide a lastname")
	private String lastName;
	
    @NotNull(message = "Please provide a Birth Date")   
    @JsonFormat(pattern="yyyy-MM-dd")

    private LocalDate birthDate;
    
    @NotBlank(message = "Please provide an email")
    @Email
	private String email;
	
    @NotBlank(message = "Please provide a password")
    @Size(min = 8,message = "should be at least  8 chars ")
	private String password;
   

	public User() {
		
	}

	

	public User(@NotBlank(message = "Please provide a first name") String firstName,
			@NotBlank(message = "Please provide a lastname") String lastName,
			@NotNull(message = "Please provide a Birth Date") LocalDate birthDate,
			@NotBlank(message = "Please provide an email") @Email String email,
			@NotBlank(message = "Please provide a password") @Min(value = 20, message = "password Value should be at least 4 digits") String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.email = email;
		this.password = password;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
	

	}
