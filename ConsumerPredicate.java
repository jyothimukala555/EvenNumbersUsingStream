package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsumerPredicate {
	
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
		
		Predicate<Integer> pre = n -> n%2!=0; 
		Consumer<Integer> con = System.out::println;
	
		list = list.stream().filter(pre).collect(Collectors.toList());
		list.forEach(con);
		
	}

}
