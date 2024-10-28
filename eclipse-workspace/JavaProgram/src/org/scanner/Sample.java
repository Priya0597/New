package org.scanner;

public class Sample {
	public static void main(String[] args) {
		String a="Raja456priya";
		String c = a.replaceAll("[0123456789]", "");
		System.out.println("After removing numbers from String: "+c);
	}

}
