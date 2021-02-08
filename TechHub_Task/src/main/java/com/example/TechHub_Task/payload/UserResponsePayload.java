package com.example.TechHub_Task.payload;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserResponsePayload {

	

	private String firstName;

	private String lastName;
	

    private String Age;
    
	private String email;
	
	private String password;

	
	
	
	public UserResponsePayload() {
		}

	public UserResponsePayload(String firstName, String lastName, String age, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Age = age;
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

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
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
	
	
	
	
   

}
