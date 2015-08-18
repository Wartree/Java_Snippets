package com.wartree.krieghb.String;

import java.lang.StringBuilder;

public class String_Builder {
	
	public StringBuilder myStringBuilder = new StringBuilder();
	
	public String_Builder() {
		
		myStringBuilder.insert(0,"Hi There Everybody!");
		
	}
	
	public void Print_StringBuilder() {

		System.out.println("String Builder:  " + myStringBuilder.toString());
		
		System.out.println("Size of String Builder:  " + myStringBuilder.length());
	}

}
