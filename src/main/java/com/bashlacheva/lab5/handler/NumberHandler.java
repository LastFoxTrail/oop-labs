package main.java.com.bashlacheva.lab5.handler;

import java.util.List;
import java.util.stream.Collectors;
import java.util.NoSuchElementException;

public class NumberHandler {
	
	public static List<Integer> squareUnique(List<Integer> numbers) {
		
		return numbers
				.stream()
					.filter(n1 -> numbers.stream()
						.filter(n2 -> n2.equals(n1)).count() == 1
					)
					.map(n -> n * n)
					.collect(Collectors.toList());
	}
	
	public static int last(List<Integer> numbers) {
		
		return numbers
				.stream()
					.reduce((first, second) -> second)
					.orElseThrow(NoSuchElementException::new);
	}
	
	public static int average(List<Integer> numbers) {
		
		return (int) numbers
				.stream()
					.mapToDouble(Integer::doubleValue)
					.average()
					.orElse(0);
	}
	
	public static int sum(List<Integer> numbers) {
		
		return numbers
				.stream()
					.filter(n -> n % 2 == 0)
					.mapToInt(Integer::intValue)
					.reduce(0, Integer::sum);
	}
}
