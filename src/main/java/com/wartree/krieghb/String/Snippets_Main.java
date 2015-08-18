package com.wartree.krieghb.String;

import com.wartree.krieghb.String.String_Basic;
import com.wartree.krieghb.String.String_Builder;

public class Snippets_Main {

	public static void main(String[] args) {

		//  Basic Sring class usage
		String_Basic SB_A = new String_Basic();

		SB_A.Print_String();
		
		System.out.println("Size of string: " + SB_A.String_Length());
		
		
		
		String_Builder StrBld_A = new String_Builder();
		
		System.out.println("String Builder:  " + StrBld_A.myStringBuilder.toString());
	}

}
