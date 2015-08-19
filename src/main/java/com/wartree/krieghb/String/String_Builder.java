package com.wartree.krieghb.String;

import java.lang.StringBuilder;

public class String_Builder {
	
	public StringBuilder myStringBuilder = new StringBuilder();
	
	public String_Builder() {
		
		myStringBuilder.insert(0,"Hi There Everybody!");
		Modify_String(myStringBuilder);
		
	}
	
	public void Print_StringBuilder() {

		System.out.println("String Builder:  " + myStringBuilder.toString());
		
		System.out.println("Size of String Builder:  " + myStringBuilder.length());
	}
	
	public void Modify_String(StringBuilder changeString) {
		
		changeString.replace(0, changeString.length(), "The string was changed");
		
		
	}

}
