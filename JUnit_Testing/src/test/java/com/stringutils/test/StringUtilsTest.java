package com.stringutils.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.stringutils.StringUtils;

class StringUtilsTest {

	@Test
	void test_reverse() {
		StringUtils obj = new StringUtils();
		assertEquals("olleh", obj.reverse("hello"));
	}

	@Test
	void test_palindrome() {
		StringUtils obj = new StringUtils();
		assertFalse(obj.isPalindrome("testing"));
		assertTrue(obj.isPalindrome("Malayalam"));
		assertTrue(obj.isPalindrome("malayalam"));
	}

	@Test
	void test_concatenate() {
		StringUtils obj = new StringUtils();
		assertEquals("helloworld", obj.concatenate("hello", "world"));
		assertNotEquals("worldhello", obj.concatenate("hello", "world"));
	}

	@Test
	void test_countOccurence() {
		StringUtils obj = new StringUtils();
		assertEquals(4, obj.countOccurrences("mississipi", 'i'));
	}
}