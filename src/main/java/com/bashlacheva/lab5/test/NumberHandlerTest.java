package main.java.com.bashlacheva.lab5.test;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import main.java.com.bashlacheva.lab5.handler.NumberHandler;

public class NumberHandlerTest {
	
	public static final List<Integer> numbers = 
			Arrays.asList(1, 2, 4, 3, 1, 5, 6, 7, 3);
	
	public static void testSum() {
		System.out.println(NumberHandler.sum(numbers));
	}
	
	public static void testLast() {
		System.out.println(NumberHandler.last(numbers));
	}
	
	public static void testAverage() {
		System.out.println(NumberHandler.average(numbers));
	}
	
	public static void testSquareUniqu() {
		List<Integer> modified = NumberHandler.squareUnique(numbers);
		modified.forEach(m -> System.out.println(m + " "));
	}
	
	public static void testSumEmpty() {
		System.out.println(NumberHandler.sum(Collections.emptyList()));
	}
	
	public static void testLastEmpty() {
		try {
			System.out.println(NumberHandler.last(Collections.emptyList()));
		}
		catch(NoSuchElementException e) {
			System.err.println("Number list is empty");
		}
	}
}
