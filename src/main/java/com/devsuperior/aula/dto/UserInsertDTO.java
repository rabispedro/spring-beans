package com.devsuperior.aula.dto;

import javax.validation.constraints.Pattern;

public class UserInsertDTO extends UserDTO {
	
	@Pattern(regexp = "^([a-zA-Z0-9@*#]{8,15})$", message = "Match all alphanumeric character and predefined wild characters. Password must consists of at least 8 characters and not more than 15 characters.")
	private String password;
	
	public UserInsertDTO() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
