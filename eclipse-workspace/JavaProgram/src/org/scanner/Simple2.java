package org.scanner;

import java.util.HashMap;

public class Simple2 {
	public static void main(String[] args) {
		String s="Learn Java Learn Selenium Learn API";
		HashMap<String, Integer>map=new HashMap<>();
		String[] sp = s.split(" ");
		for (String st : sp) {
			if (map.containsKey(st)) {
				map.put(st, map.get(st)+1);
				
			}else {
				map.put(st, 1);
			}
			
		}
		System.out.println(map);
	}
}
