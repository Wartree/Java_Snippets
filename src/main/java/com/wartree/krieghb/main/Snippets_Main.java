package com.wartree.krieghb.main;


import com.wartree.krieghb.utilities.Enum_Numbers;
import com.wartree.krieghb.String.String_Basic;
import com.wartree.krieghb.String.String_Builder;
import com.wartree.krieghb.database.Main_jdbc;

public class Snippets_Main {

	public static void main(String[] args) {

		//  Basic Sring class usage
		String_Basic SB_A = new String_Basic();
		SB_A.executeBasicTest();
		
		
		
		String_Builder StrBld_A = new String_Builder();
		StrBld_A.executeSBTest();
		
		
		Enum_Numbers num = Enum_Numbers.ONE;
		
		System.out.println("ENUM:  " + num.getValue());
		System.out.println("Enum basic: " + Enum_Numbers.TWO.getValue());
		
		
		
		Main_jdbc mainConnection = new Main_jdbc();
		try {
			mainConnection.readDataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
