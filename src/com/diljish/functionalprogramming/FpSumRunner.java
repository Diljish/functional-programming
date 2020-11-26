package com.diljish.functionalprogramming;

import java.util.List;

public class FpSumRunner {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(2,4,1,45,65,33,6,7);
		int sum = numbers.stream().reduce(0,(number1,number2)-> number1+number2);
		System.out.println(numbers);
		
	}

}
