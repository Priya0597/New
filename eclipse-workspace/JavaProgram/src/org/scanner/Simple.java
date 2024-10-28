package org.scanner;

import java.util.LinkedHashSet;
import java.util.Set;

public class Simple {
	public static void main(String[] args) {
		String s="java programming";
		Set<Character>set=new LinkedHashSet();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		for (Character c : set) {
			System.out.print(c);
			
		}
	}
	
	}



