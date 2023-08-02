package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersUsingStreams {
	
	public static void main (String [] args) {
	
		List <Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		
	
		list.stream().filter(n -> n%2==0).collect(Collectors.toList()).forEach(System.out::println);
		
	}
	
}
