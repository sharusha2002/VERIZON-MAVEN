//package com.verizon.junitexamples;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.fail;
//import static org.junit.jupiter.api.Assertions.assertAll;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//
//import org.junit.jupiter.api.Test;
//
//class AppTest {
//
////	@Test
////	void testDivideNumbers() {
////		fail("Test failed");
////	}
//	
//@Test
//void testDivideNumbers() {
//	int expected=2;
//	
//	App app = new App();
//	int actual = new App().divideNumbers(100, 50);
//	assertEquals(expected, actual);
//	assertNull(app.getObjectValue());
//	
//	assertAll(
////			() -> assertEquals(expected, actual),
////			() -> assetEquals(20, actual),
////			() -> assertEquals(40, actual),
////			() -> assertThrows(ArithmeticException.class, ()-> assertEquals(expected, actual))
//			);
//}
//}


package com.verizon.junitexamples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AppTest {

	
	@BeforeAll
	static void callAtBeginning() {
		System.out.println("callAtBeginning called...");
	}
	
	
	@AfterAll
	static void callAtEnd() {
		System.out.println("callAtEnd called...");
	}
	
	@BeforeEach
	void callBeforeEachTest() {
		System.out.println("beforeEach called...");
	}
	
	@AfterAll
	void callAfterTest() {
		System.out.println("afterEach called...");
	}
	
	
	
	@Test
	void testDivideNumbers() {
//		fail("The test just failed...");
		
		int expected = 20;
		
		
		App app = new App();
//		int actual = app.divideNumbers(100, 0);
		
//		assertNotEquals(expected, actual, "Must have been equal");
		
//		assertNotNull(app.getObjectValue());
		
		assertAll(
//				() -> assertEquals(expected, actual),
//				() -> assertEquals(20, actual),
//				() -> assertEquals(30, actual, "Values not equal"),
() -> assertThrows(ArithmeticException.class, () -> assertEquals(2, app.divideNumbers(100, 0)))
				);
	
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"sanjana", "madam", "gokul"})
	void testCheckForPalindrome(String value) {
		assertEquals(true, new App().checkForPalindrome(value));
	}
	
	
	
	
	
	

}
