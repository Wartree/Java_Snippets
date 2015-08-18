package com.wartree.krieghb.String;

import java.lang.String;

public class String_Basic {
	
	String stringA;
	
	public String_Basic() {
		
		stringA = "String A";
		
		
	}

	
	
	public void Print_String() {
		
		System.out.println("String:  " + stringA); // Display the string.
		System.out.println("Length of String:  " + String_Length());
	}
	
	
	public int String_Length() {
		int stringLength;
		
		stringLength = stringA.length();
		
		return stringLength;
	}
}
