package org.scanner;

import java.lang.String;

public class Programs {
	
	public static void main(String[] args) {
		java.lang.String s="java programming";
		String space="";
		String[] a = s.split(" ");//split the string into two and store in a[]
		for (int i = 0; i < a.length; i++) {
			char c = a[i].charAt(0);//get first character from each word
			String c1=String.valueOf(c).toUpperCase();//convert character into string and change the first character to uppercase
			String sub=a[i].substring(1);//get substring from index 1
			space=space+c1+sub+" ";//add uppercase to substring 
		}
		System.out.println(space.trim());//to avoid the space after string
			
		}
	}

//java
//0123
//i=0        i<a.length        
//i=0        0<4              j       J        ava         0=0+J+a+" "    i=1
//i=1        1<4                                           0=Ja+v+" "     i=2
//i=2        2<4                                           0=Jav+a+" "    i=3
//i=3        3<4                                           0=Java+" "     i=4
//i=4        false                    now it trims the extra space after string

