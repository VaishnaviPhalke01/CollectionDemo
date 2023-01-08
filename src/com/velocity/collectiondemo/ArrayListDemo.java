package com.velocity.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		list.add("Delhi");
		list.add("Mumbai");
		list.add("pune");
		list.add("shevgaon");
		//System.out.println(list);
	for( String s:list) {
		System.out.println(s);
	}

	}}
