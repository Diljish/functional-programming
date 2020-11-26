package com.diljish.functionalprogramming;

import java.util.List;

public class Filtering {

	public static void main(String[] args) {
		List<String> list = List.of("Apple","Bat","Cat","Bird");
		
		basic(list);
		functionalProgrammingWithFilter(list);

	}

	private static void basic(List<String> list) {
		for(String string: list) {
			if(string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	
	private static void functionalProgrammingWithFilter(List<String> list) {
		list.stream().filter(
				x-> x.endsWith("at")).forEach(
						x->System.out.println(x));
		
	}

}
