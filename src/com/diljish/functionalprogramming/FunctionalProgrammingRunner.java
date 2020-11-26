package com.diljish.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		List<String> list = List.of("Apple", "Bat","Cat","Dog");
		
		printBasic(list);
		printBasicFunctionalProgramming(list);
	}

	private static void printBasic(List<String> list) {
		for(String string: list) {
			System.out.println(string);
		}
	}
	private static void printBasicFunctionalProgramming(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

}
