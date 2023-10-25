package main.java.com.bashlacheva.lab5.handler;

import java.util.Map;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;

public class StringHandler {
	
	public static Map<Character, String> toMap(Collection<String> strings) {
		
		return strings
				.stream()
					.collect(Collectors.toMap(
							s -> s.charAt(0),
							s -> s.substring(1)
					));
	}
	
	public static List<String> startWith(Collection<String> strings, char character) {
		
		return strings
				.stream()
					.filter(s -> 
						s.charAt(0) == character
					)
					.sorted()
					.collect(Collectors.toList());
	}
	
	public static List<String> modify(Collection<String> strings) {
		
		return strings
				.stream()
					.map(s -> 
						"_new_" + s.toUpperCase()
					)
					.collect(Collectors.toList());
	}
}
