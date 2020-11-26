package com.diljish.functionalprogramming;

import java.util.List;

public class FpIntermediateRunner {

	public static void main(String[] args) {

		List<Integer> list = List.of(2,5,7,8,33,1,4,12,34,47);
		list.stream().sorted().forEach(x -> System.out.println(x));
		list.stream().distinct().forEach(x -> System.out.println(x));
		list.stream().map(x-> x*x).forEach(x -> System.out.println(x));
	}

}
