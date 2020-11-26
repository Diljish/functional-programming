package com.diljish.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {
	
	public static void print(Integer s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		List.of("Ant" , "Cat","Bat" ,"Elephent").stream().map(x->x.length()).forEach(x -> System.out.println(x));
		List.of("Ant" , "Cat","Bat" ,"Elephent").stream()
		.map(String::length).forEach(MethodReferencesRunner::print);
		
		
	}

}
