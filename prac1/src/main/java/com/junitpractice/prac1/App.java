package com.junitpractice.prac1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class App {
	Scanner sc = new Scanner(System.in);
		int divideNum(int a, int b) {
		return a / b;
	}

	boolean palindrome(String value) {
		if (value.equals("madam"))
			return true;
		else
			return false;
	}

	boolean stringPalindrome(String value) {

		String revstr = "";
		int strlength = value.length();
		for (int i = (strlength - 1); i >= 0; --i) {
			revstr = revstr + value.charAt(i);

		}
		if (value.toLowerCase().equals(revstr)) {
			return true;
		} else {
			return false;
		}
	}
	
	interface Greeting{
		String message = "HEllo how are you?";
		String displayGreeting();
	}
	
	interface Hello{
		String msg = "Hello";
		String msgGreeting();
	}
}
