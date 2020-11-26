package com.diljish.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

public class FpMaxRunner {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(2,23,54,57);
		numbers.stream().max((n1,n2) ->Integer.compare(n1, n2)).get();
		numbers.stream().min((n1,n2) ->Integer.compare(n1, n2)).get();
		List<Integer> filteredList = numbers.stream().filter(x -> x%2 ==1).collect(Collectors.toList());
	}

}
