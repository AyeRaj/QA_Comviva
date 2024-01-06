package com.email;

public class EmailValidator {
	public boolean isValidEmail(String email) {
		return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
	}

	public boolean isCorporateEmail(String email) {
		return email.endsWith("comviva.com");
	}
	public boolean input(String email) {
		return email=="";
	}
	public boolean space(String email) {
		return email.contains(" ");
	}
}