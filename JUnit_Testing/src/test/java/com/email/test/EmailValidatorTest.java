package com.email.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.email.EmailValidator;

public class EmailValidatorTest {
	@Test
	void test_validemail() {
		EmailValidator obj = new EmailValidator();

		assertFalse(obj.isValidEmail("abc@gmail"));
		assertFalse(obj.isValidEmail("abc@com"));
		assertFalse(obj.isValidEmail("abc@gmailcom"));
		assertFalse(obj.isValidEmail("abc@gmail."));
		assertFalse(obj.isValidEmail("abc@.com"));
		assertFalse(obj.isValidEmail("@gmail.com"));
		assertFalse(obj.isValidEmail("@.com"));
		assertFalse(obj.isValidEmail("@gmail.com"));
		assertFalse(obj.isValidEmail("@gmailcom"));
		assertFalse(obj.isValidEmail("gmail.com@abc"));

		assertTrue(obj.isValidEmail("abc@gmail.com"));
	}

	@Test
	void test_companyemail() {
		EmailValidator obj = new EmailValidator();
		assertTrue(obj.isCorporateEmail("abc@comviva.com"));
	}

	@Test
	void test_null() {
		EmailValidator obj = new EmailValidator();
		assertFalse(obj.input("abc@comviva.com"));
		assertTrue(obj.input(""));
	}

	@Test
	void test_space() {
		EmailValidator obj = new EmailValidator();
		assertTrue(obj.space("abc xyz@comviva.com"));
	}
}