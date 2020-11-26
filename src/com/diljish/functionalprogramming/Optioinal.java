package com.diljish.functionalprogramming;

import java.util.List;

public class Optioinal {

	public static void main(String[] args) {

		List.of(1,2,3,4,5,6,7,8,9).stream().filter(x-> x%2 ==0).max((n1,n2) -> Integer.compare(n1, n2)).get();

	}

}
