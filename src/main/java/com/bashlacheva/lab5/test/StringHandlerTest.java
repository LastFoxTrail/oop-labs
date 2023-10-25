package main.java.com.bashlacheva.lab5.test;

import java.util.Map;

import main.java.com.bashlacheva.lab5.handler.StringHandler;

import java.util.List;
import java.util.Arrays;

public class StringHandlerTest {
	public static final List<String> s = Arrays.asList(
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine",
			"ten"
	);
	
	public static final List<String> stringToMap = Arrays.asList(
			"fix",
			"bug",
			"code",
			"google",
			"apache",
			"docker",
			"enterprise"
	);
	
	public static void testStartWith() {
		List<String> filtered = StringHandler.startWith(s, 'f');
		filtered.forEach(f -> System.out.println(f + " "));
	}
	
	public static void testModify() {
		List<String> modified = StringHandler.modify(s);
		modified.forEach(m -> System.out.println(m + " "));
	}
	
	public static void testToMap() {
		Map<Character, String> map = StringHandler.toMap(stringToMap);
		
		map.forEach((key, value) -> {
			System.out.println("Key: " + key + ", Value: " + value);
		});
	}
}
