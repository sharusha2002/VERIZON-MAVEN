//package com.junitpractice.prac1;
//
//import static org.junit.Assert.assertEquals;
////import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//
//public class AppTest{
//	
//	@BeforeAll
//	static void callAtBeginning() {
//		System.out.println("Call at the beginning");
//	}
//	
//	@Test
//	void DivideTest() {
//		int expected =2;
//		int actual = new App().divideNum(100,50);
//		assertEquals(expected, actual);
//	}
//	
//	@BeforeEach
//	void beforeMethod() {
//		System.out.println("Before each method");
//	}
//	
//	@AfterEach
//	void afterMethod() {
//		System.out.println("After each method");
//	}
//
//	
//	@AfterAll
//	static void callAtEnd() {
//		System.out.println("Call at the end");
//	}
//	
//	@ParameterizedTest
//	@ValueSource(strings= {"sharusha", "madam", "dhanush"})
//	void palindromeTest(String value) {
//		
//		assertEquals(true, new App().stringPalindrome(value));
////		assertEquals(true, new App().stringPalindrome(value));
//	}
//
//	private void assertEquals(boolean b, Object stringPalindrome) {
//		// TODO Auto-generated method stub
//		
//	}
//}



package com.junitpractice.prac1;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.junitpractice.prac1.App.Greeting;
import com.junitpractice.prac1.App.Hello;

import static org.junit.jupiter.api.Assertions.assertEquals; // Remove the duplicate import



public class AppTest {

    @BeforeAll
    static void callAtBeginning() {
        System.out.println("Call at the beginning");
    }

    @Test
    void DivideTest() {
        int expected = 2;
        int actual = new App().divideNum(100, 50);
        assertEquals(expected, actual);
    }

    @BeforeEach
    void beforeMethod() {
        System.out.println("Before each method");
    }

    @AfterEach
    void afterMethod() {
        System.out.println("After each method");
    }

    @AfterAll
    static void callAtEnd() {
        System.out.println("Call at the end");
    }

    @ParameterizedTest
    @ValueSource(strings = {"madam", "dhanush"})
    void palindromeTest(String value) {
        assertEquals(true, new App().stringPalindrome(value));
    }
    
    @Test
    @DisplayName("Mock testing")
    @EnabledOnJre(value=JRE.JAVA_17)
    @EnabledOnOs(value=OS.WINDOWS)
    void testMockGreeting() {
    	Greeting ref= mock(Greeting.class);
    	when(ref.displayGreeting()).thenReturn(Greeting.message);
    	assertEquals("HEllo how are you?", ref.displayGreeting());
    	assertNotEquals("HEy there", ref.displayGreeting());
    	
    	verify(ref, times(2)).displayGreeting();
    	verify(ref, atLeast(1)).displayGreeting();
    }
    
    @Test
    void testHello() {
    	Hello refer = mock(Hello.class);
    	when(refer.msgGreeting()).thenReturn(Hello.msg);
    	assertEquals("Hello", refer.msgGreeting());
    	verify(refer, times(1)).msgGreeting();
    }
    
}
