package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}
	@Test
	void test2() {
		String verif="Hello, my friend";
		assertEquals(Welcome.welcome(" "),verif);
		assertEquals(Welcome.welcome(""),verif);
		assertEquals(Welcome.welcome(null),verif);
	}
}