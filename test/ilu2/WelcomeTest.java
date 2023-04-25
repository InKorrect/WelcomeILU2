package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test1() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}
	
	@Test
	void test2() {
		String verif="Hello, my friend";
		assertEquals(Welcome.welcome(" "),verif);
		assertEquals(Welcome.welcome(""),verif);
		assertEquals(Welcome.welcome(null),verif);
	}
	
	@Test
	void test3() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO, JERRY !");
	}
	
	@Test
	void test4() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy and Bob");
		assertEquals(Welcome.welcome("jack,patrick"),"Hello, Jack and Patrick");
	}
	@Test
	void test5() {
		assertEquals(Welcome.welcome("amy,bob,jerry"),"Hello, Amy, Bob and Jerry");
	}
	@Test
	void test6() {
		assertEquals(Welcome.welcome("amy,BOB,jerry"),"Hello, Amy and Jerry. AND HELLO BOB !");
	}
	@Test
	void test7() {
		assertEquals(Welcome.welcome("bob,AMY,jerry,JACK"),"Hello, Bob and Jerry. AND HELLO AMY AND JACK !");
	}
//	@Test
//	void test8() {
//		assertEquals(Welcome.welcome("bob   , jerry     "),"Hello, Bob and Jerry");
//	}
}